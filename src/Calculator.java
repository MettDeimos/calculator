import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //BinaryOperator<Integer> devide = (x, y) -> x / y; // возможна ошибка "деление на ноль"

    BinaryOperator<Integer> devide = (x, y) -> y > 0 ? x / y : 0;
    //BinaryOperator<Integer> devide = (x, y) -> {
    //   int res = 0;
    //   if (y != 0) res = x / y;
    //   return res;
    // };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
