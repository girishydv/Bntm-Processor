package com.bntm.app.entity;

import java.io.*;

import javax.persistence.*;

/** The persistent class for the merchantmodulemapping database table. */
@Entity
@Table(name = "merchantmodulemapping")
@NamedQuery(name = "Merchantmodulemapping.findAll", query = "SELECT m FROM Merchantmodulemapping m")
public class Merchantmodulemapping implements Serializable {
  private static final long serialVersionUID = 1L;

  private String modulePassword;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  //bi-directional many-to-one association to Merchant
  @ManyToOne
  @JoinColumn(name = "MerchantId")
  private Merchant merchant;

  //bi-directional many-to-one association to Module
  @ManyToOne
  @JoinColumn(name = "ModuleId")
  private Module module;

  public Merchantmodulemapping() {}

  public String getModulePassword() {
    return this.modulePassword;
  }

  public void setModulePassword(String modulePassword) {
    this.modulePassword = modulePassword;
  }

  public Merchant getMerchant() {
    return this.merchant;
  }

  public void setMerchant(Merchant merchant) {
    this.merchant = merchant;
  }

  public Module getModule() {
    return this.module;
  }

  public void setModule(Module module) {
    this.module = module;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
