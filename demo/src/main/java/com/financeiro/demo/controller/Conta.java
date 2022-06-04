package com.financeiro.demo.controller;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@ResponseBody
@RequestMapping("/conta")
@Entity
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private String titular;


	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public boolean deposita(double valor) {
		this.saldo = this.saldo + valor;
		return true;
	};

	public boolean saca(double numero) {
			if(this.saldo >= numero) {
				this.saldo -= numero;
				return true;
			}else {
				return false;
			}
		}
}