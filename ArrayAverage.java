package youdoordie;

public class ArrayAverage {
	    public static void main(String[] args) {

	        int a[] = {10, 20, 30, 40, 50};
	        int sum = 0;

	        System.out.println("Array elements are:");

	        for (int i = 0; i < a.length; i++) {
	            System.out.println(a[i]);
	            sum = sum + a[i];
	        }

	        double avg = (double) sum / a.length;

	        System.out.println("Average = " + avg);
	    }
	}

