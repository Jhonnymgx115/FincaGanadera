/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fincaganadera;

/**
 * @author BlackHawk
 */
public class Demo {
    static String[][] Potreros;
    static String[][] PotrerosAux;
    static String[] Razas = new String[5];
    static String[] Animales;
    static int N_animales = 240;

    public static void main(String[] args) {

        try {

            Potreros = new String[21][8];
            Potreros[0][0] = "Potrero#1";
            Potreros[0][1] = "Potrero#2";
            Potreros[0][2] = "Potrero#3";
            Potreros[0][3] = "Potrero#4";
            Potreros[0][4] = "Potrero#5";
            Potreros[0][5] = "Potrero#6";
            Potreros[0][6] = "Potrero#7";
            Potreros[0][7] = "Potrero#8";

            for (int i = 0; i < Potreros.length; i++) {
                for (int j = 0; j < Potreros[i].length; j++) {

                    System.out.print(Potreros[i][j] + "|");

                }
                System.out.println();
            }
            Animales = new String[N_animales];

            Razas[0] = "Holstein";
            Razas[1] = "Jersey";
            Razas[2] = "Angus";
            Razas[3] = "Swiss";
            Razas[4] = "Hereford";
            System.out.println();
            System.out.println(generarAnimales(Razas, N_animales));


        } catch (Exception Error) {
            System.out.println(Error.getMessage());
        }

    }

    public static String generarAnimales(String[] Raza, int N_vacas) {
        try {
            int Raza_al;
            int Id_al;
            String animal = "";
            String mensaje = "";
            int contador = 0;
            for (int i = 0; i < N_animales; i++) {

                Id_al = (int) (Math.random() * (9999 - 1000 + 1) + 1000);
                Raza_al = (int) (Math.random() * (4 + 1) + 0);
                animal = Razas[Raza_al] + "|" + Id_al;
                Animales[i] = animal;

            }
            for (int i = 1; i < Potreros.length; i++) {
                {
                    for (int j = 0; j < Potreros[i].length; j++) {
                        Potreros[i][j] = Animales[contador];
                        contador++;

                    }

                }

            }
            for (int i = 0; i < Potreros.length; i++) {
                {
                    for (int j = 0; j < Potreros[i].length; j++) {


                        mensaje += Potreros[i][j] + "|";
                    }
                    mensaje += "\n";
                }

            }
            return mensaje;


        } catch (Exception Error) {
            throw Error;
        }
    }

    public static String MoverAnimales(int potreroP, int animalP, int potrero, int animal) {
        try {

            for (int i = 0; i < Potreros.length; i++) {
                for (int j = 0; j < Potreros[i].length; j++) {

                    if (Potreros[i][j] == null) {
                        Potreros[potreroP][animalP] = Potreros[i][j];
                        Potreros[potreroP][animalP] = null;
                    }
                }

            }

            if (potreroP == potrero) {
                //son del mismo potrero

            } else {

            }


        } catch (Exception Error) {
            System.out.println(Error.getMessage());
        }
        return "";

    }

}
