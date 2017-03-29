package com.ashish.programs;

import java.util.Arrays;
import java.util.Comparator;

	 

	public class MainComparatorExample {

	 

	    public static void main(String args[]) {

	        Student student[] = new Student[3];

	 

	        student[0] = new Student();

	        student[0].setName("Nick");

	        student[0].setGrade(19);


	        student[1] = new Student();

            student[1].setName("Helen");

	        student[1].setGrade(12);

	 

	        student[2] = new Student();

	        student[2].setName("Ross");

	        student[2].setGrade(16);
 

	        System.out.println("Order of students before sorting is: ");

	 

	        for (int i = 0; i < student.length; i++) {

	            System.out.println(student[i].getName() + "\t"

                    + student[i].getGrade());

	        }

	 

	        Arrays.sort(student, new GradeComparator());

	        System.out

	                .println("Order of students after sorting by student grade is");

	 

	        for (int i = 0; i < student.length; i++) {

	            System.out.println(student[i].getName() + "\t"

	                    + student[i].getGrade());

	        }
 

	        Arrays.sort(student, new NameComparator());
	        System.out

               .println("Order of students after sorting by student name is");

	 

	        for (int i = 0; i < student.length; i++) {

	            System.out.println(student[i].getName() + "\t"

	                    + student[i].getGrade());

	        }

	    }

	 

	}
	
	class Student {
		private String name;
		private int age;
		private String lesson;
		private int grade;

		public Student() {
		}

		public Student(String name, int age, String lesson, int grade) {
			super();
			this.name = name;
			this.age = age;
			this.lesson = lesson;
			this.grade = grade;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getLesson() {
			return lesson;
		}

		public void setLesson(String lesson) {
			this.lesson = lesson;
		}

		public int getGrade() {
			return grade;
		}

		public void setGrade(int grade) {
			this.grade = grade;
		}

		@Override
		public String toString() {
			return "[name=" + this.name + ", age=" + this.age + ", lesson="
					+ this.lesson + ", grade=" + this.grade + "]";
		}

	}
	
	class GradeComparator implements Comparator {

		@Override
		public int compare(Student o1, Student o2) {

			// descending order (ascending order would be:
			// o1.getGrade()-o2.getGrade())
			return o2.getGrade() - o1.getGrade();
		}

	}
	
	class NameComparator implements Comparator {

		@Override
		public int compare(Student o1, Student o2) {
			String name1 = o1.getName();
			String name2 = o2.getName();

			// ascending order (descending order would be: name2.compareTo(name1))
			return name1.compareTo(name2);
		}

	}
