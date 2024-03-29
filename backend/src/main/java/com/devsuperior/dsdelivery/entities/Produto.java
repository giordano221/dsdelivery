package com.devsuperior.dsdelivery.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_produtos")
public class Produto implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String preco;
	private String descricao;
	private String imagemUri;

	public Produto()
	{

	}

	public Produto(Long id, String nome, String preco, String descricao, String imagemUri)
	{
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.imagemUri = imagemUri;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getPreco()
	{
		return preco;
	}

	public void setPreco(String preco)
	{
		this.preco = preco;
	}

	public String getDescricao()
	{
		return descricao;
	}

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

	public String getImagemUri()
	{
		return imagemUri;
	}

	public void setImagemUri(String imagemUri)
	{
		this.imagemUri = imagemUri;
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
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}

}
