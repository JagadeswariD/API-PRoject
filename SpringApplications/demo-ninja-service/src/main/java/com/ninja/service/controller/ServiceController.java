package com.ninja.service.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninja.service.dto.ProgramRegistration;
import com.ninja.service.entity.Batch;
import com.ninja.service.entity.Programs;
import com.ninja.service.jpa.BatchRepository;
import com.ninja.service.jpa.ProgramRepository;

@RestController
@RequestMapping("/")
public class ServiceController {
	@Autowired
	ProgramRepository program_repository;
	@Autowired
	BatchRepository batch_repository;
	
	@GetMapping("/batch/list")
	List<Batch> getAllBatch()
	{
		return batch_repository.findAll(); 
	}
	@GetMapping("/batch/list/{id}")
	Optional<Batch> getAllBatchByID(@PathVariable Integer id)
	{
		return batch_repository.findById(id); 
	}
	
	@PostMapping("/batch/create")
	Batch createBatch(@RequestBody Batch bt) {
		System.out.println(bt.getBatch_program_id());
		return batch_repository.save(bt);
	}
	
	@DeleteMapping("batch/delete/{id}")
	void deleteBatch(@PathVariable int id) {
		System.out.println("id:"+id);
		System.out.println(batch_repository.existsById(id));
		batch_repository.deleteById(id);
	}
	
	@GetMapping("/program/list")
	List<Programs> getAllPrograms()
	{
		return program_repository.findAll(); 
	}
	
	@PostMapping("/program/create")
	Programs createProgram(@RequestBody Programs program){
		System.out.println("create called");
		program.setCreation_time(java.sql.Timestamp.valueOf(LocalDateTime.now()));
		program.setLast_modified_time(java.sql.Timestamp.valueOf(LocalDateTime.now()));
		 return program_repository.saveAndFlush(program);
	}

	@PutMapping("/program/update")
	void updateProgram(@RequestBody Programs program){
		System.out.println("update called");
		 program_repository.updateProgramRepository(program.getProgram_name(),program.getProgram_status(), program.getProgram_description());
		 
	}
	
	@DeleteMapping("/program/delete/{id}")
	void deleteProgram(@PathVariable Integer id) {
		System.out.println("delete called");
		 program_repository.deleteById(id);
	}
	
}
