package org.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss(String name) {
        if (name == null) {
            return false;
        }

        // Проверяем длину строки
        if (name.length() < 3 || name.length() > 19) {
            return false;
        }

        // Проверяем количество пробелов
        int spaceCount = name.length() - name.replace(" ", "").length();
        if (spaceCount != 1) {
            return false;
        }

        // Проверяем, что пробел не в начале и не в конце
        if (name.startsWith(" ") || name.endsWith(" ")) {
            return false;
        }

        return true;
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        
    }

}