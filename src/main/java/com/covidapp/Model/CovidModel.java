package com.covidapp.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dbo.coviddata")
public class CovidModel implements Serializable{
	/**
	 * 
	 */
	// -----------------------------Entity Variables----------

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "country")
	private String country;
	@Column(name = "deathratio")
	private String deathratio;
	@Column(name = "recoveryratio")
	private String recoveryratio;
	@Column(name = "totaldeaths")
	private String totaldeaths;
	@Column(name = "totalrecovered")
	private String totalrecovered;
	@Column(name = "totalcases")
	private String totalcases;
	@Column(name = "savedon")
	private String savedon;
	@Column(name = "updatedon")
	private String updatedon;

	// -----------------------------getters setters----------

	public Integer getId() {
		return id;
	}
	public void setId(Integer id2) {
		this.id = id2;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getDeathratio() {
		return deathratio;
	}
	public void setDeathratio(String deathratio) {
		this.deathratio = deathratio;
	}
	public String getRecoveryratio() {
		return recoveryratio;
	}
	public void setRecoveryratio(String recoveryratio) {
		this.recoveryratio = recoveryratio;
	}
	public String getTotaldeaths() {
		return totaldeaths;
	}
	public void setTotaldeaths(String totaldeaths) {
		this.totaldeaths = totaldeaths;
	}
	public String getTotalrecovered() {
		return totalrecovered;
	}
	public void setTotalrecovered(String totalrecovered) {
		this.totalrecovered = totalrecovered;
	}
	public String getTotalcases() {
		return totalcases;
	}
	public void setTotalcases(String totalcases) {
		this.totalcases = totalcases;
	}
	public String getSavedon() {
		return savedon;
	}
	public void setSavedon(String savedon) {
		this.savedon = savedon;
	}
	public String getUpdatedon() {
		return updatedon;
	}
	public void setUpdatedon(String updatedon) {
		this.updatedon = updatedon;
	}

	// -----------------------------Constructor----------
	public CovidModel() {}
	
	public CovidModel(Integer id, String country, String deathratio, String recoveryratio, String totaldeaths,
			String totalrecovered, String totalcases, String savedon, String updatedon) {
		//super();
		this.id = id;
		this.country = country;
		this.deathratio = deathratio;
		this.recoveryratio = recoveryratio;
		this.totaldeaths = totaldeaths;
		this.totalrecovered = totalrecovered;
		this.totalcases = totalcases;
		this.savedon = savedon;
		this.updatedon = updatedon;
	}
	// -----------------------------To String Method----------
	@Override
	public String toString() {
		return "CovidModel [id=" + id + ", country=" + country + ", deathratio=" + deathratio + ", recoveryratio="
				+ recoveryratio + ", totaldeaths=" + totaldeaths + ", totalrecovered=" + totalrecovered
				+ ", totalcases=" + totalcases + ", savedon=" + savedon + ", updatedon=" + updatedon + "]";
	}

	
}
