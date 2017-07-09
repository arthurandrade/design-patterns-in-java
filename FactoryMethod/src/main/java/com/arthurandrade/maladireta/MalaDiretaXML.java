package com.arthurandrade.maladireta;

import com.arthurandrade.contato.Contatos;
import com.arthurandrade.contato.ContatosXML;

public class MalaDiretaXML extends MalaDireta {

	private String nomeArquivo;
	
    public MalaDiretaXML(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
	
	@Override
	protected Contatos criarContatos() {
		return new ContatosXML(nomeArquivo);
	}
	
	
}
