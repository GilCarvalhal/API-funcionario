package com.apifuncionario.apifuncionario.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apifuncionario.apifuncionario.model.Funcionario;
import com.apifuncionario.apifuncionario.service.FuncionarioService;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

  @Autowired
  private FuncionarioService funcionarioService;

  @GetMapping
  public List<Funcionario> obterTodos() {
    return funcionarioService.obterTodos();
  }

  @GetMapping("/{id}")
  public Optional<Funcionario> obterPorId(@PathVariable Integer id) {
    return funcionarioService.obterPorId(id);
  }

  @PostMapping
  public Funcionario adicionar(@RequestBody Funcionario funcionario) {
    return funcionarioService.adicionar(funcionario);
  }

  @DeleteMapping("/{id}")
  public void deletar(@PathVariable Integer id) {
    funcionarioService.deletar(id);
  }

  @PutMapping("/{id}")
  public Funcionario atualizar(
    @RequestBody Funcionario funcionario,
    @PathVariable Integer id
  ) {
    return funcionarioService.atualizar(funcionario, id);
  }
}
