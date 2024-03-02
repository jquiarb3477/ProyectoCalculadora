public class Calculadora {
    Private int num1;
    Private int num2;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int suma() {
        return this.num1 + this.num2;
    }

    public class PruebaCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(5, 3);
        System.out.println(calc.suma());
    }
}

}