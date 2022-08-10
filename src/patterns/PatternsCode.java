package patterns;

public class  PatternsCode{

    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");

        }
    }
    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i ; j++) {
               // int a =1;
                System.out.print(i+" ");
                //a++;
            }
            System.out.println(" ");

        }
    }
    public static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            int a =1;

            for (int j = 0; j < i ; j++) {
               // int a =1;
                System.out.print(a+" ");
                a++;

            }
            System.out.println(" ");

        }
    }

    public static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            int a =1;
            for (int j = 0; j < i; j++) {
                // int a =1;
                System.out.print(a+" ");
              //  a++;
            }
            for (int j = 0; j < i ; j++) {
                // int a =1;
                System.out.print(a+" ");
              //  a++;
            }
            System.out.println(" ");
            a++;
        }
    }

    public static void main(String[] args) {
        PatternsCode.pattern1(10);
        PatternsCode.pattern2(10);
        PatternsCode.pattern3(10);
        PatternsCode.pattern4(10);

    }
}

