package com.generation.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.blogpessoal.model.Postagen;
import com.generation.blogpessoal.repository.PostagenRepository;

@RestController
@RequestMapping("/postagens")
public class PostagemController {

	@Autowired
	private PostagenRepository postagemRepository;
	
	@GetMapping
	public ResponseEntity<List<Postagen>> getAll(){
		return ResponseEntity.ok(postagemRepository.findAll());
	}
	
}
