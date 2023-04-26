package com.apifuncionario.apifuncionario.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {

  //#region Atributos
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String nomeCompleto;

  private String cpf;

  private String cargo;

  private Double salario;
  //#endregion

  //#region Getters & Setters
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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

  public String getcargo() {
    return cargo;
  }

  public void setcargo(String cargo) {
    this.cargo = cargo;
  }

  public Double getSalario() {
    return salario;
  }

  public void setSalario(Double salario) {
    this.salario = salario;
  }
  //#endregion
}
