package com.monsatorm.demo.repository;

import com.monsatorm.demo.model.dbo.RequestDbo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<RequestDbo, Long> {
    @Query("select createrequest(:orderId, :requestTypeId)")
    void createRequest(@Param("orderId") String orderId, @Param("requestTypeId") Integer requestTypeId);

    @Query("select closerequest(:requestId)")
    void closeRequest(@Param("requestId") Integer requestId);
}
