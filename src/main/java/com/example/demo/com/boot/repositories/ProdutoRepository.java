package com.example.demo.com.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.com.boot.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
