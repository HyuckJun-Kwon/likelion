package work.com.workshop06;

public class Test02 {
    public static void main(String[] args) {
        int data = Integer.parseInt(args[0]);
        Calc calc = new Calc();
        calc.calculate(data);
    }
}
