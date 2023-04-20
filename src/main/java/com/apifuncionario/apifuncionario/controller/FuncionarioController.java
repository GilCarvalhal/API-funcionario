package com.apifuncionario.apifuncionario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.apifuncionario.apifuncionario.service.FuncionarioService;

@RestController
public class FuncionarioController {

  @Autowired
  private FuncionarioService funcionarioService;
}
