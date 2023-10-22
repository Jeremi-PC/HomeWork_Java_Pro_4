package org.example.group;

import java.util.ArrayList;
import java.util.Scanner;

// Создайте класс Group, который хранит фамилии всех студентов в учебной группе.
// В классе напишите метод, который по заданным первым буквам фамилии находит всех
// студентов и возвращает результат в виде списка. Вызовите метод в main.
public class Main {
    public static void main(String[] args) {
        Group group = new Group();
        group.createStudents();
        Scanner sc = new Scanner(System.in);
        System.out.println(group.studentlist);
        System.out.println("Input first two letters of student last Name: ");
        String sWord = sc.nextLine();

        group.findStudent(group.studentlist, sWord);
        System.out.println(group.foundList);

    }
 }
