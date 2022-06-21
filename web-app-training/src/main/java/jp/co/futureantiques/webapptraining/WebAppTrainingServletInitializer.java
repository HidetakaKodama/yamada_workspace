package jp.co.futureantiques.webapptraining;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 詳細：https://qiita.com/NagaokaKenichi/items/3f191aeb6f161101d5f6
 * @author Created by YaoHaitao on 2018/3/14.
 * @since 2018-03-14 14:21
 */
public class WebAppTrainingServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(WebAppTrainingApplication.class);
    }
}
