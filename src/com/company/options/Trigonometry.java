package com.company.options;

public class Trigonometry extends AbstractOption {

    @Override
    public void chosenOption() {
        while (isRunning) {

            System.out.println("Wybierz jedna z nich");
            System.out.println("1.Sinus");
            System.out.println("2.Cosinus");
            System.out.println("3.Tanges");
            System.out.println("4.Cotanges");
            System.out.println("5.Cofnij");
            System.out.print("");

            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> myMath.sinus();
                case 2 -> myMath.cosinus();
                case 3 -> myMath.tangens();
                case 4 -> myMath.cotanges();
                case 5 -> isRunning = false;
            }
            System.out.println("");
        }

    }
}
