package com.bntm.app.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the packages database table.
 * 
 */
@Entity
@Table(name="packages")
@NamedQuery(name="Package.findAll", query="SELECT p FROM Package p")
public class Package implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String packageName;

	private int paymentFrequency;

	private int price;

	//bi-directional many-to-one association to Merchant
	@ManyToOne
	@JoinColumn(name="MerchantId")
	private Merchant merchant;

	public Package() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPackageName() {
		return this.packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public int getPaymentFrequency() {
		return this.paymentFrequency;
	}

	public void setPaymentFrequency(int paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Merchant getMerchant() {
		return this.merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

}