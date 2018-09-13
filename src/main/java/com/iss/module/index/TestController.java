package com.iss.module.index;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);

    // 添加一个测试访问接口
    @GetMapping("/user")
    public Authentication getUser(Authentication authentication) {
        logger.info("resource: user {}", authentication);
        return authentication;
    }
}
