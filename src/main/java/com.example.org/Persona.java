public class Persona {
    private String nombre;
    private String poblacion;
    private Integer edad;

    public Persona(String n, String p, Integer e) {
        nombre = n;
        poblacion = p;
        edad = e;
    }



    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPoblacion() {
        return poblacion;
    }
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + nombre + '\'' +
                ", Poblacion='" + poblacion + '\'' +
                ", Edad='" + edad + '\'' +
                '}';
    }
}
