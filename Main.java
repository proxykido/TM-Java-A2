
public class Main {
    public String nombre = "";
    public static void main(String[] args) {
        Calificaciones cal = new Calificaciones();
        cal.leerCalificaciones();
        cal.promedio = cal.promedio(cal.Calificaciones);
        cal.cal = cal.calificacion(cal.promedio);
        cal.imprimirResultados(cal.nombre, cal.promedio, cal.cal);
    }
}
