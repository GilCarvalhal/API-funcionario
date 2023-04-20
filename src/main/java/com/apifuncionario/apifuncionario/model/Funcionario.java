package com.apifuncionario.apifuncionario.model;

public class Funcionario {

  private String id;

  private String nomeCompleto;

  private String cpf;

  private String funcao;

  private Double salario;

  public String getId() {
    return id;
  }

  public String getNomeCompleto() {
    return nomeCompleto;
  }

  public void setNomeCompleto(String nomeCompleto) {
    this.nomeCompleto = nomeCompleto;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getFuncao() {
    return funcao;
  }

  public void setFuncao(String funcao) {
    this.funcao = funcao;
  }

  public Double getSalario() {
    return salario;
  }

  public void setSalario(Double salario) {
    this.salario = salario;
  }
}
