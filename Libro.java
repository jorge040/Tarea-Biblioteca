public class Libro  extends Biblioteca implements inter{

    private static final String Pretar = null;
    static String Prestar;
    String Prestado;
    String Debuelto;

    public Libro(String codigo, String titulo, String estado, double añoPublicacion) {
        super(codigo, titulo, estado, añoPublicacion);

        this.Prestado = Prestado;
        this.Prestar = Prestado;
        this.Debuelto = Debuelto;
    }

    public String getPrestar(){
        return Prestar;
    }

    public String getPrestado(){
        return Prestado;
    }
    public String getDebuelto(){
        return Debuelto;
    }

    public void setpretar(){
        this.Prestar = Prestar;
    }
    public void setpretado(){
        this.Prestado = Prestado;
    }
    public void setDevuelto(){
        this.Debuelto = Debuelto;
    }

    public static void main(String[] args) {
        Libro L = new Libro("123", "Hola", "Nuevo", 2022);
        L.codigo = codigo;
        L.titulo = titulo;
        L.estado = estado;
        L.AñoPublicacion = AñoPublicacion;
        L.Prestar = Prestar;


        System.out.println(L.toString()+"prestar="+L.Prestar);
    }

    
}

    

    

    

    




    
  
   






