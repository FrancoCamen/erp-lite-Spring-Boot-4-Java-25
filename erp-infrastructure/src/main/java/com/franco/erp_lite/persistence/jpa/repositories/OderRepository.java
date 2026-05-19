package com.franco.erp_lite.persistence.jpa.repositories;

import com.franco.erp_lite.persistence.jpa.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OderRepository extends JpaRepository<OrderEntity, UUID> {
}
