import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        n = 1000 - n;
        int[] money = {500, 100, 50, 10, 5, 1};
        int answer = 0;


        for (int i = 0; i < money.length; i++) {
            if (n == 0) {
                break;
            }

            if (n / money[i] != 0) {
                answer += (n / money[i]);
                n %= money[i];
            }
        }

        System.out.println(answer);

    }
}
