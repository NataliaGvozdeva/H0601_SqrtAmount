package ru.netology.sqr;

public class SQRService {

    public int findAmount(int startRange, int upperRange) {

        int counter = 0;

        for (int i = 10; i <= 99; i++) {

            if (i * i >= startRange && i * i <= upperRange) {
                counter++;
            }
        }

        return counter;
    }

}
