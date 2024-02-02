package com.monsatorm.demo.model.dto.request;

import lombok.*;

import java.sql.Timestamp;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SessionOddUpdateRequestDto {
    private String sessionId;
    private Integer TableId;
    private String orderId;
    private Timestamp expirationTime;
}
