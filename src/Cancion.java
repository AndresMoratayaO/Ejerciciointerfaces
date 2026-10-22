public class Cancion extends Contenido implements Repro,Descargable {
    
    private Double duracionSeg;
    private Double tamano=null;

    public Cancion(String titulo, String autor, Double duracionSeg){
        super(titulo,autor);
        this.duracionSeg = duracionSeg;
    }

    @Override
    public Double calcularTamanoMB() {
        if (tamano == null){
            tamano = (duracionSeg/60)*1.5;
        }
        return tamano;
    }

    @Override
    public String reproducir(){
        return "Canción siendo reproducida";
    }

    @Override 
    public Double getDuracionSeg(){
        return duracionSeg;
    }

    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo);
    }

}
