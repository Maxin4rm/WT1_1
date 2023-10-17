package main.com.company.laba_1.task_9;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Basket basket = createBasket();
        System.out.println(countWeightOfBalls(basket));
        System.out.println(countBlueBalls(basket));
    }

    public static Basket createBasket() {
        Ball ball1 = new Ball(Color.YELLOW, 3);
        Ball ball2 = new Ball(Color.BLUE, 2);
        Ball ball3 = new Ball(Color.BLACK, 6);
        Ball ball4 = new Ball(Color.RED, 1);
        Ball ball5 = new Ball(Color.BLUE, 5);
        Ball ball6 = new Ball(Color.GREEN, 7);
        Ball ball7 = new Ball(Color.BLUE, 4);
        return new Basket(ball1, ball2, ball3, ball4, ball5, ball6, ball7);
    }

    public static int countWeightOfBalls(Basket basket) {
        int weight  = 0;
        for (Ball ball : basket.getBalls()) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public static int countBlueBalls(Basket basket) {
        int count = 0;

        for (Ball ball : basket.getBalls()) {
            if (ball.getColor() == Color.BLUE) {
                count++;
            }
        }
        return count;
    }


}
