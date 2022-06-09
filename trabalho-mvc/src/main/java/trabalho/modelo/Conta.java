package trabalho.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conta implements Serializable {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private double saldo;
	private int agencia;
	private int numero;
	private String titular;
	private TipoDeConta tipodeconta;
	

	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
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
