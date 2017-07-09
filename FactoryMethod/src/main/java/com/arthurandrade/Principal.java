package com.arthurandrade;

import com.arthurandrade.maladireta.MalaDireta;
import com.arthurandrade.maladireta.MalaDiretaCSV;
import com.arthurandrade.maladireta.MalaDiretaXML;

public class Principal {
	
	public static void main(String[] args) {
		//MalaDireta malaDireta = new MalaDiretaCSV("contatos.csv");
		MalaDireta malaDireta = new MalaDiretaXML("contatos.xml");
		String mensagem = "teste mensagem";
		
		System.out.println(malaDireta.enviarEmail(mensagem));
	}
}
