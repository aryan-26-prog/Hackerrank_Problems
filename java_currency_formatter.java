import java.util.*;
import java.text.*;

public class java_currency_formatter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // US
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usFormat.format(payment);

        // INDIA – custom Locale
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = indiaFormat.format(payment);

        // CHINA
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaFormat.format(payment);

        // FRANCE
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
