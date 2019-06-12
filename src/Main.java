import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова: ");
        String words = scanner.next();
        System.out.println("Введите слова: ");
        String words2 = scanner.next();

        boolean words3 = (words.equals(words2));
        boolean words4 = (words.equalsIgnoreCase(words2));
        boolean words5 = (words.contentEquals(words2));
                if (words3) {
                    System.out.println("Отлично! Слова одинаковы.");
                }else if (words4){
                    System.out.println("Хорошо. Почти одинаковы.");
                }else if (!words5){
                    System.out.println("Ну, хотябы они одной длины");
                }

    }
}
