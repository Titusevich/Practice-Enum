package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DayAdvice day = new DayAdviceImpl();

        try {
            getOutput(day.advice(getData()));
        } catch (Exception e) {
            getOutput("Exception: " + e.getMessage());
        }
    }

    private static Day getData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the day of the week:");
        return Day.valueOf(scan.nextLine().trim().toUpperCase());
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
