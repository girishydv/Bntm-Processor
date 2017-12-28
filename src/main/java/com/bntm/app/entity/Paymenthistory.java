package com.bntm.app.entity;

import java.io.*;
import java.util.*;

import javax.persistence.*;


/** The persistent class for the paymenthistory database table. */
@Entity
@Table(name = "paymenthistory")
@NamedQuery(name = "Paymenthistory.findAll", query = "SELECT p FROM Paymenthistory p")
public class Paymenthistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.DATE)
	private Date dueDate;

	private int paymentAmount;

	@Temporal(TemporalType.DATE)
	private Date paymentDate;

	private String receivedBy;

	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="ClientId")
	private Client client;

	//bi-directional many-to-one association to Merchant
	@ManyToOne
	@JoinColumn(name="MerchantId")
	private Merchant merchant;

	public Paymenthistory() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public int getPaymentAmount() {
		return this.paymentAmount;
	}

	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getReceivedBy() {
		return this.receivedBy;
	}

	public void setReceivedBy(String receivedBy) {
		this.receivedBy = receivedBy;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Merchant getMerchant() {
		return this.merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

}