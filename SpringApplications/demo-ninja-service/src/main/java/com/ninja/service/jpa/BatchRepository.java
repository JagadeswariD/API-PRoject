package com.ninja.service.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ninja.service.entity.Batch;

public interface BatchRepository extends JpaRepository<Batch, Integer>{
	}
