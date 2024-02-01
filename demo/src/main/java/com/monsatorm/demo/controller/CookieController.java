package com.monsatorm.demo.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/session-init")
public class CookieController {

    @GetMapping("/check-cookies")
    public String checkUserCookies(HttpServletRequest request, HttpServletResponse response) {
        Optional<Cookie> sessionIdCookie = Arrays.stream(request.getCookies() != null ? request.getCookies() : new Cookie[0])
                .filter(cookie -> "sessionId".equals(cookie.getName()))
                .findFirst();

        if (sessionIdCookie.isPresent()) {
            return "Existing sessionId cookie value: " + sessionIdCookie.get().getValue();
            //todo SQL Procedure to compare TimeStamp for expiration
        } else {
            String neSessionId = UUID.randomUUID().toString();
            Cookie cookie = new Cookie("sessionId", neSessionId);
            cookie.setHttpOnly(true);
            cookie.setPath("/session-id");
            response.addCookie(cookie);
            return "New sessionId cookie set with value: " + neSessionId;
        }
    }
}
