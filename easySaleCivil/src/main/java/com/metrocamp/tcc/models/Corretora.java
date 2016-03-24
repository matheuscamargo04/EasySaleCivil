package com.metrocamp.tcc.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Corretora {

	@Entity(name = "esc_corretoras")
	public class Corretoras implements Serializable{

		private static final long serialVersionUID = -6205736467530609550L;
		
		@Id
		@Column(name = "id_corretora", nullable = false)
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "nome_corretora", nullable = false)
		private String nomeCorretora;
		
		@Column(name = "ender_corretora", nullable = false)
		private String enderCorretora;
		
		@Column(name = "tel_corretora", nullable = false)
		private String telCorretora;
		
	}
}
