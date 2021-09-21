package com.devsuperior.dsdelivery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsdelivery.dto.PedidoDTO;
import com.devsuperior.dsdelivery.services.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController
{
	@Autowired
	private PedidoService service;

	@GetMapping
	public ResponseEntity<List<PedidoDTO>> findAll()
	{
		List<PedidoDTO> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/pendentes")
	public ResponseEntity<List<PedidoDTO>> findAllPendentes()
	{
		List<PedidoDTO> list = service.findAllPendentes();
		
		return ResponseEntity.ok().body(list);
	}
}
