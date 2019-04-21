package androidcourse.companyname.com.petagramfragment.pojo;

public class Mascota {
    private int imagen;
    private String nombre;
    private byte calificacion;
    private boolean dynamic;

    public boolean isDynamic() {
        return dynamic;
    }

    public void setDynamic(boolean dynamic) {
        this.dynamic = dynamic;
    }

    public Mascota(int imagen, String nombre, byte calificacion){
        this.imagen = imagen;
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.dynamic = true;
    }

    public Mascota(int imagen,String nombre, byte calificacion, boolean dynamic){
        this.imagen = imagen;
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.dynamic = dynamic;
    }

    public Mascota(int imagen,String nombre){
        this.imagen = imagen;
        this.nombre = nombre;
        calificacion = 0;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(byte calificacion) {
        this.calificacion = calificacion;
        if(calificacion>(byte)5){this.calificacion=(byte)0;}
    }
}
