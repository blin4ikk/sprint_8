package org.example;

public class Praktikum {

    public static void main(String[] args) {
        String name = "Тимоти Шаламе";

        Account newAccount = new Account(name);
        newAccount.checkNameToEmboss(name);
        System.out.println(newAccount.checkNameToEmboss(name));
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
    }

}