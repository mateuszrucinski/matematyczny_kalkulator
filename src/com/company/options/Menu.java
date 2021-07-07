package com.company.options;

public class Menu extends AbstractOption {

    SimpleCalculations simpleCalculations = new SimpleCalculations();
    Trigonometry trigonometry = new Trigonometry();

    @Override
    public void chosenOption() {
        System.out.println("Witaj w kalkulatorze matematyka!");
        System.out.println("Znajdują się tutaj opcje, które możesz użyczyć do swoich obliczeń.");

        while (isRunning) {

            System.out.println("Wybierz jedna z nich");
            System.out.println("1.Proste obliczenia");
            System.out.println("2.Trygonometria");
            System.out.println("3.Wyjście");
            System.out.print("");

            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> simpleCalculations.chosenOption();
                case 2 -> trigonometry.chosenOption();
                case 3 -> isRunning = false;
                default -> System.out.println("Nie ma takiej opcji !");
            }
            System.out.println("");
        }

    }
}
