package com.devsuperior.dsdelivery.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsdelivery.dto.PedidoDTO;
import com.devsuperior.dsdelivery.entities.Pedido;
import com.devsuperior.dsdelivery.repositories.PedidoRepository;

@Service
public class PedidoService
{
	@Autowired
	private PedidoRepository repository;

	@Transactional(readOnly = true)
	public List<PedidoDTO> findAll()
	{
		List<Pedido> list = repository.findAll();
		
		return list.stream().map(x -> new PedidoDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public List<PedidoDTO> findAllPendentes()
	{
		List<Pedido> list = repository.findPedidosWithProdutos();
		
		return list.stream().map(x -> new PedidoDTO(x)).collect(Collectors.toList());
	}

}
