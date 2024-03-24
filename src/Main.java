public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator calculator = new ArithmeticCalculator(10,10);
        System.out.println(calculator.calculate(Operation.ADD) + "\n" +
                calculator.calculate(Operation.SUBTRACT) + "\n" +
                calculator.calculate(Operation.MULTIPLY));
        System.out.println("That's all for the now");
    }
}
