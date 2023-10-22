package org.example.nums;

public class Main {
    //Напишите метод, который создаёт список с произвольным количеством элементов.
    // Список должен быть заполнен случайными числами в диапазоне от -100 до 100 включительно.
    // Напишите второй метод, который принимает список чисел и удаляет из него все отрицательные числа.
    // В main вызовите оба метода.
    public static void main(String[] args) {
        RandomNums randomNums = new RandomNums();
        System.out.println(randomNums.createRandomList());
        randomNums.delNegative(randomNums.list);
        System.out.println(randomNums.list);
    }
}
