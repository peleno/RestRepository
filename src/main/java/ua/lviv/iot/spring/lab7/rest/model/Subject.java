package ua.lviv.iot.spring.lab7.rest.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String name;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "Student_Subject", joinColumns = {
			@JoinColumn(name = "subject_id", nullable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "student_id", nullable = false) })
	@JsonIgnoreProperties("subjects")
	private Set<Student> students;

	public int getId() {
		return id;
	}

	public Subject() {

	}

	public Subject(int id, String name, Set<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

}
