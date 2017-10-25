package com.kit.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionStudent {

	public static void main(String[] args) {

		Student student1 = new Student("Koray", "Güney", 33);
		Student student2 = new Student("Ahmet", "Mehmet", 20);
		Student student3 = new Student("Ali", "Veli", 24);
		Student student4 = new Student("Hasan", "Mustafa", 18);

		List<Student> students = new ArrayList<>();

		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);

		// Comparator<Student> sortname = new Student();
		// Collections.sort(students, sortname);

		Collections.sort(students);

		for (Student student : students) {
			System.out.println(student);
		}

	}

}
