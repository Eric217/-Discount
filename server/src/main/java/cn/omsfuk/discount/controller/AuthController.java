package cn.omsfuk.discount.controller;

import cn.omsfuk.discount.base.Result;
import cn.omsfuk.discount.base.ResultCache;
import cn.omsfuk.discount.service.AuthService;
import cn.omsfuk.discount.util.ObjectUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by omsfuk on 2017/7/17.
 */


@RestController
@RequestMapping("api/")
public class AuthController {

    @Autowired
    private AuthService authService;

    @RequestMapping(value = "user/signIn")
    public Result signIn(String email, String phone, String password) {
        if (ObjectUtil.notNull(email, password)) {
            return authService.loginWithEmail(email, password);
        } else if (ObjectUtil.notNull(phone, password)) {
            return authService.loginWithEmail(phone, password);
        } else {
            return ResultCache.FAILURE;
        }
    }

    @RequestMapping(value = "user/signUp")
    public Result signUp(String email, String phone, String password) {
        if (ObjectUtil.notNull(email, password)) {
            return authService.loginWithEmail(email, password);
        } else if (ObjectUtil.notNull(phone, password)) {
            return authService.loginWithEmail(phone, password);
        } else {
            return ResultCache.FAILURE;
        }
    }
}
