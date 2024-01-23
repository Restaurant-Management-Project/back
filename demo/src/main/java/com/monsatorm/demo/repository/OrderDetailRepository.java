package com.monsatorm.demo.repository;

import com.monsatorm.demo.model.dbo.OrderDetailDbo;
import com.monsatorm.demo.model.projections.OrderDetailDtoP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetailDbo, Long> {
    @Query(value = "SELECT * FROM getorderdetailsfortable(:tableId)", nativeQuery = true)
    List<OrderDetailDtoP> getOrderDetailByTableId(@Param("tableId") Integer tableId);
}