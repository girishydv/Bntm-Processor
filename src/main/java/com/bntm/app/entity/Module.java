package com.bntm.app.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the modules database table.
 * 
 */
@Entity
@Table(name="modules")
@NamedQuery(name="Module.findAll", query="SELECT m FROM Module m")
public class Module implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String name;

	//bi-directional many-to-one association to Merchantmodulemapping
	@OneToMany(mappedBy="module")
	private Set<Merchantmodulemapping> merchantmodulemappings;

	public Module() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Merchantmodulemapping> getMerchantmodulemappings() {
		return this.merchantmodulemappings;
	}

	public void setMerchantmodulemappings(Set<Merchantmodulemapping> merchantmodulemappings) {
		this.merchantmodulemappings = merchantmodulemappings;
	}

	public Merchantmodulemapping addMerchantmodulemapping(Merchantmodulemapping merchantmodulemapping) {
		getMerchantmodulemappings().add(merchantmodulemapping);
		merchantmodulemapping.setModule(this);

		return merchantmodulemapping;
	}

	public Merchantmodulemapping removeMerchantmodulemapping(Merchantmodulemapping merchantmodulemapping) {
		getMerchantmodulemappings().remove(merchantmodulemapping);
		merchantmodulemapping.setModule(null);

		return merchantmodulemapping;
	}

}