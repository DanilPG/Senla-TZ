import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Добро пожаловать в генератор паролей!");
        System.out.println("Введите длину пароля от 8 до 12 символов: ");
        Byte lenght_pass = sc.nextByte();
        if(lenght_pass < 8 || lenght_pass > 12){
            System.out.println("Неверно задана длинна пароля. Длинна пароля должна быть от 8 до 9 символов.");
            System.out.println("Введите длину пароля от 8 до 12 символов: ");
            lenght_pass = sc.nextByte();
        }
        System.out.println("Ваш сгенерированный пароль: " + generatepass(lenght_pass)); // Изменяйте длину пароля
    }

    public static String generatepass(int length) {
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()_+=-`~|}{[]:;?><,./";;
        String allChars = uppercaseChars + lowercaseChars + numbers + symbols;
        StringBuilder password = new StringBuilder();
        Random random = new Random();
        password.append(uppercaseChars.charAt(random.nextInt(uppercaseChars.length())));
        password.append(lowercaseChars.charAt(random.nextInt(lowercaseChars.length())));
        password.append(numbers.charAt(random.nextInt(numbers.length())));
        password.append(symbols.charAt(random.nextInt(symbols.length())));
        for (int i = 4; i < length; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }
        for (int i = 0; i < password.length(); i++) {
            int j = random.nextInt(password.length());
            char temp = password.charAt(i);
            password.setCharAt(i, password.charAt(j));
            password.setCharAt(j, temp);
        }
        return password.toString();
    }
}
