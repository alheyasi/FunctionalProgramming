package secondchapter;

import java.util.function.Function;

public class example1 {

    static Function<Integer,Integer> squares = x -> x * x;

    static Function<Integer, Function<Integer,Integer>> add2numbers = x -> y -> x+y;

    public static void main(String[] args) {
        System.out.println("Hello Aref");
        System.out.println(squares.apply(4));
        System.out.println(add2numbers.apply(2).apply(3));
    }
}
