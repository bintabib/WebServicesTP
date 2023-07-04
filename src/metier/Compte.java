package metier;


import java.io.Serializable;
import java.util.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long code;
	private double solde;
	
	@XmlTransient
	private Date dateCreation;
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public Compte(Long code, double solde, Date date) {
		super();
		this.code = code;
		this.solde = solde;
		this.dateCreation = date;
	}
	public Compte() {
		super();
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDate() {
		return dateCreation;
	}
	public void setDate(Date date) {
		this.dateCreation = date;
	}
	
	

}
