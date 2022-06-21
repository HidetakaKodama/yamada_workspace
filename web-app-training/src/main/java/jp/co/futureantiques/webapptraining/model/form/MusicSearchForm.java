package jp.co.futureantiques.webapptraining.model.form;

import jp.co.futureantiques.webapptraining.model.Music;
import lombok.Data;

/**
 * @author Created by YaoHaitao on 2018/3/15.
 * @since 2018-03-15 16:45
 */
@Data
public class MusicSearchForm {

    private Long id;

    private String title;

    private String author;

    private Integer rating;

    private Long categoryId;

    public void setValues(Music music) {
        this.setId(music.getId());
        this.setTitle(music.getTitle());
        this.setAuthor(music.getAuthor());
        this.setRating(music.getRating());
        this.setCategoryId(music.getCategoryId());
    }
}
