package jp.co.futureantiques.webapptraining.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.futureantiques.webapptraining.model.form.LoginForm;
import jp.co.futureantiques.webapptraining.service.UserService;

/**
 * @author Created by YaoHaitao on 2018/3/13.
 * @since 2018-03-13 15:06
 */

// @Controller アノテーションはあるクラスがコントローラの役目を負うことを示すために使用されます。
@Controller
// @RequestMapping アノテーションは /login のような URL をあるクラスや特定のハンドラ・メソッドにマッピングします。
@RequestMapping("/login")
// URL: localhost:8080/login
public class LoginController {

    private UserService userService;

    // 依存性の注入
    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    // URL: localhost:8080/login
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String showLogin(Model model) {
        LoginForm loginForm = new LoginForm();
        loginForm.setUsername("Spring");
        loginForm.setPassword("Boot");
        model.addAttribute(loginForm);
        return  "login";
    }

    // URL: localhost:8080/login (*post)
    @RequestMapping(value = "", method = RequestMethod.POST)
    public String login(@Validated LoginForm loginForm, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors()) {
            return "login";
        }
        if (!userService.shouldLogin(loginForm)) {
            bindingResult.addError(new ObjectError("invalid","login.error.invalid.login"));
            return "login";
        }
        // リダイレクトの書き方："redirect:" + "URL"
        return "redirect:/menu";
    }
}
