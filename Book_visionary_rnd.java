import java.util.Random;
import java.util.Scanner;

public class Book_visionary_rnd {
    public static int generateRandomNumber(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("the line number must not be negative");
        }
        return new Random().ints(0, (n + 1))
                .findFirst()
                .getAsInt();
    }
    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the number of the first page of your text");
        int x = sc1.nextInt();
        System.out.println("enter the number of the last page of your text");
        Scanner sc2 = new Scanner(System.in);
        int y = sc2.nextInt();
        final int min = x;
        final int max = y;
        final int rnd = rnd(x, y);
        System.out.println("your prediction page number is " + rnd);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("enter the quantity of line on your page");
        int z = sc3.nextInt();
        System.out.println("the number of your prediction line is "+generateRandomNumber(z));
        }
    }
    
    }

