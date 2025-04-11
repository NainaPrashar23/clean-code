package org.example.basic;

public class StudentGradingHelper {

	public boolean isGradeB(int marks, boolean isMaths) {
		int upperLimit = isMaths ? 90 : 80;
		return marks >= 51 && marks <= upperLimit;
	}

	public String getGrade(int mark, boolean isMaths) {
		if (isGradeA(mark, isMaths)) {
			return "A";
		} else if (isGradeB(mark, isMaths)) {
			return "B";
		} else {
			return "C";
		}
	}

	private boolean isGradeA(int mark, boolean isMaths) {
		return mark >= (isMaths ? 96 : 91);
	}

	private boolean isGradeB(int mark, boolean isMaths) {
		int lower = isMaths ? 56 : 51;
		int upper = 90;
		return mark >= lower && mark <= upper;
		return mark > lowerLimitGradeB && mark < 90;
	}

    public String willQualifyForQuiz(int marks1, int marks2, boolean isMaths) {
		int goodThreshold = isMaths ? 85 : 80;
		int badThreshold = isMaths ? 25 : 20;

		if (marks1 <= badThreshold || marks2 <= badThreshold) {
			return "NO";
		}

		if (marks1 >= goodThreshold || marks2 >= goodThreshold) {
			return "YES";
		}

		return "MAYBE";
    }
}