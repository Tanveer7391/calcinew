package Calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class calcidev {

	@Test
	void test() {
		 int first, second, add, subtract, multiply;
		    float devide;
		    Scanner scanner = new Scanner(System.in);

		    System.out.print("Enter Two Numbers : ");
		    first = scanner.nextInt();
		    second = scanner.nextInt();

		    add = first + second;
		    subtract = first - second;
		    multiply = first * second;
		    devide = (float) first / second;

		    System.out.println("Sum = " + add);
		    System.out.println("Difference = " + subtract);
		    System.out.println("Multiplication = " + multiply);
		    System.out.println("Division = " + devide);
		  }
			}


