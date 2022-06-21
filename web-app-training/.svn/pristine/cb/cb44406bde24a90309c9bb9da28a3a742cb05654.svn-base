package jp.co.futureantiques.webapptraining.service.impl;

import jp.co.futureantiques.webapptraining.repository.UserRepository;
import jp.co.futureantiques.webapptraining.model.User;
import jp.co.futureantiques.webapptraining.model.form.LoginForm;
import jp.co.futureantiques.webapptraining.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Created by YaoHaitao on 2018/3/14.
 * @since 2018-03-14 11:14
 */
@Service
public class UserServiceDefault implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceDefault(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean shouldLogin(LoginForm loginForm) {
        User user = userRepository.findByUsername(loginForm.getUsername());
        return user != null && user.getPassword().equals(loginForm.getPassword());
    }
}
