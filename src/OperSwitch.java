
import java.util.Random;
import java.util.Scanner;

public class OperSwitch {
    public static void main(String[] args) {
        Scanner mn = new Scanner(System.in);
        System.out.println("Введите месяц в цифровом формате: ");
        int month = mn.nextInt();
        String monthString;
        switch (month) {
            case 1:
                monthString = "Январь";
                break;
            case 2:
                monthString = "Февраль";
                break;
            case 3:
                monthString = "Март";
                break;
            case 4:
                monthString = "Апрель";
                break;
            case 5:
                monthString = "Май";
                break;
            case 6:
                monthString = "Июнь";
                break;
            case 7:
                monthString = "Июль";
                break;
            case 8:
                monthString = "Август";
                break;
            case 9:
                monthString = "Сентябрь";
                break;
            case 10:
                monthString = "Октябрь";
                break;
            case 11:
                monthString = "Ноябрь";
                break;
            case 12:
                monthString = "Декабрь";
                break;
            default:
                monthString = "Не знаем такого";
                break;
        }
        System.out.println(monthString);
    }

    static class nobreack {
        public static void main(String[] args) {
            java.util.ArrayList<String> futureMonths = new java.util.ArrayList<String>();
            Scanner mn = new Scanner(System.in);
            System.out.println("Введите месяц в цифровом формате: ");
            int month = mn.nextInt();

            switch (month) {
                case 1:
                    futureMonths.add("January");
                case 2:
                    futureMonths.add("February");
                case 3:
                    futureMonths.add("March");
                case 4:
                    futureMonths.add("April");
                case 5:
                    futureMonths.add("May");
                case 6:
                    futureMonths.add("June");
                case 7:
                    futureMonths.add("July");
                case 8:
                    futureMonths.add("August");
                case 9:
                    futureMonths.add("September");
                case 10:
                    futureMonths.add("October");
                case 11:
                    futureMonths.add("November");
                case 12:
                    futureMonths.add("December");
                    break;
                default:
                    break;
            }

            if (futureMonths.isEmpty()) {
                System.out.println("Invalid month number");
            } else {
                for (String monthName : futureMonths) {
                    System.out.println(monthName);
                }
            }
        }
    }

    static class casedayyear {
        public static void main(String[] args) {
            int month = 2;
            int year = 2012;
            int numDays = 0;

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numDays = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numDays = 30;
                    break;
                case 2:
                    if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                        numDays = 29;
                    else
                        numDays = 28;
                    break;
                default:
                    System.out.println("Несуществующий месяц");
                    break;
            }
            System.out.println("Число дней = " + numDays);
        }

    }

    static class ifswitch {
        public static void main(String[] args) {

        }
    }

    static class ifchangeswitch {
        public static void main(String[] args) {
            Scanner mn = new Scanner(System.in);
            System.out.println("Введите месяц в цифровом формате: ");
            int month = mn.nextInt();
                   String season;

            switch (month) {
                case 12:
                case 1:
                case 2:
                    season = "Зимушка-зима";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "Весна";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "Лето";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "Осень";
                    break;
                default:
                    season = "Вы с какой планеты?";
            }
            if (month == 3 || month == 4 || month == 5)
                season = "Весна";
            else System.out.println("Мартовские песни коты поют, когда на дворе "
                    + season);
            if (month != 3 || month != 4 || month != 5);

            System.out.println("не сезон для котов "
                    + season);



        }
    }
    static class randoma {
        public static void main(String[] args) {
            Random random = new Random();

            for (int i = 0; i < 100; i++) {
                int c = random.nextInt(26) + 'a';
                System.out.println((char)c + ", " + c + ": ");
                switch (c) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        System.out.println("Гласная");
                        break;
                    case 'y':
                    case 'w':
                        System.out.println("Условная гласная");
                        break;

                    default:
                        System.out.println("Согласная");
                        break;
                }
            }
        }
    }
}
class StringSwitchDemo {

    public static int getMonthNumber(String month) {

        int monthNumber = 0;

        if (month == null) {
            return monthNumber;
        }

        switch (month.toLowerCase()) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                break;
            case "june":
                monthNumber = 6;
                break;
            case "july":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default:
                monthNumber = 0;
                break;
        }

        return monthNumber;
    }

    public static void main(String[] args) {

        String month = "August";

        int returnedMonthNumber =
                StringSwitchDemo.getMonthNumber(month);

        if (returnedMonthNumber == 0) {
            System.out.println("Invalid month");
        } else {
            System.out.println(returnedMonthNumber);
        }
    }
}
