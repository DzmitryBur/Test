import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) {
//        int a = 0;
//        while (a < 26) {
//            System.out.print(a + " ");
//            ++a;
//        };

//        for (int i = 2; i < 21; i++) {
//            if (i % 2 == 0 && i > 10) {
//                System.out.println(i);
//            }
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input any number: ");
//        int d = sc.nextInt();
//        if (d % 2 == 0) {
//            System.out.println("Your number is even: " + d);
//        }

//        for (int i = 0; i < 3; i++) {
//            int f = 15 + (int) (Math.random() * 6);
//            System.out.print(f + " ");
//        }

//        String sint = "123";
//        String sdouble = "123.345";
//        int x;
//        double c,v;
//
//        x = Integer.parseInt(sint);
//        c = Double.parseDouble(sdouble);
//        System.out.println(x);
//        System.out.println(c);
//
//        sint = String.valueOf(x + 1);
//        System.out.println(sint);
//
//        String strr = "num" + 345;
//        System.out.println(strr);

//        Scanner ss = new Scanner(System.in);
//        System.out.print("Input your number: ");
//        int numb = ss.nextInt();
//        while (numb != 5) {
//            System.out.print("Please repeat your input: ");
//            numb = ss.nextInt();
//        }
//            System.out.print("Your number is 5. The end.");

//        Scanner sd = new Scanner(System.in);
//        System.out.println("Input number of elements of array: ");
//        int n = sd.nextInt();
//        double[] mas_double = new double[n];
//        for (int i = 0; i < mas_double.length; i++) {
//            mas_double[i] = (Math.random() * 10);
////            System.out.println(Arrays.toString(mas_double));
//            if (i % 3 == 0 && i != 0) {
//                mas_double[i] = mas_double[i] * mas_double[i];
//            }
//        }
//        System.out.println(Arrays.toString(mas_double));
//        for (int i = mas_double.length - 1; i >= 0; i--) {
//            System.out.print(mas_double[i] + ", ");
//        }

        int[] w = {2, 5, 6, 2, 1, -3, 7, -3};
        Arrays.sort(w);
        System.out.println("Sorted array: " + Arrays.toString(w));

        int a = 5;
        int b = 6;
        int d = Square(5, b);
        System.out.println("Square is: " + d);

        double q = 4.5;
        double ww = 5.4;
        double r = Difference(q, ww);
        System.out.println("Diderrence is: " + r);

        int z = 4, x = 5, c = 3;
        String cvb = ABC(z, x, c);
        System.out.println(cvb);

        int[] arr = {3, 4, 5, 2, 1};
        int y = ARR(arr);
        System.out.println("Lenght of array is: " + y);

        double[] db = {3.3, 3.0, 3.1};
        double summd = sumOfElements(db);
        System.out.println("Sum of elemets of your array is: " + summd);

        sOfAnimals("Elephant", "Camel", "Rabbit");


    }

    public static double Difference(double a, double b) {
        double c = a - b;
        return c;
    }

    private static int Square(int a, int b) {
        int c = a * b;
        return c;
    }

    public static String ABC(int a, int b, int c) {
        String w = String.valueOf(a);
        String e = String.valueOf(b);
        String r = String.valueOf(c);

        String str = (w + " + " + e + " + " + r);
        return str;
    }

    public static int ARR(int[] a) {
        for (int i = 0; i < a.length; i++) {
        }
        return a.length;
    }

    public static double sumOfElements(double[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }


    static void sOfAnimals(String... Animals) {
        System.out.println(Arrays.asList(Animals));
    }

}
