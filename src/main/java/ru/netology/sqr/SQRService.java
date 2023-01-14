package ru.netology.sqr;

import org.w3c.dom.ls.LSOutput;

import javax.sound.sampled.SourceDataLine;

public class SQRService {

    public int calculate(int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min) {
                if (i * i <= max) {
                    count++;
                }
            }
        }
        return count;
    }
}
