import java.util.Scanner;

// A program made by Omeed Tehrani, designed to calculate your CH301 Final Average. 
public class ChemistryGrades {
	public static void main(String[] args) {
		System.out.println("Welcome to the Chemistry 301: Grade Calculator!");
		System.out.println("Created by Omeed Tehrani.");
		System.out.println("=======================");
		gradeCalculation();
	}
	public static void gradeCalculation() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter first exam grade: ");
		double gradeInputOne = keyboard.nextDouble();
		System.out.print("Enter second exam grade: ");
		double gradeInputTwo = keyboard.nextDouble();
		System.out.print("Enter third exam grade: ");
		double gradeInputThree = keyboard.nextDouble();
		System.out.print("Enter fourth exam grade: ");
		double gradeInputFour = keyboard.nextDouble();
		
		double addScores = gradeInputOne + gradeInputTwo + gradeInputThree + gradeInputFour;
		double doubleTheScores = (addScores) * 2;
		
		System.out.println();
		System.out.println("Ok! OmeedBot has now stored your scores. "
				+ "Your current exam raw score is " + doubleTheScores + " out of 800.");
		System.out.println();
		
		System.out.print("Please enter 1st highest quiz grade: ");
		double quizInputOne = keyboard.nextDouble();
		System.out.print("Please enter 2nd highest quiz grade: ");
		double quizInputTwo = keyboard.nextDouble();
		System.out.print("Please enter 3rd highest quiz grade: ");
		double quizInputThree = keyboard.nextDouble();
		System.out.print("Please enter your total bonus points: ");
		double bonusInput = keyboard.nextDouble(); 
		
		double quizInputAdd = quizInputOne + quizInputTwo + quizInputThree;
		double averageQuizTotal = (quizInputAdd) / 3;
		
		double totalRawScore = averageQuizTotal + doubleTheScores;
		double adjustTheCurve = (totalRawScore * 10) / 9;
		double FINAL_POINTS = adjustTheCurve + bonusInput;
		
		System.out.println();
		System.out.println("RESULTS:");
		String letterGrade;
		if (FINAL_POINTS >= 920) { 
		    letterGrade = "A";
		} else if (FINAL_POINTS >= 900) { 
		    letterGrade = "A-";
		} else if (FINAL_POINTS >= 880) { 
		    letterGrade = "B+";
		} else if (FINAL_POINTS >= 820) { 
		    letterGrade = "B";
		} else if (FINAL_POINTS >= 800) { 
		    letterGrade = "B-";
		} else if (FINAL_POINTS >= 780) {
		    letterGrade = "C+";
		} else if (FINAL_POINTS >= 720) { 
		    letterGrade = "C";
		} else if (FINAL_POINTS >= 700) { 
		    letterGrade = "C-";
		} else if (FINAL_POINTS >= 600) { 
		    letterGrade = "D";
		} else {
		    letterGrade = "F";
		}
		System.out.println("Your letter grade is currently: " + letterGrade); 
		System.out.println("Your raw score out of 1000 is " + FINAL_POINTS);
	}
}
