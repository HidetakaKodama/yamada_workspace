package jp.co.futureantiques.webapptraining.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.futureantiques.webapptraining.model.Music;
import jp.co.futureantiques.webapptraining.model.MusicCategory;
import jp.co.futureantiques.webapptraining.model.form.MusicOperateForm;
import jp.co.futureantiques.webapptraining.model.form.MusicSearchForm;
import jp.co.futureantiques.webapptraining.service.MusicService;

/**
 * @author Created by YaoHaitao on 2018/3/15.
 * @since 2018-03-15 12:55
 */

@Controller
@RequestMapping(value = "/music")
// localhost:8080/music
public class MusicController {

	private final MusicService musicService;

	@Autowired
	public MusicController(final MusicService musicService) {
		this.musicService = musicService;
	}

	// 後ろの方法を動く前に、先ずはこの方法を呼び出し、モデルの中に、MusicCategoryのリストをセットする
	@ModelAttribute
	public List<MusicCategory> listMusicCategory() {
		return musicService.listMusicCategory();
	}

	// URL -> localhost:8080/music
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showSearchMusic(@ModelAttribute final MusicSearchForm musicSearchForm) {
		return "music/search";
	}

	// URL -> localhost:8080/music/search?title=&author=&rating=&categoryId=
	// OR -> localhost:8080/music/search?id=
	@RequestMapping(value = "search", method = RequestMethod.GET)
	public String searchMusic(final MusicSearchForm form, final Model model) {
		final List<Music> musicList = musicService.listMusic(form);
		model.addAttribute(musicList);

		return "music/search";
	}

	// URL -> localhost:8080/music/delete?id=
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String deleteMusic(@RequestParam(name = "id") final Long id) {
		musicService.deleteMusicById(id);
		return "redirect:/music?result=delete";
	}
	//endregion

	// URL -> localhost:8080/music/insert
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String showInsertMusic(@ModelAttribute final MusicOperateForm musicOperateForm) {
		musicOperateForm.setInsert(true);

		return "music/operation";
	}

	// URL -> localhost:8080/music/insert (*POST)
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insertMusic(@ModelAttribute @Validated final MusicOperateForm form,
			final BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors()) {
			return "music/operation";
		}

		final Music music = musicService.insertMusic(form);
		return "redirect:/music/search?result=insert&id=" + music.getId();
	}

	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String showUpdateMusic(@RequestParam(name = "id") final Long id,
			@ModelAttribute final MusicOperateForm musicOperateForm) {
		Music music = musicService.getMusic(id);
		musicOperateForm.initWithMusic(music);
		musicOperateForm.setInsert(false);

		return "music/operation";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String updateMusic(@Validated final MusicOperateForm form,
			final BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors()) {
			return "music/operation";
		}
		Music music = musicService.updateMusic(form);
		return "redirect:/music/search?result=update&id=" + music.getId();
	}

	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String showDetail(@RequestParam(value = "id") final Long id,
			final Model model) {
		final Music music = musicService.getMusic(id);
		if (music != null) {
			model.addAttribute(music);
			return "music/detail";
		}
		return "error";
	}
}
