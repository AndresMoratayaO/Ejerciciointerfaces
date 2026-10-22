public abstract class Contenido {
    protected String titulo;
    protected String autor;
    protected String tipo=null;

    public Contenido(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;

    }

    @Override 
    public String toString(){
        return tipo+":"+titulo+"-"+autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

}
