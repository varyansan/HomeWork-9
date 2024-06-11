import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание №1");

        int[] spendingInMonth = {25621, 40198, 10007, 60131, 48132};
        int sum = 0;
        for (int i : spendingInMonth) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        System.out.println("Задание №2");

        int[] spendingInWeek = new int[5];
        spendingInWeek[0] = 23601;
        spendingInWeek[1] = 20130;
        spendingInWeek[2] = 14032;
        spendingInWeek[3] = 26000;
        spendingInWeek[4] = 34433;

        int maxSpending = 0;
        int minSpending = 100_000;
        for (int a = 0; a < spendingInWeek.length; a++) {
            if (spendingInWeek[a] > maxSpending) {
                maxSpending = spendingInWeek[a];
            } else if (spendingInWeek[a] < minSpending) {
                minSpending = spendingInWeek[a];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSpending + " рублей. " +
                "Максимальная сумма трат за неделю составила " + maxSpending + " рублей.");

        System.out.println("Задание №3");

        double[] spendingInMonth2 = {32410, 10452, 36142, 65841, 16033};
        double result = 0;
        for (double k : spendingInMonth2) {
            result += k;
        }
        System.out.println("Средняя сумма трат за месяц составила " + result / spendingInMonth2.length + " рублей");

        System.out.println("Задание №4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int v = reverseFullName.length - 1; v >= 0; v--) {
            System.out.print(reverseFullName[v]);
        }
    }
}