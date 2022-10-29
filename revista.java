import javax.swing.plaf.ViewportUI;

public class revista extends Biblioteca{

    int parametro;

    public revista(String codigo, String titulo, String estado, double añoPublicacion) {
        super(codigo, titulo, estado, añoPublicacion);

        this.parametro = parametro;
    }

    public int getParametro(){
        return parametro;
    }

    public void setparametro(){
        this.parametro = parametro;
    }

    public static void main(String[] args) {
        revista R = new revista("789", "Revista_1:", "Usado", 2017);
        R.parametro = 147;

        System.out.println(R+"Parametro: "+R.parametro);
    }


    



}


