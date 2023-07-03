package ru.netology.javaqa.JavaHomeWork5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {
    @Test
    void MonthsOfRestNextYear() {
        BonusService service = new BonusService();
        int expected = 3; //ожидается получить
        int income = 10_000; //доход в месяц
        int expenses = 3_000; //расход в месяц
        int treshold = 20_000; //есть возможность на отдых
        long actual = service.calculate(income, expenses, treshold);
        Assertions.assertEquals(expected, actual);

    }
}
