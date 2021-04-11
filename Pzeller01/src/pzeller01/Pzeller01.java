/*
 26/01/2021
Autor: Sergio Viñas
 */
package pzeller01;

public class Pzeller01 {

    public static void main(String[] args) {
        System.out.println("");

        int mes, any, dia;
        mes = 1;
        any = 2021;
        dia = InicioDiaMesZeller(mes, any);
        System.out.println(dia);

    }

    private static int InicioDiaMesZeller(int mes, int any) {
        int a, y, m, d, dia;
        dia = 1;
        a = (14 - mes) / 12;
        y = any - a;
        m = mes + 12 * a - 2;
        d = (dia + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        return d;
    }
}
​
