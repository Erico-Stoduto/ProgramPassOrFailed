package entities;

public class Student {

	public String name;
	public double gradeA;
	public double gradeB;
	public double gradeC;

	public String gradesOfFirstSemester(double grades) {
		if (gradeA >= 25) {
			return "Pass";
		}else {
			return "Failed";
		}
	}
	public String gradesOfSecondSemester(double grades) {
		if (gradeB >= 30) {
			return "Pass";
		}else {
			return "Failed";
		}
	}
	public String gradesOfThirdSemester(double grades) {
		if (gradeC >= 35) {
			return "Pass";
		}else {
			return "Failed";
		}
	}

	public String finalGrade() {
		double soma = gradeA + gradeB + gradeC;
		if (gradeA + gradeB + gradeC >= 90) {
			return "You passed \n" + "Your final result is " + String.format("%.2f", soma);

		} else {
			double result = 90 - soma;
			return "you failed \n" + "Your final grade: " + soma + "\n" + "Missed: " + result + " points";
		}
	}
}
