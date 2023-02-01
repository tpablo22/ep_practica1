//quiero hacer una funcion recursiva que me devuelva el fibonnaci de un numero

public class holamundo {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(fibonacci(numero));
    }

    public static int fibonacci(int numero) {
        if (numero == 0) {
            return 0;
        } else if (numero == 1) {
            return 1;
        } else {
            return fibonacci(numero - 1) + fibonacci(numero - 2);
        }
    }
}
