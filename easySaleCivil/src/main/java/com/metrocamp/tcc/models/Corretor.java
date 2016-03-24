package com.metrocamp.tcc.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Corretor {

	@Entity(name = "esc_corretores")
	public class Corretoras implements Serializable{

		private static final long serialVersionUID = 5747942826652036099L;

		@Id
		@Column(name = "id_corretor", nullable = false)
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idCorretor;
		
		@Column(name = "nome_corretor", nullable = false)
		private String nomeCorretor;
				
		@Column(name = "tel_corretor", nullable = false)
		private String telCorretor;
		
		@Column(name = "registro_corretor", nullable = false)
		private String registroCorretor;
		
		@OneToOne
		@JoinColumn(name = "corretora_associada", referencedColumnName = "cod_corretora", nullable = false)
		private Corretora corretora;

		public Long getIdCorretor() {
			return idCorretor;
		}

		public void setidCorretor(Long idCorretor) {
			this.idCorretor = idCorretor;
		}

		public String getNomeCorretor() {
			return nomeCorretor;
		}

		public void setNomeCorretor(String nomeCorretor) {
			this.nomeCorretor = nomeCorretor;
		}

		public String getTelCorretor() {
			return telCorretor;
		}

		public void setTelCorretor(String telCorretor) {
			this.telCorretor = telCorretor;
		}

		public String getRegistroCorretor() {
			return registroCorretor;
		}

		public void setRegistroCorretor(String registroCorretor) {
			this.registroCorretor = registroCorretor;
		}

		public Corretora getCorretora() {
			return corretora;
		}

		public void setCorretora(Corretora corretora) {
			this.corretora = corretora;
		}	
		
	}
}
