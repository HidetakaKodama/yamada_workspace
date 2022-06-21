package jp.co.futureantiques.webapptraining.service.impl;

import jp.co.futureantiques.webapptraining.model.Music;
import jp.co.futureantiques.webapptraining.model.MusicCategory;
import jp.co.futureantiques.webapptraining.model.form.MusicOperateForm;
import jp.co.futureantiques.webapptraining.model.form.MusicSearchForm;
import jp.co.futureantiques.webapptraining.repository.MusicCategoryRepository;
import jp.co.futureantiques.webapptraining.repository.MusicRepository;
import jp.co.futureantiques.webapptraining.repository.specification.MusicSpecification;
import jp.co.futureantiques.webapptraining.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @author Created by YaoHaitao on 2018/3/16.
 * @since 2018-03-16 09:36
 */

@Service
public class MusicServiceImpl implements MusicService {

    private final MusicRepository musicRepository;
    private final MusicCategoryRepository musicCategoryRepository;

    @Autowired
    public MusicServiceImpl(MusicRepository musicRepository, MusicCategoryRepository musicCategoryRepository) {
        this.musicRepository = musicRepository;
        this.musicCategoryRepository = musicCategoryRepository;
    }

    @Override
    public Music insertMusic(MusicOperateForm form) {
        final Music music = form.convertToMusic();
        return musicRepository.save(music);
    }

    @Override
    public List<MusicCategory> listMusicCategory() {
        return musicCategoryRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
    }

    @Override
    public List<Music> listMusic(MusicSearchForm form) {
        return musicRepository.findAll(MusicSpecification.generateMusicSpecification(form));
    }

    @Override
    public Music getMusic(Long id) {
        return musicRepository.findOne(id);
    }

    @Override
    public Music updateMusic(MusicOperateForm form) {
        Music music = musicRepository.findOne(form.getId());
        if (music != null) {
            updateMusic(form, music);
            return musicRepository.saveAndFlush(music);
        }
        return null;
    }

    private void updateMusic(MusicOperateForm form, Music music) {
        music.setTitle(form.getTitle());
        music.setAuthor(form.getAuthor());
        music.setRating(form.getRating());
        music.setCategoryId(form.getCategoryId());
        music.setComment(form.getComment());
        music.setVideoURL(form.getVideoURL());
        music.setUpdateDate(new Timestamp(new Date().getTime()));
    }

    @Override
    public void deleteMusicById(Long id) {
        musicRepository.delete(id);
    }


}
