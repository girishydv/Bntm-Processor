package com.bntm.app.entity;

import java.io.*;
import java.util.*;

import javax.persistence.*;


/**
 * The persistent class for the merchants database table.
 * 
 */
@Entity
@Table(name="merchants")
@NamedQuery(name="Merchant.findAll", query="SELECT m FROM Merchant m")
public class Merchant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String address;

	private String firstName;

	private byte isDeleted;

	private String lastName;

	private String merchantCode;

	private int mobile;

	private byte status;

	//bi-directional many-to-one association to Billingconfiguration
	@OneToMany(mappedBy="merchant")
	private Set<Billingconfiguration> billingconfigurations;

	//bi-directional many-to-one association to Merchantmodulemapping
	@OneToMany(mappedBy="merchant")
	private Set<Merchantmodulemapping> merchantmodulemappings;

	//bi-directional many-to-one association to Package
	@OneToMany(mappedBy="merchant")
	private Set<Package> packages;

	//bi-directional many-to-one association to Paymenthistory
	@OneToMany(mappedBy="merchant")
	private Set<Paymenthistory> paymenthistories;

	//bi-directional many-to-one association to Timesheet
	@OneToMany(mappedBy="merchant")
	private Set<Timesheet> timesheets;

	//bi-directional many-to-one association to Timesheetconfiguration
	@OneToMany(mappedBy="merchant")
	private Set<Timesheetconfiguration> timesheetconfigurations;

	public Merchant() {
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

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public byte getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMerchantCode() {
		return this.merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public int getMobile() {
		return this.mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public Set<Billingconfiguration> getBillingconfigurations() {
		return this.billingconfigurations;
	}

	public void setBillingconfigurations(Set<Billingconfiguration> billingconfigurations) {
		this.billingconfigurations = billingconfigurations;
	}

	public Billingconfiguration addBillingconfiguration(Billingconfiguration billingconfiguration) {
		getBillingconfigurations().add(billingconfiguration);
		billingconfiguration.setMerchant(this);

		return billingconfiguration;
	}

	public Billingconfiguration removeBillingconfiguration(Billingconfiguration billingconfiguration) {
		getBillingconfigurations().remove(billingconfiguration);
		billingconfiguration.setMerchant(null);

		return billingconfiguration;
	}

	public Set<Merchantmodulemapping> getMerchantmodulemappings() {
		return this.merchantmodulemappings;
	}

	public void setMerchantmodulemappings(Set<Merchantmodulemapping> merchantmodulemappings) {
		this.merchantmodulemappings = merchantmodulemappings;
	}

	public Merchantmodulemapping addMerchantmodulemapping(Merchantmodulemapping merchantmodulemapping) {
		getMerchantmodulemappings().add(merchantmodulemapping);
		merchantmodulemapping.setMerchant(this);

		return merchantmodulemapping;
	}

	public Merchantmodulemapping removeMerchantmodulemapping(Merchantmodulemapping merchantmodulemapping) {
		getMerchantmodulemappings().remove(merchantmodulemapping);
		merchantmodulemapping.setMerchant(null);

		return merchantmodulemapping;
	}

	public Set<Package> getPackages() {
		return this.packages;
	}

	public void setPackages(Set<Package> packages) {
		this.packages = packages;
	}

	public Package addPackage(Package _package) {
		getPackages().add(_package);
		_package.setMerchant(this);

		return _package;
	}

  public Package removePackage(Package _package) {
    getPackages().remove(_package);
    _package.setMerchant(null);

    return _package;
	}

	public Set<Paymenthistory> getPaymenthistories() {
		return this.paymenthistories;
	}

	public void setPaymenthistories(Set<Paymenthistory> paymenthistories) {
		this.paymenthistories = paymenthistories;
	}

	public Paymenthistory addPaymenthistory(Paymenthistory paymenthistory) {
		getPaymenthistories().add(paymenthistory);
		paymenthistory.setMerchant(this);

		return paymenthistory;
	}

	public Paymenthistory removePaymenthistory(Paymenthistory paymenthistory) {
		getPaymenthistories().remove(paymenthistory);
		paymenthistory.setMerchant(null);

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
		timesheet.setMerchant(this);

		return timesheet;
	}

	public Timesheet removeTimesheet(Timesheet timesheet) {
		getTimesheets().remove(timesheet);
		timesheet.setMerchant(null);

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
		timesheetconfiguration.setMerchant(this);

		return timesheetconfiguration;
	}

	public Timesheetconfiguration removeTimesheetconfiguration(Timesheetconfiguration timesheetconfiguration) {
		getTimesheetconfigurations().remove(timesheetconfiguration);
		timesheetconfiguration.setMerchant(null);

		return timesheetconfiguration;
	}

}