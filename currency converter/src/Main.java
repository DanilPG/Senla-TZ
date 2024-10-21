import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double currency = 1;
        System.out.println("Введите валюту");
        System.out.println("У меня есть: RUB USD EUR GBP CHF JPY");
        Scanner sc = new Scanner(System.in); // Используем один Scanner
        String currency1 = sc.nextLine();
        System.out.println("Вы выбрали " + currency1);
        System.out.println("Введите количество: ");
        double count_currency1 = sc.nextDouble();
        sc.nextLine(); // Считываем оставшийся символ новой строки
        System.out.println("Хочу приобрести: RUB USD EUR GBP CHF JPY");
        String currency2 = sc.nextLine();
        System.out.println("Вы выбрали " + currency2);

        switch (currency1) {
            case "RUB":
                switch (currency2) {
                    case "USD":
                        currency = count_currency1 * 0.0104;
                        System.out.println(currency);
                        break;
                    case "EUR":
                        currency = count_currency1 * 0.0095;
                        System.out.println(currency);
                        break;
                    case "GBP":
                        currency = count_currency1 * 1.5468;
                        System.out.println(currency);
                        break;
                    case "CHF":
                        currency = count_currency1 * 0.0089;
                        System.out.println(currency);
                        break;
                    case "JPY":
                        currency = count_currency1 * 1.5468;
                        System.out.println(currency);
                        break;
                    default:
                        System.out.println("Неправильная вторая валюта.");
                        break; // Важно выйти из внутреннего switch
                }
                break; // Важно выйти из внешнего switch
            case "USD":
                switch (currency2) {
                    case "RUB":
                        currency = count_currency1 * 96.1021;
                        System.out.println(currency);
                        break;
                    case "EUR":
                        currency = count_currency1 * 0.911;
                        System.out.println(currency);
                        break;
                    case "GBP":
                        currency = count_currency1 * 0.7648;
                        System.out.println(currency);
                        break;
                    case "CHF":
                        currency = count_currency1 * 0.86;
                        System.out.println(currency);
                        break;
                    case "JPY":
                        currency = count_currency1 * 148.65;
                        System.out.println(currency);
                        break;
                    default:
                        System.out.println("Неправильная вторая валюта.");
                        break; // Важно выйти из внутреннего switch
                }
                break;
            case "EUR":
                switch (currency2) {
                    case "RUB":
                        currency = count_currency1 * 105.4855;
                        System.out.println(currency);
                        break;
                    case "USD":
                        currency = count_currency1 * 1.0976;
                        System.out.println(currency);
                        break;
                    case "GBP":
                        currency = count_currency1 * 0.8395;
                        System.out.println(currency);
                        break;
                    case "CHF":
                        currency = count_currency1 * 0.944;
                        System.out.println(currency);
                        break;
                    case "JPY":
                        currency = count_currency1 * 163.1641;
                        System.out.println(currency);
                        break;
                    default:
                        System.out.println("Неправильная вторая валюта.");
                        break; // Важно выйти из внутреннего switch
                }
                break;
            case "GBP":
                switch (currency2) {
                    case "RUB":
                        currency = count_currency1 * 125.6536;
                        System.out.println(currency);
                        break;
                    case "EUR":
                        currency = count_currency1 * 1.1912;
                        System.out.println(currency);
                        break;
                    case "USD":
                        currency = count_currency1 * 1.3075;
                        System.out.println(currency);
                        break;
                    case "CHF":
                        currency = count_currency1 * 0.8893;
                        System.out.println(currency);
                        break;
                    case "JPY":
                        currency = count_currency1 * 194.3601;
                        System.out.println(currency);
                        break;
                    default:
                        System.out.println("Неправильная вторая валюта.");
                        break; // Важно выйти из внутреннего switch
                }
                break;
            case "CHF":
                switch (currency2) {
                    case "RUB":
                        currency = count_currency1 * 111.7466;
                        System.out.println(currency);
                        break;
                    case "EUR":
                        currency = count_currency1 * 105.9356;
                        System.out.println(currency);
                        break;
                    case "GBP":
                        currency = count_currency1 * 0.8893;
                        System.out.println(currency);
                        break;
                    case "USD":
                        currency = count_currency1 * 1.1628;
                        System.out.println(currency);
                        break;
                    case "JPY":
                        currency = count_currency1 * 172.8489;
                        System.out.println(currency);
                        break;
                    default:
                        System.out.println("Неправильная вторая валюта.");
                        break; // Важно выйти из внутреннего switch
                }
                break;
            case "JPY":
                switch (currency2) {
                    case "RUB":
                        currency = count_currency1 * 0.6465;
                        System.out.println(currency);
                        break;
                    case "EUR":
                        currency = count_currency1 * 0.6129;
                        System.out.println(currency);
                        break;
                    case "GBP":
                        currency = count_currency1 * 0.0051;
                        System.out.println(currency);
                        break;
                    case "CHF":
                        currency = count_currency1 * 0.0058;
                        System.out.println(currency);
                        break;
                    case "USD":
                        currency = count_currency1 * 0.0067;
                        System.out.println(currency);
                        break;
                    default:
                        System.out.println("Неправильная вторая валюта.");
                        break; // Важно выйти из внутреннего switch
                }
                break;

            default:
                System.out.println("Неправильная первая валюта.");
                break;
        }
        sc.close(); // Закрытие Scanner
    }
}