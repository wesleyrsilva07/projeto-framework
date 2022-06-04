package com.financeiro.demo.teste;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.financeiro.demo.controller.Conta;

@RequestMapping("/teste")

public class TesteConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(111, 222);
		primeiraConta.setSaldo(200);
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.setSaldo(primeiraConta.getSaldo() + 100);
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta(222, 111);
		segundaConta.setSaldo(50);
		
	}
}
