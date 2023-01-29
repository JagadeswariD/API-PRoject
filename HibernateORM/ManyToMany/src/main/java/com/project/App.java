package com.project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.project.model.Cohort;
import com.project.model.Teacher;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Session session = factory.openSession();
    	/*Transaction t = session.beginTransaction();
    	//----Create Cohort/class Entity set one----
    	Cohort Class1 = new Cohort("Java Developer", "14 weeks");
		Cohort Class2 = new Cohort("FullStack Developer", "7 Weeks");
		Cohort Class3 = new Cohort("Python Developer", "12 Weeks");
		//------  Store Cohort  / Class  --------
		session.save(Class1);
		session.save(Class2);
		session.save(Class3);
	
		//-----Create Cohort one / Class one --------
		Set<Cohort> ClassSet1 = new HashSet<Cohort>();
		ClassSet1.add(Class1);
		ClassSet1.add(Class2);
		ClassSet1.add(Class3);
		//-----Create Cohort two / Class two --------
		Set<Cohort> ClassSet2 = new HashSet<Cohort>();
		ClassSet2.add(Class2);
		ClassSet2.add(Class3);
		ClassSet2.add(Class1);
		//-----Create Cohort Three / Class Three --------
		Set<Cohort> ClassSet3 = new HashSet<Cohort>();
		ClassSet3.add(Class3);
		ClassSet3.add(Class1);
		ClassSet3.add(Class2);
		
		Teacher t1 = new Teacher("100", "Haseeb", ClassSet1);
		Teacher t2 = new Teacher("200", "Jenny", ClassSet2);
		Teacher t3 = new Teacher("200", "Charlie", ClassSet3);
				
		session.save(t1);
		session.save(t2);
		session.save(t3);
		t.commit();	*/
		String sql="SELECT t.tit, t.teachername,c.CName\r\n"
				+ " FROM teacher t\r\n"
				+ " INNER JOIN teacher_cohort tc ON t.tit = tc.teacher_tit \r\n"
				+ " INNER JOIN Cohort c ON tc.CohortSet_cid = c.cid \r\n"
				+ " where t.tit=1;";
		Query querry = session.createQuery("SELECT u FROM Teacher u where u.tit = 1" );
		Teacher t4= (Teacher) querry.getSingleResult();
		Set<Cohort> cs= t4.getCohortSet();
		for (Cohort object : cs) {
			System.out.println(object.getCName());
		}
		
	
    }

}
