package com.poscodx.repository;

import com.poscodx.entity.ExchangeRateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRateEntity, Long> {
    // You can add custom query methods if needed
}
