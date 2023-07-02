package ru.netology.javaqa.JavaHomeWork5.services;

public class BonusService {
    public int calculate(int income, int expenses) {
        int count = 0; // счётчик месяцев отдыха
        int treshold = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {

            if (treshold >= 150_000) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                treshold = income - expenses - (treshold * 3);
            } else {
                treshold = treshold + income;

            }
        }
        return count;
    }
}
