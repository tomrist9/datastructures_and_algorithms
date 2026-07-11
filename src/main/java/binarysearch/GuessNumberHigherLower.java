package main.java.binarysearch;

public class GuessNumberHigherLower {

    private final int pick;

    public GuessNumberHigherLower(int pick) {
        this.pick = pick;
    }

    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = guess(mid);

            if (res == 0) {
                return mid;
            } else if (res == 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    private int guess(int num) {
        if (num > pick) {
            return -1;
        } else if (num < pick) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        GuessNumberHigherLower game =
                new GuessNumberHigherLower(6);

        System.out.println(game.guessNumber(10));
    }
}