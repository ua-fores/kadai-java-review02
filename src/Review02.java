
public class Review02 {

    public static void main(String[] args) {
//        【FizzBuzz問題】
//        1から100までの連続した整数を画面に表示する。ただし、下記の条件にしたがうこと：
//        ・もし、その整数が3で割り切れる数なら "Fizz" と表示する
//        ・もし、その整数が5で割り切れる数なら "Buzz" と表示する
//        ・上記2つの条件は同時に満たせる。つまり、もし、その整数が3で割り切れ、なおかつ5で割り切れる数なら "FizzBuzz" と表示する
//        ・それ以外の数は、その数をそのまま表示する

        for(int i=1;i<=100;i++) {
            //整数が3で割り切れ、なおかつ5で割り切れる数の場合を出力
            if((i%3==0)&&(i%5==0)) {
                println("FizzBuzz");
            //整数が3で割り切れる数の場合を出力
            } else if ((i%3==0)){
                println("Fizz");
            //整数が5で割り切れる数の場合を出力
            } else if ((i%5==0)){
                println("Buzz");
            //それ以外の数の場合を出力
            } else {
                println(i);
            }
        }
    }
    public static void println(String msg) {
        System.out.println(msg);
    }

    public static void println(int num) {
        System.out.println(num);
    }
}
