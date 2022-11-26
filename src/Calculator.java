import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (a, b) -> a + b;
    BinaryOperator<Integer> minus = (a, b) -> a - b;
    BinaryOperator<Integer> multiply = (a, b) -> a * b;
    BinaryOperator<Integer> devide = (a, b) -> {
        if (b != 0) {
            return (a / b);
        } else {
            System.out.println("На нуль делить нельзя!");
            return 0;
        }
    };
    UnaryOperator<Integer> pow = a -> a * a;
    UnaryOperator<Integer> abs = a -> a > 0 ? a : a * -1; // Работает без ошибок
    Predicate<Integer> isPositive = a -> a > 0;
    Consumer<Integer> println = System.out::println;

}
