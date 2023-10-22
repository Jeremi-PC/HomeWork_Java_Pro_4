package org.example.strings;

import java.util.ArrayList;
import java.util.Scanner;

//Создайте программу, которая принимает от пользователя неограниченное количество строк.
// Ввод строк должен закончится, когда пользователь введёт слово quit. Выведите в консоль все строки,
// которые ввёл пользователь. Реализуйте два метода – один находит самую длинную строку в списке,
// второй – самую короткую строку. Выведите самую длинную и самую короткую из строк в консоль.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> inputStr = new ArrayList<String>();
        while (true) {
            System.out.println("Input default string:");
            String str = sc.nextLine();
            if (str.equals("quit")) {
                break;
            }
            inputStr.add(str);
        }
        for (String str : inputStr
        ) {
            System.out.println(str);
        }
        System.out.println("Longest string: " + maxLength(inputStr));
        System.out.println("Shortest string: " + minLength(inputStr));

    }

    public static String maxLength(ArrayList<String> inputStr) {
        String maxLenghtStr = inputStr.get(0);
        for (String str : inputStr) {
            if (str.length() > maxLenghtStr.length()) {
                maxLenghtStr = str;
            }
        }
        return maxLenghtStr;
    }
    public static String minLength(ArrayList<String> inputStr) {
        String minLenghtStr = inputStr.get(0);
        for (String str : inputStr) {
            if (str.length() < minLenghtStr.length()) {
                minLenghtStr = str;

            }
        }
        return minLenghtStr;
    }

}
