public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator calculator = new ArithmeticCalculator(10,87);
        System.out.println(calculator.calculate(Operation.ADD) + "\n" +
                calculator.calculate(Operation.SUBTRACT) + "\n" +
                calculator.calculate(Operation.MULTIPLY));
    }
}