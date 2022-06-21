package jp.co.futureantiques.webapptraining.repository.specification;

import jp.co.futureantiques.webapptraining.model.Music;
import jp.co.futureantiques.webapptraining.model.form.MusicSearchForm;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.validation.constraints.NotNull;

/**
 * @author Created by YaoHaitao on 2018/3/16.
 * @since 2018-03-16 12:59
 */
public class MusicSpecification {

    public static Specification<Music> generateMusicSpecification(MusicSearchForm form) {
        return new Specification<Music>() {
            @Override
            public Predicate toPredicate(Root<Music> root, CriteriaQuery<?> query, CriteriaBuilder cb) {

                Predicate condition = null;

                if (form.getId() != null) {
                    Predicate newCondition = cb.equal(root.get("id"), form.getId());
                    condition = getPredicate(cb, condition, newCondition);
                }

                if (!StringUtils.isEmpty(form.getTitle())) {
                    Predicate newCondition = cb.like(root.get("title"), "%"+form.getTitle()+"%");
                    condition = getPredicate(cb, condition, newCondition);
                }

                if (!StringUtils.isEmpty(form.getAuthor())) {
                    Predicate newCondition = cb.and(
                            cb.like(root.get("author"), "%"+form.getAuthor()+"%"),
                            cb.notEqual(root.get("author"), "unknown")
                    );
                    condition = getPredicate(cb, condition, newCondition);
                }

                if (form.getRating() != null) {
                    Predicate newCondition = cb.ge(root.get("rating"), form.getRating());
                    condition = getPredicate(cb, condition, newCondition);
                }

                if (form.getCategoryId() != null && form.getCategoryId() != 0) {
                    Predicate newCondition = cb.equal(root.get("categoryId"), form.getCategoryId());
                    condition = getPredicate(cb, condition, newCondition);
                }

                return condition;
            }

            private Predicate getPredicate(CriteriaBuilder cb, Predicate condition,@NotNull Predicate newCondition) {
                if (condition != null) {
                    condition = cb.and(condition, newCondition);
                } else {
                    condition = newCondition;
                }
                return condition;
            }
        };
    }
}
