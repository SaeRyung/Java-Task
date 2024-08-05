package chap03_method_and_api.level02.normal;

public class RandomMaker {
    // 최소값부터 최대값까지 범위의 난수 반환함
    public static int randomNumber(int min, int max) {
        int random = (int)(Math.random() * max ) - min;
        System.out.println(random);
        return 0;
    }

    // 인자의 길이 만큼의 랜덤한 대문자
    // 알파벳으로 이루어진 문자열을 반환함
    public static String randomUpperAlphabet(int length) {
        String str = "";
        for(int i = 0; i<length; i++) {
            int random1 = (int)(Math.random()* 122 )+ 65;
            char ch = (char)random1;
            str = str + ch;
        }
        System.out.println(str);
        return "";
    }


    // 가위, 바위, 보 중 한가지를 반환함
    public static String rockPaperScissors(){
        String result = "";
        int random2 = (int)(Math.random()*2);
        if(random2 == 0){
            System.out.println("가위");
        }
        if(random2 == 1){
            System.out.println("바위");
        }
        if(random2 == 2){
            System.out.println("보");
        }
        return "";
    }

    // 동전의 앞면, 뒷면 중 한 가지를 반환함
    public static String tossCoin(){
        String result = "";
        int random3 = (int)(Math.random()*1);
        if(random3 == 0){
            System.out.println("앞면");
        }else{
            System.out.println("뒷면");
        }
        return "";
    }
}


