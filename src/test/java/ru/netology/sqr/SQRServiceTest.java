package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/range.csv")
    public void checkAmountOfSquareInRange(int expected, int startRange, int upperRange) {

        SQRService sqrService = new SQRService();

        // вызываем целевой метод:
        long actual = sqrService.findAmount(startRange, upperRange);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }

}
