package com.greedy.level02.normal;

import java.util.Random;
import com.greedy.level02.normal.RandomMaker;

public class Application {
    public static void main(String[] args) {
//        RandomMaker randomMaker = new RandomMaker();

        RandomMaker.randomNumber(10, 50);
        RandomMaker.randomUpperAlphabet(8);
        RandomMaker.rockPaperScissors();
        RandomMaker.tossCoin();


    }
}
