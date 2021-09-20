package com.devsuperior.dsdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdelivery.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>
{

}
