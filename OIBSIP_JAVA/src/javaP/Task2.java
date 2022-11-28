package javaP;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Amanshu Sahu
 *
 */
public class Task2 {
	// attibutes
	public int number;
	public int getNoOfGuesses = 0;
	public int inputNumber;

	// setter getter
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getGetNoOfGuesses() {
		return getNoOfGuesses;
	}

	public void setGetNoOfGuesses(int getNoOfGuesses) {
		this.getNoOfGuesses = getNoOfGuesses;
	}

	public int getInputNumber() {
		return inputNumber;
	}

	public void setInputNumber(int inputNumber) {
		this.inputNumber = inputNumber;
	}

	public Task2() {
		// TODO Auto-generated constructor stub
		Random r = new Random();
		this.number = r.nextInt(100);
	}

	void takeUserInput() {
		System.out.println("Guess the number");
		Scanner sc = new Scanner(System.in);
		inputNumber = sc.nextInt();
	}

	boolean isCorrectNumber() {
		getNoOfGuesses++;
		if (inputNumber == number) {
			System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number,
					getNoOfGuesses);
			return true;
		} else if (inputNumber < number) {
			System.out.println("your number is lower than the Right guess !!!");
		} else if (inputNumber > number) {
			System.out.println("your number is higher than the Right guess !!!");
		}
		return false;
	}

	public static void main(String[] args) {
		Task2 game = new Task2();
		boolean b = false;
		while (!b) {
			game.takeUserInput();
			b = game.isCorrectNumber();
		}
	}
}