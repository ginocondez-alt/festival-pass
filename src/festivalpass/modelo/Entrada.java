public class Entrada {
    private String codigo;
    private String titular;
    private double precioBase;

    public Entrada(String codigo, String titular, double precioBase) {
        this.codigo = codigo;
        this.titular = titular;
        this.precioBase = precioBase;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitular() {
        return titular;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    @Override 
    public String toString() {
        return "Entrada{" +
                "codigo='" + codigo + '\'' +
                ", titular='" + titular + '\'' +
                ", precioBase=" + precioBase +
                '}';
    }



}