package app;

import java.io.PrintStream;
import java.util.Scanner;

public class HelloWorldApp {

  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.println("Input number");
    double number=sc.nextDouble();
    System.out.println("Input number2");
    double number2=sc.nextDouble();
    number=number+number2;
    System.out.println(" Sum of numbers = "+ number);
  }

}
