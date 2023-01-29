package jpa.entitymodels;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "student")

@Getter
@Setter
@NamedQueries({
	@NamedQuery( name="StudentByEmail", query="From Student s where s.sEmail= :email")
})
public class Student {

	@Id
	@Column(name = "email", length = 50)
	private String sEmail;
	@Column(name = "name", nullable = false, length = 50)
	private String sName;
	@Column(name = "password", nullable = false, length = 50)
	private String sPass;
	@ManyToMany(targetEntity = Course.class, cascade = { CascadeType.ALL })
	@JoinTable(name = "student_course",
	joinColumns = @JoinColumn(name = "Student_email"), 
	inverseJoinColumns = @JoinColumn(name = "sCourses_id"))
	private List<Course> sCourses;

	public List<Course> getCourseList() {
		return sCourses;
	}

	public void setCourseList(List<Course> sCourses) {
		this.sCourses = sCourses;
	}

	public Student(String sEmail, String sName, String sPass, List<Course> sCourses) {
		super();
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = sPass;
		this.sCourses = sCourses;
	}

	public Student() {
		super();
		this.sEmail = "";
		this.sName = "";
		this.sPass = "";
		this.sCourses = new ArrayList<Course>();
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof Student)) {
			return false;
		}
		Student s = (Student) o;
		return s.getSEmail().equals(this.getSEmail()) && s.getSCourses().equals(this.getSCourses())
				&& s.getSName().equals(this.getSName()) && s.getSPass().equals(this.getSPass());

	}
}
