package com.arthurandrade.maladireta;

import com.arthurandrade.contato.Contatos;
import com.arthurandrade.contato.ContatosCSV;

public class MalaDiretaCSV extends MalaDireta {

	private String nomeArquivo;
	
	public MalaDiretaCSV(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	
	@Override
	protected Contatos criarContatos() {
		return new ContatosCSV(nomeArquivo);
	}

}
