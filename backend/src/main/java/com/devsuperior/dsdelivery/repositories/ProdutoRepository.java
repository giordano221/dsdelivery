package com.devsuperior.dsdelivery.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdelivery.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>
{
	List<Produto> findAllByOrderByNomeAsc();
}
