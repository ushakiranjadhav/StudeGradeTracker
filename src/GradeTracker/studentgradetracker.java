package GradeTracker;
import java.util.ArrayList;
import java.util.Scanner;
public class studentgradetracker {

	public static void main(String[] args) {
		 ArrayList<Integer> grades = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Enter a student's grade (or type 'done' to finish): ");
	            String input = scanner.nextLine();

	            if (input.equalsIgnoreCase("done")) {
	                break;
	            }

	            try {
	                int grade = Integer.parseInt(input);
	                grades.add(grade);
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input. Please enter a numeric grade or 'done'.");
	            }
	        }

	        if (grades.isEmpty()) {
	            System.out.println("No grades were entered.");
	        } else {
	            int highest = findHighestGrade(grades);
	            int lowest = findLowestGrade(grades);
	            double average = calculateAverage(grades);

	            System.out.println("Highest Grade: " + highest);
	            System.out.println("Lowest Grade: " + lowest);
	            System.out.println("Average Grade: " + average);
	        }

	        scanner.close();
	    }

	    private static int findHighestGrade(ArrayList<Integer> grades) {
	        int highest = grades.get(0);
	        for (int grade : grades) {
	            if (grade > highest) {
	                highest = grade;
	            }
	        }
	        return highest;
	    }

	    private static int findLowestGrade(ArrayList<Integer> grades) {
	        int lowest = grades.get(0);
	        for (int grade : grades) {
	            if (grade < lowest) {
	                lowest = grade;
	            }
	        }
	        return lowest;
	    }

	    private static double calculateAverage(ArrayList<Integer> grades) {
	        int sum = 0;
	        for (int grade : grades) {
	            sum += grade;
	        }
	        return (double) sum / grades.size();
		

	}

}
