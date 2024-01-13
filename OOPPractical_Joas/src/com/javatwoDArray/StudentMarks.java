package com.javatwoDArray;
import java.util.Arrays;

public class StudentMarks {
	 public static void main(String[] args) {
	        // Student data
	        String[] students = {"Claire", "Sano", "Theogene"};
	        int[][] scores = {
	                {55, 87, 47, 85},
	                {63, 85, 63, 45},
	                {52, 77, 47, 80}
	        };

	        // Calculate and display results
	        calculateAndDisplay(students, scores);
	    }

	    static void calculateAndDisplay(String[] students, int[][] scores) {
	        // Calculate percentage, average, max, and min
	        int numStudents = students.length;
	        int numSubjects = scores[0].length;

	        double[] percentages = new double[numStudents];
	        double[] averages = new double[numSubjects];
	        int[] mins = new int[numSubjects];
	        int[] maxs = new int[numSubjects];

	        for (int i = 0; i < numSubjects; i++) {
	            int[] column = new int[numStudents];
	            for (int j = 0; j < numStudents; j++) {
	                column[j] = scores[j][i];
	            }

	            // Calculate average, min, and max for each subject
	            averages[i] = calculateAverage(column);
	            mins[i] = findMin(column);
	            maxs[i] = findMax(column);
	        }

	        for (int i = 0; i < numStudents; i++) {
	             //Calculate percentage for each student
	            percentages[i] = calculatePercentage(scores[i]);
	        }

	        // Display results
	        System.out.printf("%-10s%-15s%-15s%-15s%-15s%-15s%-10s%n", "Students", "Math/100", "Programming/100 ",
	                "Design/100", "Art/100", "Percentage","Average");

	        for (int i = 0; i < numStudents; i++) {
	            System.out.printf("%-10s", students[i]);
	            
	            for (int j = 0; j < numSubjects; j++) 
	            {
	                System.out.printf("%-15d ", scores[i][j]);
	            }
	            System.out.printf("%-15.1f", percentages[i]);
	            System.out.printf("%-15.1f%n", percentages[i]);
	            
	           
	        }

	        // Display  Min, Max
	      
	        System.out.println();

	        System.out.printf("%-10s", "Min");
	        for (int min : mins) {
	            System.out.printf("%-15d ", min);
	        }
	        System.out.println();

	        System.out.printf("%-10s", "Max");
	        for (int max : maxs) {
	            System.out.printf("%-15d ", max);
	        }
	    }

	    static double calculatePercentage(int[] scores) {
	        int sum = 0;
	        for (int score : scores) {
	            sum += score;
	        }
	        return (double) sum / scores.length;
	        
	    }

	    static double calculateAverage(int[] scores) {
	        int sum = 0;
	        for (int score : scores) {
	            sum += score;
	        }
	        return (double) sum/ scores.length;
	    }

	    static int findMin(int[] array) {
	        return Arrays.stream(array).min().orElse(0);
	    }

	    static int findMax(int[] array) {
	        return Arrays.stream(array).max().orElse(0);
	    }

}
