import java.util.Scanner;


public class Gato{
    
    public static void main(String[] cat) {

        char[] gato = new char[9];

        gato[0] = '-';
        gato[1] = '-';
        gato[2] = '-';
        gato[3] = '-';
        gato[4] = '-';
        gato[5] = '-';
        gato[6] = '-';
        gato[7] = '-';
        gato[8] = '-';

        int sel1, sel2, sel3, sel4, sel5, sel6, sel7, sel8, sel9;

        System.out.println("Jugador 1 Introduzca su nombre: ");
        Scanner nombre_jugador = new Scanner(System.in);
        String j1 = nombre_jugador.nextLine();

        System.out.println("Jugador 2 Introduzca su nombre");
        String j2 = nombre_jugador.nextLine();

        System.out.println("");

        System.out.println("" + j1 + " elija una casilla: ");

        System.out.println("");

        System.out.println("|" + gato[0] + "|" + gato[1] + "|" + gato[2] + "|");
        System.out.println("|" + gato[3] + "|" + gato[4] + "|" + gato[5] + "|");
        System.out.println("|" + gato[6] + "|" + gato[7] + "|" + gato[8] + "|");

        System.out.println("");

        Scanner seleccion = new Scanner(System.in);
        sel1 = seleccion.nextInt();
        sel1 = sel1 - 1;

        gato[sel1] = 'X';

        System.out.println("|" + gato[0] + "|" + gato[1] + "|" + gato[2] + "|");
        System.out.println("|" + gato[3] + "|" + gato[4] + "|" + gato[5] + "|");
        System.out.println("|" + gato[6] + "|" + gato[7] + "|" + gato[8] + "|");

        System.out.println("");

        System.out.println("" + j2 + " elija una casilla");
        sel2 = seleccion.nextInt();
        sel2 = sel2 - 1;

        if (sel2 == sel1) {
            System.out.println("Esta casilla ya fue seleccionada por otro jugador");
            System.out.println("Por favor elija una casilla distinta: ");
            sel2 = seleccion.nextInt();
            sel2 = sel2 - 1;

            gato[sel2] = 'O';

            System.out.println("");

            System.out.println("|" + gato[0] + "|" + gato[1] + "|" + gato[2] + "|");
            System.out.println("|" + gato[3] + "|" + gato[4] + "|" + gato[5] + "|");
            System.out.println("|" + gato[6] + "|" + gato[7] + "|" + gato[8] + "|");

            System.out.println("");

        } else {
            gato[sel2] = 'O';

            System.out.println("");

            System.out.println("|" + gato[0] + "|" + gato[1] + "|" + gato[2] + "|");
            System.out.println("|" + gato[3] + "|" + gato[4] + "|" + gato[5] + "|");
            System.out.println("|" + gato[6] + "|" + gato[7] + "|" + gato[8] + "|");

            System.out.println("");

        }

        System.out.println("" + j1 + " selecione otra casilla: ");
        sel3 = seleccion.nextInt();
        sel3 = sel3 - 1;

        if (sel3 == sel1 || sel3 == sel2) {
            System.out.println("Esta casilla ya fue seleccionada por otro jugador");
            System.out.println("Por favor elija una casilla distinta: ");
            sel2 = seleccion.nextInt();
            sel2 = sel2 - 1;

            gato[sel3] = 'X';

            System.out.println("");

            System.out.println("|" + gato[0] + "|" + gato[1] + "|" + gato[2] + "|");
            System.out.println("|" + gato[3] + "|" + gato[4] + "|" + gato[5] + "|");
            System.out.println("|" + gato[6] + "|" + gato[7] + "|" + gato[8] + "|");

            System.out.println("");

        } else {
            gato[sel3] = 'X';

            System.out.println("");

            System.out.println("|" + gato[0] + "|" + gato[1] + "|" + gato[2] + "|");
            System.out.println("|" + gato[3] + "|" + gato[4] + "|" + gato[5] + "|");
            System.out.println("|" + gato[6] + "|" + gato[7] + "|" + gato[8] + "|");

            System.out.println("");

        }

        System.out.println(j2 + " seleccione otra casilla:");
        sel4 = seleccion.nextInt();
        sel4 = sel4 - 1;

        if (sel4 == sel1 || sel4 == sel2 || sel4 == sel3) {
            System.out.println("Esta casilla ya fue seleccionada por otro jugador");
            System.out.println("Por favor elija una casilla distinta: ");
            sel4 = seleccion.nextInt();
            sel4 = sel4 - 1;

            gato[sel4] = 'O';

            System.out.println("");

            System.out.println("|" + gato[0] + "|" + gato[1] + "|" + gato[2] + "|");
            System.out.println("|" + gato[3] + "|" + gato[4] + "|" + gato[5] + "|");
            System.out.println("|" + gato[6] + "|" + gato[7] + "|" + gato[8] + "|");

            System.out.println("");

        } else {
            gato[sel4] = 'O';

            System.out.println("");

            System.out.println("|" + gato[0] + "|" + gato[1] + "|" + gato[2] + "|");
            System.out.println("|" + gato[3] + "|" + gato[4] + "|" + gato[5] + "|");
            System.out.println("|" + gato[6] + "|" + gato[7] + "|" + gato[8] + "|");

            System.out.println("");

        }

        System.out.println("" + j1 + " elija otra casilla");
        sel5 = seleccion.nextInt();
        sel5 = sel5 - 1;

        if (sel5 == sel1 || sel5 == sel2 || sel5 == sel3 || sel5 == sel4) {
            System.out.println("Esta casilla ya fue seleccionada por otro jugador");
            System.out.println("Por favor elija una casilla distinta: ");
            sel5 = seleccion.nextInt();
            sel5 = sel5 - 1;

            gato[sel5] = 'X';

            System.out.println("");

            System.out.println("|" + gato[0] + "|" + gato[1] + "|" + gato[2] + "|");
            System.out.println("|" + gato[3] + "|" + gato[4] + "|" + gato[5] + "|");
            System.out.println("|" + gato[6] + "|" + gato[7] + "|" + gato[8] + "|");

            System.out.println("");

        } else {
            gato[sel5] = 'X';

            System.out.println("");

            System.out.println("|" + gato[0] + "|" + gato[1] + "|" + gato[2] + "|");
            System.out.println("|" + gato[3] + "|" + gato[4] + "|" + gato[5] + "|");
            System.out.println("|" + gato[6] + "|" + gato[7] + "|" + gato[8] + "|");

            System.out.println("");

        }
        if (gato[0] == 'X' && gato[1] == 'X' && gato[2] == 'X' || gato[0] == 'X' && gato[3] == 'X' && gato[6] == 'X' || gato[0] == 'X' && gato[4] == 'X' && gato[8] == 'X'
                || gato[2] == 'X' && gato[4] == 'X' && gato[6] == 'X' || gato[2] == 'X' && gato[5] == 'X' && gato[8] == 'X' || gato[3] == 'X' && gato[4] == 'X' && gato[5] == 'X'
                || gato[6] == 'X' && gato[7] == 'X' && gato[8] == 'X') {

            System.out.println("EL ganador es: " + j1);
            System.out.println("¡Felicidades!");
            System.exit(1);
        }

        System.out.println("" + j2 + " seleccione otra casilla: ");
        sel6 = seleccion.nextInt();
        sel6 = sel6 - 1;

        if (sel6 == sel1 || sel6 == sel2 || sel6 == sel3 || sel6 == sel4 || sel6 == sel5) {
            System.out.println("Esta casilla ya fue seleccionada por otro jugador");
            System.out.println("Por favor elija una casilla distinta: ");
            sel6 = seleccion.nextInt();
            sel6 = sel6 - 1;

            gato[sel6] = 'O';

            System.out.println("");

            System.out.println("|" + gato[0] + "|" + gato[1] + "|" + gato[2] + "|");
            System.out.println("|" + gato[3] + "|" + gato[4] + "|" + gato[5] + "|");
            System.out.println("|" + gato[6] + "|" + gato[7] + "|" + gato[8] + "|");

            System.out.println("");

        } else {
            gato[sel6] = 'O';

            System.out.println("");

            System.out.println("|" + gato[0] + "|" + gato[1] + "|" + gato[2] + "|");
            System.out.println("|" + gato[3] + "|" + gato[4] + "|" + gato[5] + "|");
            System.out.println("|" + gato[6] + "|" + gato[7] + "|" + gato[8] + "|");

            System.out.println("");

        }

        if (gato[0] == 'O' && gato[1] == 'O' && gato[2] == 'O' || gato[0] == 'O' && gato[3] == 'O' && gato[6] == 'O' || gato[0] == 'O' && gato[4] == 'O' && gato[8] == 'O'
                || gato[2] == 'O' && gato[4] == 'O' && gato[6] == 'O' || gato[2] == 'O' && gato[5] == 'O' && gato[8] == 'O' || gato[3] == 'O' && gato[4] == 'O' && gato[5] == 'O'
                || gato[6] == 'O' && gato[7] == 'O' && gato[8] == 'O') {

            System.out.println("EL ganador es: " + j2);
            System.out.println("¡Felicidades!");
            System.exit(1);
        }

        System.out.println("" + j1 + " seleccione otra casilla: ");
        sel7 = seleccion.nextInt();
        sel7 = sel7 - 1;

        if (sel7 == sel1 || sel7 == sel2 || sel7 == sel3 || sel7 == sel4 || sel7 == sel5 || sel7 == sel6) {
            System.out.println("Esta casilla ya fue seleccionada por otro jugador");
            System.out.println("Por favor elija una casilla distinta: ");
            sel7 = seleccion.nextInt();
            sel7 = sel7 - 1;

            gato[sel7] = 'X';

            System.out.println("");

            System.out.println("|" + gato[0] + "|" + gato[1] + "|" + gato[2] + "|");
            System.out.println("|" + gato[3] + "|" + gato[4] + "|" + gato[5] + "|");
            System.out.println("|" + gato[6] + "|" + gato[7] + "|" + gato[8] + "|");

            System.out.println("");

        } else {
            gato[sel7] = 'X';

            System.out.println("");

            System.out.println("|" + gato[0] + "|" + gato[1] + "|" + gato[2] + "|");
            System.out.println("|" + gato[3] + "|" + gato[4] + "|" + gato[5] + "|");
            System.out.println("|" + gato[6] + "|" + gato[7] + "|" + gato[8] + "|");

            System.out.println("");

        }
        if (gato[0] == 'X' && gato[1] == 'X' && gato[2] == 'X' || gato[0] == 'X' && gato[3] == 'X' && gato[6] == 'X' || gato[0] == 'X' && gato[4] == 'X' && gato[8] == 'X'
                || gato[2] == 'X' && gato[4] == 'X' && gato[6] == 'X' || gato[2] == 'X' && gato[5] == 'X' && gato[8] == 'X' || gato[3] == 'X' && gato[4] == 'X' && gato[5] == 'X'
                || gato[6] == 'X' && gato[7] == 'X' && gato[8] == 'X') {

            System.out.println("EL ganador es: " + j1);
            System.out.println("¡Felicidades!");
            System.exit(1);
        }

        System.out.println("" + j2 + " seleccione otra casilla:");
        sel8 = seleccion.nextInt();
        sel8 = sel8 - 1;

        if (sel8 == sel1 || sel8 == sel2 || sel8 == sel3 || sel8 == sel4 || sel8 == sel5 || sel8 == sel6 || sel8 == sel7) {
            System.out.println("Esta casilla ya fue seleccionada por otro jugador");
            System.out.println("Por favor elija una casilla distinta: ");
            sel8 = seleccion.nextInt();
            sel8 = sel8 - 1;

            gato[sel8] = 'O';

            System.out.println("");

            System.out.println("|" + gato[0] + "|" + gato[1] + "|" + gato[2] + "|");
            System.out.println("|" + gato[3] + "|" + gato[4] + "|" + gato[5] + "|");
            System.out.println("|" + gato[6] + "|" + gato[7] + "|" + gato[8] + "|");

            System.out.println("");

        } else {
            gato[sel8] = 'O';

            System.out.println("");

            System.out.println("|" + gato[0] + "|" + gato[1] + "|" + gato[2] + "|");
            System.out.println("|" + gato[3] + "|" + gato[4] + "|" + gato[5] + "|");
            System.out.println("|" + gato[6] + "|" + gato[7] + "|" + gato[8] + "|");

            System.out.println("");

        }

        if (gato[0] == 'O' && gato[1] == 'O' && gato[2] == 'O' || gato[0] == 'O' && gato[3] == 'O' && gato[6] == 'O' || gato[0] == 'O' && gato[4] == 'O' && gato[8] == 'O'
                || gato[2] == 'O' && gato[4] == 'O' && gato[6] == 'O' || gato[2] == 'O' && gato[5] == 'O' && gato[8] == 'O' || gato[3] == 'O' && gato[4] == 'O' && gato[5] == 'O'
                || gato[6] == 'O' && gato[7] == 'O' && gato[8] == 'O') {

            System.out.println("EL ganador es: " + j2);
            System.out.println("¡Felicidades!");
            System.exit(1);
        }

        System.out.println("" + j1 + " seleccione otra casilla: ");
        sel9 = seleccion.nextInt();
        sel9 = sel9 - 1;

        if (sel9 == sel1 || sel9 == sel2 || sel9 == sel3 || sel9 == sel4 || sel9 == sel5 || sel9 == sel6 || sel9 == sel7 || sel9 == sel8) {
            System.out.println("Esta casilla ya fue seleccionada por otro jugador");
            System.out.println("Por favor elija una casilla distinta: ");
            sel9 = seleccion.nextInt();
            sel9 = sel9 - 1;

            gato[sel9] = 'X';

            System.out.println("");

            System.out.println("|" + gato[0] + "|" + gato[1] + "|" + gato[2] + "|");
            System.out.println("|" + gato[3] + "|" + gato[4] + "|" + gato[5] + "|");
            System.out.println("|" + gato[6] + "|" + gato[7] + "|" + gato[8] + "|");

            System.out.println("");

        } else {
            gato[sel9] = 'X';

            System.out.println("");

            System.out.println("|" + gato[0] + "|" + gato[1] + "|" + gato[2] + "|");
            System.out.println("|" + gato[3] + "|" + gato[4] + "|" + gato[5] + "|");
            System.out.println("|" + gato[6] + "|" + gato[7] + "|" + gato[8] + "|");

            System.out.println("");

        }

        if (gato[0] == 'X' && gato[1] == 'X' && gato[2] == 'X' || gato[0] == 'X' && gato[3] == 'X' && gato[6] == 'X' || gato[0] == 'X' && gato[4] == 'X' && gato[8] == 'X'
                || gato[2] == 'X' && gato[4] == 'X' && gato[6] == 'X' || gato[2] == 'X' && gato[5] == 'X' && gato[8] == 'X' || gato[3] == 'X' && gato[4] == 'X' && gato[5] == 'X'
                || gato[6] == 'X' && gato[7] == 'X' && gato[8] == 'X') {

            System.out.println("EL ganador es: " + j1);
            System.out.println("¡Felicidades!");
            System.exit(1);
        } else {
            System.out.println("¡Empate!");
            System.exit(1);

        }

    }
}