package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GreensEntity {
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="USERNAME")
	private String username;
	@Column(name="EMAIL")
	private String email;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="CONTACT")
	private String contact;
	@Column(name="PASSWORD")
	private String password;
	
	

}
