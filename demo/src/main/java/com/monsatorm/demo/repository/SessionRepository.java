package com.monsatorm.demo.repository;

import com.monsatorm.demo.model.dbo.SessionDbo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<SessionDbo, Long> {

    @Query("")
    void initSession();

    @Query("")
    void updateSession();

}
