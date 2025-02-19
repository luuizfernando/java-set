package application;

import entities.Course;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Course> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        int a = sc.nextInt();
        for (int i = 0 ; i < a ; i++) {
            System.out.print("#" + (i + 1) + " student ID: ");
            int quantity = sc.nextInt();
            set.add(new Course(quantity));
        }
        System.out.print("How many students for course B? ");
        int b = sc.nextInt();
        for (int i = 0 ; i < b ; i++) {
            System.out.print("#" + (i + 1) + " student ID: ");
            int quantity = sc.nextInt();
            set.add(new Course(quantity));
        }
        System.out.print("How many students for course C? ");
        int c = sc.nextInt();
        for (int i = 0 ; (i + 1) < c ; i++) {
            System.out.print("#" + i + " student ID: ");
            int quantity = sc.nextInt();
            set.add(new Course(quantity));
        }
        System.out.println("Total students: " + set.size());
    }
}