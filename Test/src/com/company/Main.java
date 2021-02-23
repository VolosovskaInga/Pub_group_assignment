package com.company;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public enum drink
    {
        ONE_BEER,
        ONE_CIDER,
        A_PROPER_CIDER,
        GT,
        BACARDI_SPECIAL,
    }
    public enum studentOrNot
    {
        STUDENT,
        OTHER,
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose amongst the following:");
        for(drink game:drink.values()){

            System.out.println(game);
        }
        System.out.print("# ");String str = scanner.next();
        drink ONE_BEER;
        drink ONE_CIDER;
        drink A_PROPER_CIDER;
        drink GT;
        String BACARDI_SPECIAL;
        BACARDI_SPECIAL= drink.BACARDI_SPECIAL.toString();
        GT= drink.GT;
        A_PROPER_CIDER=drink.A_PROPER_CIDER;
        ONE_CIDER= drink.ONE_CIDER;
        ONE_BEER=drink.ONE_BEER;

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Are you a student. Choose amongst the following:");
        for(studentOrNot student:studentOrNot.values()){

            System.out.println(student);
        }
        System.out.print("# ");String str1 = scanner1.next();
        studentOrNot STUDENT;
        String OTHER;
        OTHER=studentOrNot.OTHER.toString();
        STUDENT= studentOrNot.STUDENT;

        Scanner scanner2 = new Scanner(System.in);
        int amount = 0;
        System.out.println("Please enter the amount of drinks");
        amount = scanner2.nextInt();


        double price;

        if (amount > 2 && (str.equals(GT) || str.equals(BACARDI_SPECIAL))) {
            throw new RuntimeException("Too many drinks, max 2.");
        }
        if (ONE_BEER.toString().equals(str)){
            price = 74;
        }
        if (ONE_CIDER.toString().equals(str)){
            price = 103;
        }
        if (A_PROPER_CIDER.toString().equals(str)){
            price = 110;
        }
        if (GT.toString().equals(str)){
            price = priceOfGT();
        }
        if (BACARDI_SPECIAL.toString().equals(str)){
            price = priceOfBacardiSpecial();
        }
        else {
            throw new RuntimeException("No such drink exists");
        }
        if (str1.equals(STUDENT) && (str.equals(ONE_CIDER) || str.equals(ONE_BEER) || str.equals(A_PROPER_CIDER)))
        {
            price = price - price / 10;
        }
        //return price * amount;
        System.out.println("The cost of your drink is " + price * amount);
    }

    private static double priceOfGT() {
        double oneUnitOfGreenStuff = 10;
        double oneUnitOfTonicWater = 20;
        double oneUnitOfGin = 85;
        return oneUnitOfGin + oneUnitOfTonicWater + oneUnitOfGreenStuff;
    }

    private static double priceOfBacardiSpecial() {
        double oneUnitOfRum = 65;
        double oneUnitOFGrenadine = 10;
        double oneUnitOfLimeJuice = 10;
        double oneUnitOfGin = 85;
        return oneUnitOfGin / 2 + oneUnitOfRum + oneUnitOFGrenadine + oneUnitOfLimeJuice;
    }
}