package com.monsatorm.demo.controller;

import com.monsatorm.demo.model.dto.request.SessionOddUpdateRequestDto;
import com.monsatorm.demo.service.SessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/session")
@RequiredArgsConstructor
@CrossOrigin("*")
public class SessionController {
    private final SessionService sessionService;

    @GetMapping("/check-session-expiration/{sessionId}")
    public Boolean createRequest(@PathVariable("sessionId") String sessionId) {
        return sessionService.checkSessionExpiration(sessionId);
    }

    @PutMapping("/add-update-session")
    public void createRequest(@RequestBody SessionOddUpdateRequestDto sessionRequestDto) {
        sessionService.updateSessionTimeOrAddSession(sessionRequestDto);
    }

}
