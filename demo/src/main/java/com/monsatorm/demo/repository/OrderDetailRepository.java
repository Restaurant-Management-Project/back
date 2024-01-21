package com.monsatorm.demo.repository;

import com.monsatorm.demo.model.dbo.OrderDbo;
import com.monsatorm.demo.model.projections.OrderDetailDtoP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDbo, Long> {
    @Query("SELECT getorderdetailsfortable(:tableId)")
    List<OrderDetailDtoP> getOrderDetailByTableId(@Param("tableId") Integer tableId);
}
