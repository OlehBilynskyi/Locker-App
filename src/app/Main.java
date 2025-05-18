package app;

public class Main {

    public static void main(String[] args) {
        //Створюємо масив чисел, який ми будемо обробляти та викликаємо метод getData () з класу DataRepository
        int[] numbers = new DataRepository().getData();
        //Створюємо об'єкт класу DataHandler, щоб використовувати його метод modify()
        DataHandler dataHandler = new DataHandler();

        //Цикл for-each: перебираємо кожне число з масиву numbers
        for (int num : numbers) {
            //Виводимо початкове значення числа
            System.out.println("Initial value is " + num);
            //Змінюємо число, викликаючи метод modify з класу DataHandler, та виводимо нове значення після обробки
            int newNum = dataHandler.modify(num);
            System.out.println("New value is " + newNum);
        }
    }
}
