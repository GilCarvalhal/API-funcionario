package com.apifuncionario.apifuncionario.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.apifuncionario.apifuncionario.model.Funcionario;

@Repository
public class FuncionarioRepository {

  private List<Funcionario> funcionario = new ArrayList<Funcionario>();
  
}
