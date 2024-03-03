public class Calculadora {
    private int num1;
    private int num2;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int suma() {
        return this.num1 + this.num2;
    }

<<<<<<< HEAD
    public int resta() {
        return this.num1 - this.num2;
    }

     public class PruebaCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(5, 3);
        System.out.println(calc.suma());
    }
}
=======
    public int multiplicar() {
        return this.num1 * this.num2;
    }

    public double dividir() {
        if (this.num2 != 0) {
            return (double) this.num1 / this.num2;
        } else {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
    }
>>>>>>> dividir
}