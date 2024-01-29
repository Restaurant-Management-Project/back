package com.monsatorm.demo.service;

import org.springframework.boot.web.server.Cookie;

public interface DataValidationService {
    boolean validateCookies(Cookie cookie);

}
