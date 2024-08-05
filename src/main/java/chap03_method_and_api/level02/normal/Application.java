package chap03_method_and_api.level02.normal;

public class Application {
    public static void main(String[] args) {
//        RandomMaker randomMaker = new RandomMaker();

        RandomMaker.randomNumber(10, 50);
        RandomMaker.randomUpperAlphabet(8);
        RandomMaker.rockPaperScissors();
        RandomMaker.tossCoin();


    }
}
