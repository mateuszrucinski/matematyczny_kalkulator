package com.company.options;

import com.company.MyMath;

import java.util.Scanner;

public abstract class AbstractOption implements Option {

    protected Scanner scanner = new Scanner(System.in);
    protected MyMath myMath = new MyMath();
    protected int userChoice;

    boolean isRunning = true;

    @Override
    public void chosenOption() {

    }
}
