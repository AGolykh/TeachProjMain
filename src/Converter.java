import java.util.Scanner;

public class Converter {
    double rateUSD;
    double rateEUR;
    double rateJPY;

    Converter(double usd, double eur, double jpy) {
        rateUSD = usd;
        rateEUR = eur;
        rateJPY = jpy;
    }

    void convert(double rubles) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваши сбережения: " + rubles + " RUB");
        System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
        int currency = scanner.nextInt();

        if (currency == 1) {
            System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
        } else if (currency == 2) {
            System.out.println("Ваши сбережения в евро: " + rubles / rateEUR);
        } else if (currency == 3) {
            System.out.println("Ваши сбережения в иенах: " + rubles / rateJPY);
        } else {
            System.out.println("Неизвестная валюта");
        }
    }
}
