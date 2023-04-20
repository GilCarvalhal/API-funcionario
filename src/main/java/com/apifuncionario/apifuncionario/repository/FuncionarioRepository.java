package com.apifuncionario.apifuncionario.repository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.apifuncionario.apifuncionario.model.Funcionario;

@Repository
public class FuncionarioRepository {

  private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
  private Integer idInicial = 0;

  /**
   * Metodo que retorna lista de funcionários
   * @return Retorna lista de funcionários
   */
  public List<Funcionario> obterTodos() {
    return funcionarios;
  }

  /**
   * Metodo que retorna um produto encontrado pelo id
   * @param id do funcionário que será localizado
   * @return Retorna um funcionário que será encontrado
   */
  public Optional<Funcionario> obterPorId(Integer id) {
    return funcionarios.stream().filter(f -> f.getId() == id).findFirst();
  }

  /**
   * Metodo para adicionar um funcionário na lista
   * @param funcionario que será adicionado
   * @return Retorna o funcionário que foi adicionado a lista
   */
  public Funcionario adicionar(Funcionario funcionario) {
    idInicial++;

    funcionario.setId(idInicial);
    funcionarios.add(funcionario);

    return funcionario;
  }

  /**
   * Metodo para deletar o funcionário da lista através do id
   * @param id do funcionário a ser deletado
   */
  public void deletar(Integer id) {
    funcionarios.removeIf(d -> d.getId() == id);
  }

  /**
   * Metodo para atualizar o funcionário da lista através do id
   * @param funcionario a ser atualizado
   * @return Retorna o funcionário após atualizado na lista
   */
  public Funcionario atualizar(Funcionario funcionario) {
    // Achar funcionário
    Optional<Funcionario> acharFuncionario = obterPorId(funcionario.getId());
    if (acharFuncionario.isEmpty()) {
      throw new InputMismatchException("Funcionário não encontrado");
    }
    // Deletar funcionário
    deletar(funcionario.getId());

    // Adicionar funcionário
    funcionarios.add(funcionario);

    return funcionario;
  }
}
