package com.oujan.SpringTest.Entitys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id @GeneratedValue
	private Long idCustmer;
	
	private String nom;
	private String mail;
	
	public Customer(Long idCustmer, String nom, String mail) {
		super();
		this.idCustmer = idCustmer;
		this.nom = nom;
		this.mail = mail;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdCustmer() {
		return idCustmer;
	}
	public void setIdCustmer(Long idCustmer) {
		this.idCustmer = idCustmer;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
}
