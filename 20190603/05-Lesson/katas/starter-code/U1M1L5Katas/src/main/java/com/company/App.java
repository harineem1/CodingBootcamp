package com.company;

public class App {

    public static int subtract(int x, int y) {
            return (x - y);
        }
    public static int subtractOrZero(int x, int y) {
            int z = x - y;
            if (z > 0)
                return z;
            else
                return 0;
        }

        public static int max(int x,int y, int z) {
            // Calculate max
            int max = 0;
            max = x;
            if (y > max) max = y;
            if (z > max) max = z;
            return max;
        }

        public static int min(int x,int y, int z) {
        // Calculate max
        int min = 0;
        min = x;
        if (y < min) min = y;
        if (z < min) min = z;
        return min;
    }

    public static boolean isLarger (int x, int y) {
        // Checking for larger number

        if (x > y)
            return true;
        else
            return false;
    }
}

