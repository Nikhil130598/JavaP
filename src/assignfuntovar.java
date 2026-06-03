import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class assignfuntovar {

    public static void printMessage(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args){
    Function<Integer , Integer> halfValue  =a -> a/2;

    System.out.println(halfValue.apply(20));

        Predicate<Integer> isEven = b -> b%2 == 0;

        System.out.println(isEven.test(20));

        Consumer<String> print = assignfuntovar::printMessage; // Using Method Reference

        print.accept("Hi Nikhil");

        Consumer<String> print1 = str -> System.out.println(str.toUpperCase());
        print1.accept("Welcome");

        Supplier<String> s = ( ) -> "ToClass";
        System.out.println(s.get());


    }

}