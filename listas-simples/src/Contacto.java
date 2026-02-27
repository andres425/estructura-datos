public class Contacto {
   private String nombre;
   private String telefono;
   private String email;


    public Contacto(String nombre, String telefono, String email) {
        this.nombre=nombre;
        this.telefono=telefono;
        this.email=email;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}