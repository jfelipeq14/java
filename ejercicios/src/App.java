import java.util.ArrayList;
import java.util.Scanner;

import models.Aprendiz;

public class App {
    public static void main(String[] args) {
        ArrayList<Aprendiz> arrayData = new ArrayList<Aprendiz>();

        Aprendiz aprendiz = new Aprendiz();

        Scanner input = new Scanner(System.in);

        int count = 1;

        while (count <= 3) {
            System.out.println("Aprendiz "+count);

            System.out.print("Ingrese el documento: ");
            aprendiz.setDocumento(input.next());

            System.out.print("Ingrese el nombre: ");
            aprendiz.setNombre(input.next());

            System.out.print("Ingrese el apellido: ");
            aprendiz.setApellido(input.next());

            arrayData.add(aprendiz);

            count++;
        }


        if (!arrayData.isEmpty()) {
            for (int i = 0; i < arrayData.size(); i++) {
                System.out.println();
                System.out.println("Aprendiz "+i);
                System.out.println(arrayData.get(i).documento);
                System.out.println(arrayData.get(i).nombre);
                System.out.println(arrayData.get(i).apellido);
            }
        }

        input.close();
    }
}
