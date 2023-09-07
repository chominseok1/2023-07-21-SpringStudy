package com.sist.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sist.web.entity.SeoulEntity;

@Repository
public interface SeoulLocationDAO extends JpaRepository<SeoulEntity, Integer> {

}
