package example.com.hi;
import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.security.auth.SolarisNumericUserPrincipal;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.lang.String;
import java.util.Scanner;

public class bankomat {
    public static void main(String[] args) {
        String Cash_5 = "5";
        final int money_5 = 5;
        LinkedList<String> cash5 = new LinkedList< >();
        for (int x = 0; x < 2400; x++) {
            cash5.add(Cash_5);
        }
        final int ADD = 1;
        final int GIVE = 2;
        System.out.println("Если вы хотите положить деньги нажмите: 1");
        System.out.println("Если вы хотите снять деньги нажмите: 2");

        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        if (L == ADD) {
            System.out.println("Какую сумму вы хотите положить: ");
            int N = in.nextInt();
            for (int y = 0; y < N / money_5; y++) {
                cash5.add(Cash_5);
            }
            System.out.println("Баланс составляет: " + cash5.size() * money_5 + "$");
        }

        if (L == GIVE)
            System.out.println("Сколько денег вы хотите снять? ");
        int k = in.nextInt();
        int s = cash5.size()*money_5;

        if (k > s)

            System.out.println("Ошибка! В банкомате отсутствует заданная сумма.");
        else
            s = s - k;
        System.out.println("Баланс равен " + s + "$.");
    }
}
