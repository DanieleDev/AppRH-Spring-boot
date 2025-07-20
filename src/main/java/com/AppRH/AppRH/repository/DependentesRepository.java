package com.AppRH.AppRH.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.AppRH.AppRH.models.Funcionario;
import com.AppRH.AppRH.models.Dependentes;


public interface DependentesRepository extends CrudRepository<Dependentes, String>{
	
	Iterable<Dependentes> findByFuncionario(Funcionario funcionario);

	//pensanco no metodo delete 
	Dependentes findByCpf(String cpf);
	Dependentes findById(long id);
	
	//criando para implementar
	List<Dependentes> findByNome(String nome);
	
	
	
}
