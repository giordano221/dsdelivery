package com.devsuperior.dsdelivery.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsdelivery.dto.PedidoDTO;
import com.devsuperior.dsdelivery.dto.ProdutoDTO;
import com.devsuperior.dsdelivery.entities.Pedido;
import com.devsuperior.dsdelivery.entities.Produto;
import com.devsuperior.dsdelivery.enums.StatusPedido;
import com.devsuperior.dsdelivery.repositories.PedidoRepository;
import com.devsuperior.dsdelivery.repositories.ProdutoRepository;

@Service
public class PedidoService
{
	@Autowired
	private PedidoRepository repository;
	
	@Autowired
	private ProdutoRepository produtoRepository;

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

	@Transactional
	public PedidoDTO inserir(PedidoDTO dto)
	{
		Pedido pedido = new Pedido(null, dto.getEndereco(), dto.getLatitude(), dto.getLongitude(), Instant.now(), StatusPedido.PENDENTE);
		
		for(ProdutoDTO p : dto.getProdutos())
		{
			Produto produto = produtoRepository.getById(p.getId());
			
			
			pedido.getProdutos().add(produto);
		}
		
		pedido = repository.save(pedido);
		
		return new PedidoDTO(pedido);
	}
	
	@Transactional
	public PedidoDTO setStatusEntrega(Long id)
	{
		Pedido pedido = repository.getById(id);
		
		pedido.setStatus(StatusPedido.ENTREGUE);
		
		pedido = repository.save(pedido);
		
		return new PedidoDTO(pedido);
	}

}
