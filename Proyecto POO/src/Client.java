public class Client {
    private int nif;
    private String nombre;
    private String superficiem2;

    public Client() { // --> rescatar datos desde la BD

    }

    public Client(int nif, String nombre, String superficiem2) {
        this.nif = nif;
        this.nombre = nombre;
        this.superficiem2 = superficiem2;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSuperficiem2() {
        return superficiem2;
    }

    public void setSuperficiem2(String superficiem2) {
        this.superficiem2 = superficiem2;
    }








}
