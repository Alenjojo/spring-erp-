package com.boot.accounting.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.accounting.model.TransDetailAcc;

public interface TransDetailAccRepo extends JpaRepository<TransDetailAcc, Long> {

}
