package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter student data:");
		System.out.print("Name: ");
		student.name = sc.nextLine();
		System.out.print("first semester grade: ");
		student.gradeA = sc.nextDouble();
		System.out.println("Result: " + student.gradesOfFirstSemester(student.gradeA));
		System.out.println();
		System.out.print("second semester grade: ");
		student.gradeB = sc.nextDouble();
		System.out.println("Result: " + student.gradesOfSecondSemester(student.gradeB));
		System.out.println();
		System.out.print("third semester grade: ");
		student.gradeC = sc.nextDouble();
		System.out.println("Result: " + student.gradesOfThirdSemester(student.gradeC));
		System.out.println();
		System.out.println("Final result: " + student.finalGrade());
		sc.close();
	}

}
