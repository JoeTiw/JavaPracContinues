public class FirstProj {
    public static void main(String[] args) {

       pattern(5);

    }

    private static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
                for (int k = i; k <= n; k++) {
                    System.out.print("* ");
                }
                System.out.println();

        }


            for (int a = 5; a >= 1; a--) {
                for (int b = 1; b <= a; b++) {
                    System.out.print(" ");
                }
                for (int c = a; c <= 5; c++) {
                    System.out.print("* ");
                }
                System.out.println();

            }
        }
    }


