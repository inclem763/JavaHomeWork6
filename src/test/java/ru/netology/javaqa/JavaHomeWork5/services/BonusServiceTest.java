package ru.netology.javaqa.JavaHomeWork5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {

    @Test
    void MonthsOfRestNextYear() {
        BonusService service = new BonusService();

        int count = 2; //ожидается получить
        int income = 100_000; //доход в месяц
        int expences = 60_000; //расход в месяц
        long actual = service.calculate(income, expences);
        Assertions.assertEquals(count, actual);


    }
}
