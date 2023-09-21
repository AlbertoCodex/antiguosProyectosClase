
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Alberto
 */
public class Main {

    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> Recuento = new HashMap<String, Integer>();
        FileReader manejador;
        BufferedReader lector = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nombre del archivo a leer: (patata.txt por ejemplo)");
        String fichero = sc.nextLine();

        try {
            manejador = new FileReader(fichero);
            lector = new BufferedReader(manejador);
            String linea;
            int index = 0;
            String palabra = "";
            String texto = null;
            int i = 0;
            while ((linea = lector.readLine()) != null) {
                texto = linea + lector.readLine();

                System.out.println(texto);
                while (linea.charAt(i) != ',' || linea.charAt(i) != '.' || linea.charAt(i) != ' ') {
                    palabra += linea.charAt(i);
                    i++;
                }
                if (palabra.length() >= 2) {
                    for (String j : Recuento.keySet()) {
                        if (j.compareTo(palabra) == 0) {
                           return Recuento.get(j) + 1;
                        }

                    }
                }
                System.out.println(palabra + " " + index);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("No se puede leer el fichero.");
            e.printStackTrace();
        } finally {
            lector.close();
        }

    }
}
