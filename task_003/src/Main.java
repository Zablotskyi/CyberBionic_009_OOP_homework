//Завдання 3
//Створіть проєкт за допомогою IntelliJ IDEA. Створіть клас MyDictionary. Реалізуйте у найпростішому наближенні
//можливість використання його екземпляра. Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати
//метод додавання пар елементів, індексатор для отримання значення елемента за вказаним індексом і властивість тільки
//для читання для отримання загальної кількості пар елементів.
public class Main {
    public static void main(String[] args) {
        MyDictionary<Integer, String> dictionary = new MyDictionary<>();

        dictionary.add(1, "один");
        dictionary.add(2, "два");
        dictionary.add(3, "три");
        dictionary.add(4, "чотири");
        dictionary.add(5, "п'ять");

        System.out.println("Кількість слів у словнику: " + dictionary.getSize());
        System.out.println("Мапа містить такі пари слів: ");

        for (int i = 0; i < dictionary.getSize(); i++) {
            System.out.println(i + ": " + dictionary.getKey(i) + " -> " + dictionary.getValue(i));
        }
    }
}
