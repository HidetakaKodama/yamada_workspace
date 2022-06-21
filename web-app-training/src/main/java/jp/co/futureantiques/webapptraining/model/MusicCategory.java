package jp.co.futureantiques.webapptraining.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author Created by YaoHaitao on 2018/3/15.
 * @since 2018-03-15 14:52
 */
@Data
@Entity
@Table(name = "music_category")
public class MusicCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "create_date", updatable = false)
    private Timestamp createDate;

    @Column(name = "update_date")
    private Timestamp updateDate;

    @Version
    private Integer version;

    @Transient
    @OneToMany(targetEntity = Music.class, mappedBy = "music_category")
    @JoinColumn(name = "id", referencedColumnName = "category_id")
    private List<Music> musicList;
}
