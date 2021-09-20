package com.devsuperior.dsdelivery.dto;

import java.io.Serializable;

import com.devsuperior.dsdelivery.entities.Produto;

public class ProdutoDTO implements Serializable
{

	private static final long serialVersionUID = 1L;

	private Long id;

	private String nome;
	private String preco;
	private String descricao;
	private String imagemUri;

	public ProdutoDTO()
	{

	}

	public ProdutoDTO(Produto entity)
	{
		super();
		id = entity.getId();
		nome = entity.getNome();
		preco = entity.getPreco();
		descricao = entity.getDescricao();
		imagemUri = entity.getImagemUri();
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

}
