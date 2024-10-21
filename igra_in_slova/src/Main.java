import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] words = {"привет", "самокат", "компьютер", "программирование", "java"};
        String wordToGuess = words[random.nextInt(words.length)];
        char[] hiddenWord = new char[wordToGuess.length()];
        Arrays.fill(hiddenWord, '_');
        int lives = 6;

        System.out.println("Добро пожаловать в игру \"Виселица\"!");
        drawHuman(lives);
        System.out.println("Слово: " + Arrays.toString(hiddenWord));
        System.out.println("Жизни: " + lives);

        while (lives > 0 && !String.valueOf(hiddenWord).equals(wordToGuess)) {
            System.out.print("Введите букву: ");
            char guess = scanner.next().toLowerCase().charAt(0);
            boolean found = false;
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    hiddenWord[i] = guess;
                    found = true;
                }
            }
            if (!found) {
                lives--;
                System.out.println("Неверно. Осталось жизней: " + lives);
            }
            drawHuman(lives);
            System.out.println("Слово: " + Arrays.toString(hiddenWord) + "\nОсталось жизней: " + lives);
        }
        if (lives == 0) {
            System.out.println("Вы проиграли! Слово было: " + wordToGuess);
            drawHuman(0);
        } else {
            System.out.println("Вы выиграли! Слово: " + wordToGuess);
        }
    }

    public static void drawHuman(int lives) {
        System.out.println("-------");
        System.out.println("      |");
        if (lives < 6) {
            System.out.println("      O");
        } else {
            System.out.println("      ");
        }
        if (lives < 4) {
            System.out.println("     /|\\");
        } else {
            System.out.println("      ");
        }
        if (lives < 2) {
            System.out.println("     / \\");
        } else {
            System.out.println("      ");
        }
        System.out.println("      |");
        System.out.println("    -----");
    }
}