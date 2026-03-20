import java.util.ArrayList;
import java.util.List;

//Завдання 2
//Створіть проєкт за допомогою IntelliJ IDEA. Створіть клас MyList. Реалізуйте у найпростішому наближенні можливість
//використання його екземпляра аналогічно екземпляру класу List. Мінімально необхідний інтерфейс взаємодії з екземпляром
//повинен включати метод додавання елемента, індексатор для отримання значення елемента за вказаним індексом і
//властивість тільки для читання для отримання загальної кількості елементів.
public class Main {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();

        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

        System.out.println("Розмір списку: " + listInteger.size() + "\nмає такі елементи: ");
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.print(listInteger.get(i) + " ");
        }
    }
}
