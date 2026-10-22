public class Libro extends Contenido implements Descargable{
    private Double duracionSeg;
    private int paginas;
    private Double tamano=null;

    public Libro(String titulo, String autor, Double duracionSeg, int paginas){
        super(titulo,autor);
        this.duracionSeg = duracionSeg;
        this.paginas = paginas;
    }

    @Override
    public Double calcularTamanoMB() {
        if (tamano == null){
            tamano = (duracionSeg/60)*0.2;
        }
        return tamano;
    }

    public int getPaginas(){
        return paginas;
    }
    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo);
    }
}
