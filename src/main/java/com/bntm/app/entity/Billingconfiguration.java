package com.bntm.app.entity;

import java.io.*;
import java.util.*;

import javax.persistence.*;

/** The persistent class for the billingconfiguration database table. */
@Entity
@Table(name = "billingconfiguration")
@NamedQuery(name = "Billingconfiguration.findAll", query = "SELECT b FROM Billingconfiguration b")
public class Billingconfiguration implements Serializable {
  private static final long serialVersionUID = 1L;

  @Temporal(TemporalType.DATE)
  private Date dueDate;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private byte isDeleted;

  private int packageID;

  private byte paymentSMS;

  private byte status;

  //bi-directional many-to-one association to Client
  @ManyToOne
  @JoinColumn(name = "ClientId")
  private Client client;

  //bi-directional many-to-one association to Merchant
  @ManyToOne
  @JoinColumn(name = "MerchantId")
  private Merchant merchant;

  public Billingconfiguration() {}

  public Date getDueDate() {
    return this.dueDate;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public byte getIsDeleted() {
    return this.isDeleted;
  }

  public void setIsDeleted(byte isDeleted) {
    this.isDeleted = isDeleted;
  }

  public int getPackageID() {
    return this.packageID;
  }

  public void setPackageID(int packageID) {
    this.packageID = packageID;
  }

  public byte getPaymentSMS() {
    return this.paymentSMS;
  }

  public void setPaymentSMS(byte paymentSMS) {
    this.paymentSMS = paymentSMS;
  }

  public byte getStatus() {
    return this.status;
  }

  public void setStatus(byte status) {
    this.status = status;
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
