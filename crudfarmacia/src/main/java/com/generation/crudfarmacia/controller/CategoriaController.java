package com.generation.crudfarmacia.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.crudfarmacia.model.Categoria;
import com.generation.crudfarmacia.repository.CategoriaRepository;


@RestController
@RequestMapping("/categorias")
@CrossOrigin (origins = "*", allowedHeaders = "*")

public class CategoriaController {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	// LISTAR TODAS AS CATEGORIAS
	@GetMapping
	public ResponseEntity<List<Categoria>> getAll() {
		return ResponseEntity.ok(categoriaRepository.findAll());
	
	}
}
