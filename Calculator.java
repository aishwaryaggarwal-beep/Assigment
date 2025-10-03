public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
    return a * b;
    }

   public int div(int a, int b) {
    if (b != 0) return a / b;
    else throw new IllegalArgumentException("Cannot divide by zero");
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add: " + calc.add(10, 5));
        System.out.println("Sub: " + calc.sub(10, 5));
        System.out.println("Div: " + calc.div(10,5));
        System.out.println("Mul: " + calc.mul(10,5));
    }
}
