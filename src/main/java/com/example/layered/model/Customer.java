package com.example.layered.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Customer {

  @Id
  private String nickName;

  @NotNull
  @Size(min = 2, max = 20, message = "Incorret name")
  private String name;

  @NotBlank
  @Email
  private String e_mail;

  @NotNull
  @Size(min = 6, max = 20, message = "Your password should be at least 6 character")
  private String password;
  

}