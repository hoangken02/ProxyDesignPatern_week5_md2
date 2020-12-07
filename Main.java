public class Main {
    public static void main(String[] args) {
        MathCalculatorProxy mathCalculatorProxy = new MathCalculatorProxy();
        double result = mathCalculatorProxy.add(1, 2);
        System.out.println("1 + 2 = " + result);

        result = mathCalculatorProxy.add(2, Double.MAX_VALUE);
        System.out.println("2 + MAX_VALUE = " + result);

        result = mathCalculatorProxy.div(1, 0);
        System.out.println("1 / 0 = " + result);
    }
}
