public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 1;
        while (total < 2_459_000) {
            total = i * salary;

            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            i++;

        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(" ");
        int b = 10;
        for (b = 10; b >= 1; b--) {
            System.out.print(b + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");

        int peopleYCity = 12_000_000;
        int birthNumber = 17000;
        int deathNumber = 8000;
        int year = 1;
        while (year <= 10) {
            peopleYCity = peopleYCity + (birthNumber - deathNumber);
            System.out.println("Год " + year + ", численность населения составляет " + peopleYCity);
            year++;

        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int total = 15_000;
        int savingMoney = (total / 100) * 7;
        int month = 1;
        while (total <= 12_000_000) {
            total = total + savingMoney;
            System.out.println(total);
            month++;
        }
        System.out.println(month + " месяцев");
    }

    public static void task5() {
        System.out.println("Задача 5");

        int total = 15_000;
        int savingMoney = (total / 100) * 7;
        int month = 1;
        for (total = 15_000; total <= 12_000_000; month++) {
            total = total + savingMoney;
            if (month % 6 == 0) {
                System.out.println(month + " месяц, Василий накопил " + total);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");

        int total = 15_000;
        int savingMoney = (total / 100) * 7;
        int months = 9 * 12;
        int month = 1;
        for (month = 1; month <= months; month++) {
            total = total + savingMoney;
            if (month % 6 == 0) {
                System.out.println(month + " месяц, Василий накопил " + total);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");

        int friday = 2;
        for (friday = 2; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня " + friday + "-е число. Необходимо подготовить отчёт");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");

        int currentYear = 2023;
        int yearsAfter = currentYear + 100;
        int yearsBefore = currentYear - 200;
        int period = 79;
        int firstTimeAppeared = 0;
        for (int year = yearsBefore; year <= yearsAfter; year++) {
            if (year % period == firstTimeAppeared) {
                System.out.println(year);
            }
        }
    }
}