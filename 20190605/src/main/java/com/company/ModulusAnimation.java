package com.company;

public class ModulusAnimation {

    public static void main(String[] args) throws Exception {
        int repeats = 5;
        int steps_per_second = 10;

        for (int i = 0; i < 80; i++) {
            if (i % 10 == 0)
                System.out.print(" Mr. Mitchell is cool.... \r");

            if (i % 10 == 0)
                System.out.print(" .Mr. Mitchell is cool..... \r");
            else if (i % 10 == 1)
                System.out.print(" ..Mr. Mitchell is cool.... \r");
            else if (i % 10 == 2)
                System.out.print(" ...Mr. Mitchell is cool... \r");
            else if (i % 10 == 3)
                System.out.print(" ....Mr. Mitchell is cool.. \r");
            else if (i % 10 == 4)
                System.out.print(" .....Mr. Mitchell is cool. \r");
            else if (i % 10 == 5)
                System.out.print(" ......Mr. Mitchell is cool \r");
            else if (i % 10 == 6)
                System.out.print(" .......Mr. Mitchell is cool \r");
            else if (i % 10 == 7)
                System.out.print(" cool.......Mr. Mitchell \r");
            else if (i % 10 == 8)
                System.out.print(" is cool....... \r");
            else if (i % 10 == 9)
                System.out.print(" Mr. Mitchell is cool...... \r");
            else if (i % 10 == 10)
                System.out.print(" .Mr. Mitchell is cool..... \r");

            Thread.sleep(1000 / steps_per_second);
        }

    }

}
