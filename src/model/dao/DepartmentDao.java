package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department obj); 
	//operação responsavel por inserir no banco de dados este objeto que eu enviar como parametro de entrada//*

	void update (Department obj);
	void deleteById (Integer id);
	Department findById (Integer id);
	List<Department> findAll();

}
