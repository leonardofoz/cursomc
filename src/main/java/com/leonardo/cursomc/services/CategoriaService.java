package com.leonardo.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.cursomc.domain.Categoria;
import com.leonardo.cursomc.repositories.CategoriaRepository;
import com.leonardo.cursomc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto nao encontrado! Id:" + id + 
					", Tipo: " + Categoria.class.getName()) ;
		}
		
		return obj;
	}
}
