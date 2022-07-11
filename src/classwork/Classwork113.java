package src.classwork;


public class Classwork113 {
    public static void theForCycle() {
        for (int i = 0; i <= 100; i++) {
            check(i);

        }
    }

    public static void check(int a) {
        if (a % 2 == 1) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        theForCycle();
    }
}



