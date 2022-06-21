package jp.co.futureantiques.webapptraining.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.sql.Timestamp;

/**
 * @author Created by YaoHaitao on 2018/3/15.
 * @since 2018-03-15 14:52
 */

@Data
@Entity
@Table(name = "music")
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String author;

    private Integer rating;

    @Size(max = 255)
    private String comment;

    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "video_url")
    private String videoURL;

    @Column(name = "create_date", updatable = false)
    private Timestamp createDate;

    @Column(name = "update_date")
    private Timestamp updateDate;

    @Version
    private Integer version;

    @ManyToOne(targetEntity = MusicCategory.class)
    @JoinColumn(name = "category_id", referencedColumnName = "id", insertable = false, updatable = false)
    private MusicCategory category;
}
