package com.company.options;

public class SimpleCalculations extends AbstractOption {

    @Override
    public void chosenOption() {

        while (isRunning) {

            System.out.println("Wybierz jedna z nich");
            System.out.println("1.Dodawanie");
            System.out.println("2.Odejmowanie");
            System.out.println("3.Mnożenie");
            System.out.println("4.Dzielenie");
            System.out.println("5.Cofnij");
            System.out.print("");

            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> myMath.addition();
                case 2 -> myMath.subtraction();
                case 3 -> myMath.multiplication();
                case 4 -> myMath.division();
                case 5 -> isRunning = false;
            }
            System.out.println("");
        }
    }
}
