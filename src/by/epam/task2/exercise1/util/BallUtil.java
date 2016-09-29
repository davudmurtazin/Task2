package by.epam.task2.exercise1.util;

import by.epam.task2.exercise1.entity.Ball;

import java.util.Scanner;

/**
 * Created by Davud_Murtazin on 9/27/2016.
 */
public class BallUtil {

    public static Ball initBall(Ball ball){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight: ");
        double weight = sc.nextDouble();

        System.out.println("Enter color: ");
        Scanner sc1 = new Scanner(System.in);
        String color = sc1.nextLine();

        ball.setWeight(weight);
        ball.setColor(color);

        return ball;
    }
}
