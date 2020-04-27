package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj); 
	//operação responsavel por inserir no banco de dados este objeto que eu enviar como parametro de entrada//*

	void update (Seller obj);
	void deleteById (Integer id);
	Seller findById (Integer id);
	List<Seller> findAll();

	
}
