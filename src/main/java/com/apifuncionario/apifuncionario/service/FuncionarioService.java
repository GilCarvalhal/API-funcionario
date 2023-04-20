package com.apifuncionario.apifuncionario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apifuncionario.apifuncionario.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

  @Autowired
  private FuncionarioRepository funcionarioRepository;
}
