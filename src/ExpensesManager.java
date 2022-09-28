import java.util.Scanner;

public class ExpensesManager {
    double[] expenses;
    String[] dayOfWeek = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье",};
    ExpensesManager() {
        expenses = new double[7];
    }

    double saveExpense(double moneyBeforeSalary) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("За какой день вы хотите ввести трату:");
            for (int i = 0; i < dayOfWeek.length; i++) {
                System.out.print((i + 1) + "-"  + dayOfWeek[i] + ". ");
            }
            System.out.println("\n0-Назад.");
            int day = scanner.nextInt();
            if (day > 7) {
                System.out.println("Неверный день недели");
            } else if (day == 0) {
                System.out.println("Назад");
                return moneyBeforeSalary;
            } else {
                System.out.println("Введите размер траты:");
                double expense = scanner.nextDouble();
                moneyBeforeSalary = moneyBeforeSalary - expense;
                expenses[day - 1] = expenses[day - 1] + expense;
                System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
                if (moneyBeforeSalary < 1000) {
                    System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
                }
            }
        }
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.length; i++) {
            System.out.println((i + 1) + ". " + dayOfWeek[i] + ". Потрачено " + expenses[i] + " рублей");
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
            }
        }
        if (maxExpense == 0.0) {
            System.out.println("На этой неделе нет трат");
        } else {
            System.out.println("Самая большая сумма расходов на этой неделе составила " + maxExpense + " руб.");
        }
        return maxExpense;
    }
}
