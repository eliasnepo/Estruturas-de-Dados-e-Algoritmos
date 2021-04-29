package programacao_dinamica;

import java.util.HashMap;

public class Fibonacci {
    static HashMap<Integer, Integer> cache = new HashMap<>();
    static int contadorDeOperacoes = 0;

    public int calculo(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        } else {
            if (n < 2) {
                return n;
            } else {
                contadorDeOperacoes++;
                cache.put(n, calculo(n - 1) + calculo(n - 2));
                return cache.get(n);
            }
        }
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.calculo(10));
        System.out.println(contadorDeOperacoes);
    }
}
