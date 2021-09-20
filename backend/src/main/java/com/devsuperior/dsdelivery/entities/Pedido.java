package com.devsuperior.dsdelivery.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.devsuperior.dsdelivery.enums.StatusPedido;

@Entity
@Table(name = "tb_pedidos")
public class Pedido implements Serializable
{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String endereco;
	private Double latitude;
	private Double longitude;

	private Instant momento;

	private StatusPedido status;

	@ManyToMany
	@JoinTable(name = "tb_pedido_produto", 
	joinColumns = @JoinColumn(name = "pedido_id"), 
	inverseJoinColumns = @JoinColumn(name = "produto_id"))
	private Set<Produto> produtos = new HashSet<>();

	public Pedido()
	{

	}

	public Pedido(Long id, String endereco, Double latitude, Double longitude, Instant momento, StatusPedido status)
	{
		super();
		this.id = id;
		this.endereco = endereco;
		this.latitude = latitude;
		this.longitude = longitude;
		this.momento = momento;
		this.status = status;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getEndereco()
	{
		return endereco;
	}

	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}

	public Double getLatitude()
	{
		return latitude;
	}

	public void setLatitude(Double latitude)
	{
		this.latitude = latitude;
	}

	public Double getLongitude()
	{
		return longitude;
	}

	public void setLongitude(Double longitude)
	{
		this.longitude = longitude;
	}

	public Instant getMomento()
	{
		return momento;
	}

	public void setMomento(Instant momento)
	{
		this.momento = momento;
	}

	public StatusPedido getStatus()
	{
		return status;
	}

	public void setStatus(StatusPedido status)
	{
		this.status = status;
	}

	public Set<Produto> getProdutos()
	{
		return produtos;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(id, other.id);
	}

}
