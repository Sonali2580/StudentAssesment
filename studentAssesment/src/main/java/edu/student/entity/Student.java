package edu.student.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "amitava")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "studentid", length = 20)
	private Integer id;
	@Column(name = "studentname", length = 25, unique = true, nullable = false)
	private String name;
	@Column(name = "studentaddress", length = 100)
	private String address;
	
	
    

}
