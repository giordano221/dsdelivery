package com.devsuperior.dsdelivery.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsdelivery.dto.ProdutoDTO;
import com.devsuperior.dsdelivery.entities.Produto;
import com.devsuperior.dsdelivery.repositories.ProdutoRepository;

@Service
public class ProdutoService
{
	@Autowired
	private ProdutoRepository repository;

	@Transactional(readOnly = true)
	public List<ProdutoDTO> findAll()
	{
		List<Produto> list = repository.findAllByOrderByNomeAsc();
		
		return list.stream().map(x -> new ProdutoDTO(x)).collect(Collectors.toList());
	}

}
