package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.cadastroTraduzir;
@Repository

public interface traduzirRepository extends JpaRepository<cadastroTraduzir, Long> {
    List<cadastroTraduzir> findByAtivo(boolean ativo);
} 
