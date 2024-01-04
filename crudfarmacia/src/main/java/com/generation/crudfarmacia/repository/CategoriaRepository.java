package com.generation.crudfarmacia.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.crudfarmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
