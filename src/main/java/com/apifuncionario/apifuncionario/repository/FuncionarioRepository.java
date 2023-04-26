package com.apifuncionario.apifuncionario.repository;

import com.apifuncionario.apifuncionario.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository
  extends JpaRepository<Funcionario, Integer> {}
