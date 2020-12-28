package com.example.layered.view;

import org.springframework.lang.Nullable;

public class CustomerDto {

  private String nickName;
  private String name;
  private String surname;
  private String e_mail;
  private String password;
  private long balance;
  @Nullable
  private long carID;


  public CustomerDto() {
    super();
  }

  public CustomerDto(String nickName, String name, String surname, String e_mail, String password,
      long balance,
      long carID) {

    this.nickName = nickName;
    this.name = name;
    this.surname = surname;
    this.e_mail = e_mail;
    this.password = password;
    this.balance = balance;
    this.carID = carID;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getE_mail() {
    return e_mail;
  }

  public void setE_mail(String e_mail) {
    this.e_mail = e_mail;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }

  public long getCarID() {
    return carID;
  }

  public void setCarID(long carID) {
    this.carID = carID;
  }


}