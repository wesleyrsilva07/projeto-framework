package com.financeiro.demo.controller;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Cliente {
	private String nome;
    private String cpf;
    private String profissao;
    
    @OneToOne
    private Conta conta;
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
    

}
