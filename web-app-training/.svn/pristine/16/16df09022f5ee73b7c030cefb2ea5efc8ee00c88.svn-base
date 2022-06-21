package jp.co.futureantiques.webapptraining.model.form;

import lombok.Data;

import javax.validation.constraints.Size;

/**
 * @author Created by YaoHaitao on 2018/3/14.
 * @since 2018-03-14 11:07
 */

@Data
public class LoginForm {

    // データの有効性を制約、Controllerで @Validated アノテーションと一緒に使ったらいい
    @Size(min = 6, max = 30, message = "login.error.invalid.username")
    private String username;

    @Size(min = 4, max = 30, message = "login.error.invalid.password")
    private String password;
}
