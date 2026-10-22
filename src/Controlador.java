import java.util.List;

public class Controlador {

    public Double tiempoTotal(List<Repro> lista){
        Double total =0.0;
        for (Repro repro:lista){
            total+=repro.getDuracionSeg();
        }
        return total;
    }

    public Double espacioTotal(List<Descargable> lista){
        Double total= 0.0;
        for (Descargable descargable:lista){
            total+=descargable.calcularTamanoMB();
        }
        return total;
    }

}
