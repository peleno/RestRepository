package ua.lviv.iot.spring.lab7.rest.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@NamedNativeQuery(name = "FIND_BEST_STUDENT", query = "select * from student where id = 1")

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnoreProperties("students")
	@JoinColumn(name = "group_id")
	private Group group;
	@ManyToMany(mappedBy = "students")
	@JsonIgnoreProperties("students")
	private Set<Subject> subjects;

	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student() {
	}

	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

}
