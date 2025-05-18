package app;
//Імпортуємо класи для роботи з блокуванням (Lock і ReentrantLock)
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Клас, який містить логіку зміни чисел
public class DataHandler {
//Створюємо об'єкт блокування типу Lock, ініціалізуємо як ReentrantLock
    private final Lock lock = new ReentrantLock();
//Метод, який приймає число і повертає нове змінене значення
    public int modify(int num) {
      //Блокуємо доступ до коду нижче (щоб працював лише один потік одночасно)
        lock.lock();
        try {
            //Змінюємо число: множимо його на 3 і повертаємо нове значення
            num = num * 3;
            return num;
        } finally {
            lock.unlock();
        }
    }
}
