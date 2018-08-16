package example.com.hi;
import java.util.LinkedList;
import java.lang.String;
import java.util.Scanner;

public class bankomat {
    public static void main(String[] args) {

        LinkedList<String> cash5 = new LinkedList< >();
        for (int x = 0; x < 2400; x++) {
            cash5.add("5");
        }
        int add = 1;
        int give = 2;
        System.out.println("Если вы хотите положить деньги нажмите: 1");
        System.out.println("Если вы хотите снять деньги нажмите: 2");

        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        if (L == add) {
            System.out.println("Какую сумму вы хотите положить: ");
            int N = in.nextInt();
            for (int y = 0; y < N / 5; y++) {
                cash5.add("5");
            }
            System.out.println("Баланс составляет: " + cash5.size() * 5 + "$");
        }

        if (L == give)
            System.out.println("Сколько денег вы хотите снять? ");
        int k = in.nextInt();
        int s = cash5.size()*5;

        if (k > s)

            System.out.println("Ошибка! В банкомате отсутствует заданная сумма.");
        else
            s = s - k;
        System.out.println("Баланс равен " + s + "$.");
    }
}
