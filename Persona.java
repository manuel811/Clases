public class Persona {

    private String nomYApe;

    private Integer dni;

    public Persona(String nomYApe, Integer dni) {
        this.nomYApe = nomYApe;
        this.dni = dni;
    }

    public String getNomYApe() {
        return nomYApe;
    }

    public void setNomYApe(String nomYApe) {
        this.nomYApe = nomYApe;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nomYApe='" + nomYApe + '\'' +
                ", dni=" + dni +
                '}';
    }
}
