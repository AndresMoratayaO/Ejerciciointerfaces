import java.util.List;

public class Main {
    public static void main(String[] args){
        Controlador controlador = new Controlador();
        Cancion c1 = new Cancion("Cielo de Xela","Banda Quetzal", 210.0);
        Cancion c2 = new Cancion("Marimba al Atardecer","Los Tecomates", 180.0);
        Podcast p1 = new Podcast("Código y Café","Ana Ruiz", 1800.0, 12);
        Libro l1 = new Libro("Estructuras de Datos", "Marco Pérez", 320.0,300);
        c1.setTipo("Cancion");
        c2.setTipo("Cancion 2");
        p1.setTipo("Podcast");
        l1.setTipo("Libro");
        List<Contenido> catalogo = List.of(c1, c2, p1, l1);
        List<Repro> paraEscuchar = List.of(c1, c2, p1);
        List<Descargable> paraDescargar = List.of(c1, c2, p1, l1);
        double tiempo = controlador.tiempoTotal(paraEscuchar);
        double espacio = controlador.espacioTotal(paraDescargar);
        System.out.println("Tiempo total:"+tiempo);
        System.out.println("Espacio total:"+espacio);

        for (Contenido c : catalogo) {
            System.out.println(c);
        }

    }
}
