package com.apifuncionario.apifuncionario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apifuncionario.apifuncionario.model.Funcionario;
import com.apifuncionario.apifuncionario.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

  @Autowired
  private FuncionarioRepository funcionarioRepository;

  /**
   * Metodo que retorna lista de funcionários
   * @return Retorna lista de funcionários
   */
  public List<Funcionario> obterTodos() {
    return funcionarioRepository.findAll();
  }

  /**
   * Metodo que retorna um funcionário encontrado pelo id
   * @param id dos funcionários
   * @return Retorna o id dos funcionários
   */
  public Optional<Funcionario> obterPorId(Integer id) {
    return funcionarioRepository.findById(id);
  }

  /**
   * Metodo que retorna o implemento de um novo funcionário
   * @param funcionario que será adicionado
   * @return Retorna um funcionário que foi adicionado
   */
  public Funcionario adicionar(Funcionario funcionario) {
    // Removendo o id para conseguir fazer o cadastro
    funcionario.setId(null);
    return funcionarioRepository.save(funcionario);
  }

  /**
   * Metodo usado para deletar o funcionário através do id
   * @param id do funcionário
   */
  public void deletar(Integer id) {
    (funcionarioRepository).deleteById(id);
  }

  /**
   * Metodo que retorna um funcionário atualizado na lista
   * @param funcionario do funcionário atualizado
   * @param id Digitar o id do funcionário
   * @return Retorna um funcionário após atualizar a lista
   */
  public Funcionario atualizar(Funcionario funcionario, Integer id) {
    funcionario.setId(id);

    return funcionarioRepository.save(funcionario);
  }
}
