public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(2, 8);
        int b = calc.minus.apply(2, 1);
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);

        System.out.println(calc.abs.apply(b));
    }
}