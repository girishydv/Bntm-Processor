package com.bntm.app.entity;

import java.io.*;

import javax.persistence.*;


/** The persistent class for the timesheetconfiguration database table. */
@Entity
@Table(name = "timesheetconfiguration")
@NamedQuery(
  name = "Timesheetconfiguration.findAll",
  query = "SELECT t FROM Timesheetconfiguration t"
)
public class Timesheetconfiguration implements Serializable {
	private static final long serialVersionUID = 1L;
	
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

	private byte paymentSMS;

	private byte punchInSMS;

	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="ClientId")
	private Client client;

	//bi-directional many-to-one association to Merchant
	@ManyToOne
	@JoinColumn(name="MerchantId")
	private Merchant merchant;

	public Timesheetconfiguration() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getPaymentSMS() {
		return this.paymentSMS;
	}

	public void setPaymentSMS(byte paymentSMS) {
		this.paymentSMS = paymentSMS;
	}

	public byte getPunchInSMS() {
		return this.punchInSMS;
	}

	public void setPunchInSMS(byte punchInSMS) {
		this.punchInSMS = punchInSMS;
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