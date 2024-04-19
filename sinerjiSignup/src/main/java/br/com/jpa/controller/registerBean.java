package br.com.jpa.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.jpa.model.register;

@Named("bean")

@SessionScoped

public class registerBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private register register;
	
	private List<register> pessoas = new ArrayList<register>();
	
	public String adicionar() {
		registers.add(register);
		limpar();
		return "paginas/Sucesso";
	}
	
	private void limpar() {
		this.register = new register();
	}

	public Register getRegisterBean() {
		return register;
	}

	public void setRegister(register register) {
		this.register = register;
	}

	public List<registerBean> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<register> pessoas) {
		this.pessoas = pessoas;
	}
	
	
}