package lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class FirstHomeWork1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {0, 0, 0, 0, 0};
        System.out.println("До копирования: " + Arrays.toString(array2));
        System.arraycopy(array1, 1, array2, 2, 3);
        System.out.println("После копирования: " + Arrays.toString(array2));
    }
}

class FirstHomeWork2 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}

class FirstHomeWork3 {
    public static void main(String[] args) {
        byte a = -127;
        short b = 32500;
        int c = 1234567890;
        long d = 923222222;
        float e = 1.15f;
        double f = 3.14141414141414141;
        boolean g = true;
        char h = '\n';
    }

    public int third(int a, int b, int c, int d) {
        int x;
        x = a * (b + (c / d));
        return x;
    }

    public boolean four(int a, int b) {
        if (a + b > 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public int five(int a) {
        if (a < 0) {
            System.out.println("Число " + a + " отрицательное.");
        } else {
            System.out.println("Число " + a + " положительное.");
        }
        return a;
    }

    public boolean six(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public String seven(String name) {
        System.out.println("Привет, " + name + "!");
        return name;
    }

    public static void eight(String[] args) {
        System.out.print("Введите год: ");
        Scanner year = new Scanner(System.in);
        int x = year.nextInt();
        if ((x % 100 == 0 && x % 400 == 0) || (x % 4 == 0 && x % 100 > 0)) {
            System.out.print(x + " - високосный год!");
        } else {
            System.out.print(x + " - не является високосным годом.");
        }
    }
}

class FirstHomeWork4 {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int massMax = array1.length;

        for (int i = 0; i < massMax; i++) {
            System.out.print(i + "-" + array1[i] + " ");
        }
        for (int i = 0; i < massMax; i++) {
            if (array1[i] < 6) {
                array1[i] *= 2;
            }
        }
        System.out.println(" ");
        for (int i = 0; i < massMax; i++) {
            System.out.print(i + "-" + array1[i] + " ");
        }
    }
}

class FirstHomeWork5 {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int maxMass = array1.length;

        for (int i = 0; i < maxMass; i++) {
            System.out.println(i + "-" + array1[i]);
        }
        for (int i = 0; i < maxMass; i++) {
            if (array1[i] == 1) {
                array1[i] = 0;
            } else array1[i] = 1;
            System.out.println("New item in array1: " + i + "-" + array1[i]);
        }
    }
}

class FirstHomeWork6 {
    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7};
        int a = 8;
        int b = 0;

        for (int i = 0; i < array1.length; i++) {
            if (a > array1[i]) {
                a = array1[i];
            } else a = a;
        }
        for (int i = 0; i < array1.length; i++) {
            if (b < array1[i]) {
                b = array1[i];
            } else b = b;
        }
        System.out.println("Наибольшее число массива: " + b);
        System.out.println("Наименьшее число массива: " + a);
    }
}

class FirstHomeWork7 {
    public static void main(String[] args) {
        int[] array1 = new int[8];
        int j = 0;
        int massMax = array1.length;

        for (int i = 0; i < massMax; i++) {
            System.out.print(i + "-" + array1[i] + " ");

        }
        System.out.println(" ");
        for (int i = 0; i < massMax; i++, j = j + 3) {
            array1[i] = j;
        }
        for (int i = 0; i < massMax; i++) {
            System.out.print(i + "-" + array1[i] + " ");
        }
    }
}

class FirstHomeWork8 {
    public static void main(String[] args) {
        // Возможный выбор: Завтрак, Обед, Ужин. При введении других значений, выведется дефолт.

        String timeToEat = "Завтрак";

        switch (timeToEat) {
            case "Завтрак":
                System.out.println("2 варёных яйца, кусочек хлеба, творог.");
                break;
            case "Обед":
                System.out.println("Гречка, отварная куриная грудка, овощи.");
                break;
            case "Ужин":
                System.out.println("Творог с ягодами или лёгкий овощной салат.");
                break;
            default:
                System.out.println("Пейте воду, господа!");
        }

    }
}
