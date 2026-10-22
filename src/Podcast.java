public class Podcast  extends Contenido implements Repro,Descargable{
    private Double duracionSeg;
    private int episodio;
    private Double tamano=null;

    public Podcast(String titulo, String autor, Double duracionSeg, int episodio){
        super(titulo,autor);
        this.duracionSeg = duracionSeg;
        this.episodio = episodio;
    }

    @Override
    public Double calcularTamanoMB() {
        if (tamano == null){
            tamano = (duracionSeg/60)*1;
        }
        return tamano;
    }

    @Override
    public String reproducir(){
        return "Podcast siendo reproducido";
    }

    @Override 
    public Double getDuracionSeg(){
        return duracionSeg;
    }

    public int getEpisodio(){
        return episodio;
    }

    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo);
    }
}
