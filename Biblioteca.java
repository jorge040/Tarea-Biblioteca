public class Biblioteca {
    
    static String codigo;
    static String titulo;
    static String estado;
    static double AñoPublicacion;
    

    public Biblioteca(String codigo, String titulo, String estado, double añoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.estado = estado;
        AñoPublicacion = añoPublicacion;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getestado(){
        return estado;
    }

    public double getAñoPublicacion(){
        return AñoPublicacion;
        
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setAñoPublicacion(double añoPublicacion) {
        this.AñoPublicacion = añoPublicacion;
    }

    public interface inter{
        abstract String Prestado(String prestado);
        abstract String Prestar(String prestar );
        abstract String Devuelto(String Devuelto);
    }

    {

    }

    @Override
    public String toString() {
        return "Biblioteca [Codigo=" + codigo + ", Titulo=" + titulo + ", Estado=" + estado +  "AñoPublicacion"
                + AñoPublicacion + "]";
    }




}
