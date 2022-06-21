package jp.co.futureantiques.webapptraining.model.form;

import java.sql.Timestamp;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import jp.co.futureantiques.webapptraining.model.Music;
import lombok.Data;

/**
 * @author Created by YaoHaitao on 2018/3/16.
 * @since 2018-03-16 16:29
 */

@Data
public class MusicOperateForm {

	private Long id;

	@NotBlank(message = "music.text.error.NotBlank.title")
	private String title;

	private String author;

	private Integer rating;

	@NotNull
	private Long categoryId;

	private String comment;

	private String videoURL;

	private boolean insert;

	public void initWithMusic(Music music) {
		this.setId(music.getId());
		this.setTitle(music.getTitle());
		this.setAuthor(music.getAuthor());
		this.setRating(music.getRating());
		this.setCategoryId(music.getCategoryId());
		this.setComment(music.getComment());
		this.setVideoURL(music.getVideoURL());
	}

	public Music convertToMusic() {
		Music music = new Music();
		music.setTitle(this.getTitle());
		music.setAuthor(this.getAuthor());
		music.setRating(this.getRating());
		music.setCategoryId(this.getCategoryId());
		music.setComment(this.getComment());
		music.setVideoURL(this.getVideoURL());
		music.setCreateDate(new Timestamp(new Date().getTime()));
		music.setUpdateDate(music.getCreateDate());
		return music;
	}
}
