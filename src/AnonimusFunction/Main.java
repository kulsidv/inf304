package AnonimusFunction;

import java.util.function.Function;

public class Main {
    public  static void main(String[] args) {
        Function<Double, Double> sqrt = new Sqrt();
        Function<Double, Double> sqrt1 = (a) -> Math.sqrt(a);
        Function<Double, Double> sqrt2 = Math::sqrt;

        System.out.println(sqrt.apply(121D));
        System.out.println(sqrt1.apply(400D));
        System.out.println(sqrt1.apply(100D));
    }
    static class Sqrt implements Function<Double, Double> {

        @Override
        public Double apply(Double aDouble) {
            return Math.sqrt(aDouble);
        }
    }
}
