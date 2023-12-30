public class Estudiante extends Persona {
    private Integer numeroLegajo;

    public Estudiante(String nomYApe, Integer dni, Integer numeroLegajo) {
        super(nomYApe, dni);
        this.numeroLegajo = numeroLegajo;
    }

    public Integer getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setNumeroLegajo(Integer numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "numeroLegajo=" + numeroLegajo + super.toString();
    }
}
