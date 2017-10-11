package com.sdrttnclskn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionStudent {

	public static void main(String[] args) {

		Student st1 = new Student("ali", "calýþ", 23);
		Student st2 = new Student("hasan", "calýþ", 25); 
		Student st3 = new Student("hüseyin", "calýþ", 27);
		Student st4 = new Student("ömer", "calýþ", 20);
		
		List<Student> students = new ArrayList<>();
		
	    students.add(st4);
	    students.add(st3);
	    students.add(st2);
	    students.add(st1);
	    
	    //isim göre sýralar.
	    Comparator<Student> sortname = new Student();
	    Collections.sort(students,sortname);
	    
	   // Collections.sort(students);  // yaþa göre sýralar
	    
	    for (Student student : students) {
			System.out.println(student);
		}


	}

}
