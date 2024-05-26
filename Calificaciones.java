import java.util.Scanner;
import java.util.ArrayList;

public class Calificaciones {
    public String nombre = "";
    public int[] Calificaciones = {0,0,0,0,0};
    public double promedio = 0;
    public char cal;
    public void leerCalificaciones() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nombre del alumno: ");
        nombre = in.next();
        for(int i=0; i<5; i++) {
            System.out.print("Ingresar calificacion #"+(i+1)+": ");
            this.Calificaciones[i] = in.nextInt();
        }
    }
    public double promedio(int[] calificaciones) {
        double promedio = 0;
        for (int i=0; i < calificaciones.length; i++) {
            promedio += calificaciones[i];
        }
        promedio = promedio / calificaciones.length;
        return promedio;
    }
    public char calificacion(double promedio) {
        if(promedio >= 91)
            return 'A';
        if(promedio >= 81)
            return 'B';
        if(promedio >= 71)
            return 'C';
        if(promedio >= 61)
            return 'D';
        if(promedio >= 51)
            return 'E';
        return 'F';
    }

    public void imprimirResultados(String nombre, double promedio, char calificacion) {
        System.out.println("Nombre del estudiante: "+nombre);
        for(int i=0; i<this.Calificaciones.length; i++) {
            System.out.println("Calificacion "+(i+1)+": "+this.Calificaciones[i]);
        }
        System.out.println("Promedio: "+promedio);
        System.out.println("Calificacion: "+calificacion);
    }
}