package com.bntm.app.entity;

import java.io.*;
import java.util.*;

import javax.persistence.*;


/** The persistent class for the timesheet database table. */
@Entity
@Table(name = "timesheet")
@NamedQuery(name = "Timesheet.findAll", query = "SELECT t FROM Timesheet t")
public class Timesheet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date punchInTime;

	@Temporal(TemporalType.TIMESTAMP)
	private Date punchOutTime;

	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="ClientId")
	private Client client;

	//bi-directional many-to-one association to Merchant
	@ManyToOne
	@JoinColumn(name="MerchantId")
	private Merchant merchant;

	public Timesheet() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getPunchInTime() {
		return this.punchInTime;
	}

	public void setPunchInTime(Date punchInTime) {
		this.punchInTime = punchInTime;
	}

	public Date getPunchOutTime() {
		return this.punchOutTime;
	}

	public void setPunchOutTime(Date punchOutTime) {
		this.punchOutTime = punchOutTime;
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