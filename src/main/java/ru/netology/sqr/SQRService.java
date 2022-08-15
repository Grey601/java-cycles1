package ru.netology.sqr;
public class SQRService {

    public int countSqrInsideRange(int startRange, int stopRange) {
        int quantity = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= startRange) {
                if (i * i <= stopRange) {
                    quantity = quantity + 1;
                }
            }
        }
        return quantity;
    }
}

