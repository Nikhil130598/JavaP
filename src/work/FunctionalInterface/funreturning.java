package work.FunctionalInterface;

import java.util.function.Function;

public class funreturning {

    static Function<Integer,Integer> getSquarefun(){
        return x -> x*x;
    }

    public static void main(String[] args){

        Function<Integer , Integer> s = getSquarefun();

        System.out.println(s.apply(5));


    }

}



