package com.bntm.app.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the clients database table.
 * 
 */
@Entity
@Table(name="clients")
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String address;

	@Temporal(TemporalType.DATE)
	private Date dueDate;

	private String emailId;

	private String firstName;

	private String lastName;

	private String mobile;

	//bi-directional many-to-one association to Billingconfiguration
	@OneToMany(mappedBy="client")
	private Set<Billingconfiguration> billingconfigurations;

	//bi-directional many-to-one association to Paymenthistory
	@OneToMany(mappedBy="client")
	private Set<Paymenthistory> paymenthistories;

	//bi-directional many-to-one association to Timesheet
	@OneToMany(mappedBy="client")
	private Set<Timesheet> timesheets;

	//bi-directional many-to-one association to Timesheetconfiguration
	@OneToMany(mappedBy="client")
	private Set<Timesheetconfiguration> timesheetconfigurations;

	public Client() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Set<Billingconfiguration> getBillingconfigurations() {
		return this.billingconfigurations;
	}

	public void setBillingconfigurations(Set<Billingconfiguration> billingconfigurations) {
		this.billingconfigurations = billingconfigurations;
	}

	public Billingconfiguration addBillingconfiguration(Billingconfiguration billingconfiguration) {
		getBillingconfigurations().add(billingconfiguration);
		billingconfiguration.setClient(this);

		return billingconfiguration;
	}

	public Billingconfiguration removeBillingconfiguration(Billingconfiguration billingconfiguration) {
		getBillingconfigurations().remove(billingconfiguration);
		billingconfiguration.setClient(null);

		return billingconfiguration;
	}

	public Set<Paymenthistory> getPaymenthistories() {
		return this.paymenthistories;
	}

	public void setPaymenthistories(Set<Paymenthistory> paymenthistories) {
		this.paymenthistories = paymenthistories;
	}

	public Paymenthistory addPaymenthistory(Paymenthistory paymenthistory) {
		getPaymenthistories().add(paymenthistory);
		paymenthistory.setClient(this);

		return paymenthistory;
	}

	public Paymenthistory removePaymenthistory(Paymenthistory paymenthistory) {
		getPaymenthistories().remove(paymenthistory);
		paymenthistory.setClient(null);

		return paymenthistory;
	}

	public Set<Timesheet> getTimesheets() {
		return this.timesheets;
	}

	public void setTimesheets(Set<Timesheet> timesheets) {
		this.timesheets = timesheets;
	}

	public Timesheet addTimesheet(Timesheet timesheet) {
		getTimesheets().add(timesheet);
		timesheet.setClient(this);

		return timesheet;
	}

	public Timesheet removeTimesheet(Timesheet timesheet) {
		getTimesheets().remove(timesheet);
		timesheet.setClient(null);

		return timesheet;
	}

	public Set<Timesheetconfiguration> getTimesheetconfigurations() {
		return this.timesheetconfigurations;
	}

	public void setTimesheetconfigurations(Set<Timesheetconfiguration> timesheetconfigurations) {
		this.timesheetconfigurations = timesheetconfigurations;
	}

	public Timesheetconfiguration addTimesheetconfiguration(Timesheetconfiguration timesheetconfiguration) {
		getTimesheetconfigurations().add(timesheetconfiguration);
		timesheetconfiguration.setClient(this);

		return timesheetconfiguration;
	}

	public Timesheetconfiguration removeTimesheetconfiguration(Timesheetconfiguration timesheetconfiguration) {
		getTimesheetconfigurations().remove(timesheetconfiguration);
		timesheetconfiguration.setClient(null);

		return timesheetconfiguration;
	}

}