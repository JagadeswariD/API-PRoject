package com.project;

import com.project.controller.findUser_Hql;

public class App {
	public static void main(String[] args) {
		findUser_Hql u = new findUser_Hql();
		// u.findUser();
		// u.findUserSelect();
		// u.getRecordbyId();
		// u.getrecords();
		//u.getmaxSalary();
		//u.getmaxSalaryGroupBy();
		u.NamedQueryExample();

	}
}
