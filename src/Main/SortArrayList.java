/*Programmer: Austin Parker     Date: Oct, 7, 2020
 * Description: This program takes in two pre-populated unsorted arrays. One is an Integer array and other a String array.
 * When the program executes, it will sort the two arrays and display them in the console.*/

package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortArrayList {

    /*create ArrayList object*/
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    E tmp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmp);
                }
            }
        }
    }/*end of ArrayList*/

    /*creates Greeting method*/
    public static void Greeting() {
        System.out.println("\nHello! Welcome to the Sorted Array program using Generics.");
        System.out.println("This program takes in two pre-populated unsorted arrays. " +
                "One is an Integer array and other a String array");
        System.out.println("When the program executes, it will sort the two arrays and display them in the console.\n");
    }

    public static void main(String[] args) {
        /*calls Greeting method*/
        Greeting();
        /*create scanner and store in confirm string*/
        Scanner scanner = new Scanner(System.in);
        String confirm;

        /*do/while loop to */
        do {
            System.out.println("To start please enter letter \"y\" or \"n\" to close program : ");
            confirm = scanner.nextLine().toLowerCase();
            if (confirm.equals("n")) {
                System.out.println("Thanks for using the Sorted Array program using Generics!");
                System.exit(0);
            }
        } while (!confirm.equals("y"));

        /*creates ArrayList Integer object, display original, pass list1 to sort method, display sorted array*/
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 10, 7, 6, 13, 21, 8));
        System.out.println("\n---Original Integer array:  " + list1);
        sort(list1);
        System.out.println("---Sorted Integer array:  " + list1);

        /*creates ArrayList Integer object, display original, pass list2 to sort method, display sorted array*/
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("Zebra", "Anaconda", "Dog", "Bird", "Wold"));
        System.out.println("\n---Original String array:  " + list2);
        sort(list2);
        System.out.println("---Sorted String array:  " + list2);
        System.out.println("\nThanks for using the Sorted Array program using Generics!");

    }/*end of main*/
}/*end of SortArrayListClass*/
