package jpa.entitymodels;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

import lombok.Setter;

@Entity
@Table(name = "course")
@Getter
@Setter

public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int cid;
	@Column(name = "name", nullable = false, length = 50)
	private String cName;
	@Column(name = "instructor", nullable = false, length = 50)
	private String cInstructorName;
	
	public Course(int cid, String cName, String cInstructorName) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.cInstructorName = cInstructorName;

	}

	public Course() {
		super();
		this.cid = 0;
		this.cName = "";
		this.cInstructorName = "";
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof Course)) {
			return false;
		}
		Course c = (Course) o;
		return c.getCid() == this.getCid() && c.getCName().equals(this.getCName())
				&& c.getCInstructorName().equals(this.getCInstructorName());

	}

	@Override
	public int hashCode() {
		return this.cid;

	}
}
