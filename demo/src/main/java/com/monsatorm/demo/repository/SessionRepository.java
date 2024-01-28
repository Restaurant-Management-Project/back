package com.monsatorm.demo.repository;

import com.monsatorm.demo.model.dbo.SessionDbo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

@Repository
public interface SessionRepository extends JpaRepository<SessionDbo, Integer> {
//    @Modifying
//    @Transactional
    @Query("SELECT addupdatesession(:sessionId, :tableId, :orderId, :expirationTime)")
    void test(
            @Param("sessionId") String sessionId,
            @Param("tableId") Integer tableId,
            @Param("orderId") Integer orderId,
            @Param("expirationTime") Timestamp expirationTime
    );
}