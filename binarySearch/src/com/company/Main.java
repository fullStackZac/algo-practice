//this is a simple implementation of the binary search algorithm in Java

package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(80);
        numbers.add(30);
        numbers.add(70);
        numbers.add(5);
        numbers.add(90);
        numbers.add(19);
        numbers.add(25);
        numbers.add(37);

        //setting up some variables to use in the loop constituting guessing
	    int answer = numbers.get((int)(Math.random() * numbers.size()));
        int guess = 0;
	    int low = 0;
	    int mid = 0;
	    int high = numbers.size() - 1;

	    while(low <= high) {
	        mid = (low + high) / 2; //set the mid-point of the list
            guess = numbers.get(mid); //utilize the midpoint of the remaining list section as the guess
            if(guess == answer) {
                guess = numbers.get(answer);
                System.out.println("Computer guessed " + guess + " which is correct!"); //duh!
                break;
            }else if(guess > answer) {
                high = mid - 1; //break off guessed away chunk of list should the last guess be too high
            }else {
                low = mid + 1; //break off the guessed away chunk of the list should the last guess be too low
            }
        }
    }
}
