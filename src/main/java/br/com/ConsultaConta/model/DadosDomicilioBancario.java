package br.com.ConsultaConta.model;

import java.io.Serializable;

public class DadosDomicilioBancario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codigoBanco;
	private int numeroAgencia;
	private String numeroContaCorrente;

	
	// Getters and Setters
	
	public int getCodigoBanco() {
		return codigoBanco;
	}
	public void setCodigoBanco(int codigoBanco) {
		this.codigoBanco = codigoBanco;
	}
	public int getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}
	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}
}
