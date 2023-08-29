// Используя вложенные циклы while (цикл в цикле) выведи на экран
// незаполненный прямоугольник (его контур) размером 10 (высота)
//  на 20 (ширина) из букв 'Б'. Незаполненная часть состоит из пробелов.

// Требования
// - Программа должна выводить текст на экран.
// - Программа должна выводить контур прямоугольника высотой 10 и шириной 20 из буквы 'Б'.
// - В программе необходимо использовать вложенные циклы while (цикл в цикле).
// - Вывод на экран должен происходить в цикле while.

public class Main {
    public static void main(String[] args) {

        int a = 0;

        while (a++ < 10) {
            int b = 0;
            while (b++ < 20) {
                if (b == 1 || b == 20 || a == 1 || a == 10) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}