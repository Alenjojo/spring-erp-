package com.boot.hr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.hr.model.Section;

public interface SectionRepo extends JpaRepository<Section, Long> {

}
