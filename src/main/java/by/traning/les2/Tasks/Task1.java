package by.traning.les2.Tasks;

import java.util.Scanner;

// Составить линейную программу, печатающую значение true,
// если указанное высказывание является истинным, и false — в противном случае:
// Сумма двух первых цифр заданного четырехзначного числа
// равна сумме двух его последних цифр

public class Task1 {

    public static int [] inputNumber() {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrect;
        int[] array = new int[4];
         do {
             isCorrect = false;
            System.out.println("Введите число ХХХХ");
            String number = scanner.nextLine();

            if (number.length()< 4){
                isCorrect = true;
                System.out.println("Короткое число");
                continue;
            }
            String[] stringArray = number.split("");
            for (int i = 0; i < 4; i++) {
                try {
                    array [i] = Integer.valueOf(stringArray[i]);
                } catch (NumberFormatException e) {
                    System.out.println("Не верный формат");
                   // e.printStackTrace();
                    isCorrect = true;
                    break;
                }
            }
        }while (isCorrect);
        return array;
    }

    public static boolean isEquel (int [] array){
        boolean resalt;
        if (array [0] + array [1] == array [2] + array [3]){
            resalt = true;
        } else resalt = false;
        return resalt;
    }

    public static void printResalt (boolean resalt){
        System.out.println(resalt);
    }

    public static void main(String[] args) {
        printResalt(isEquel(inputNumber()));


    }
}
