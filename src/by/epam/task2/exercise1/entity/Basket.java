package by.epam.task2.exercise1.entity;

import java.util.ArrayList;

/**
 * Created by Davud_Murtazin on 9/27/2016.
 */
public class Basket {
    private ArrayList<Ball> balls = new ArrayList<>();

    public Basket() {
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void setBalls(ArrayList<Ball> balls) {
        this.balls = balls;
    }
}
