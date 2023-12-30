public class Docente extends Persona {

    private Integer cantHorasClase;

    public Docente(String nomYApe, Integer dni, Integer cantHorasClase) {
        super(nomYApe, dni);
        this.cantHorasClase = cantHorasClase;
    }

    public Integer getCantHorasClase() {
        return cantHorasClase;
    }

    public void setCantHorasClase(Integer cantHorasClase) {
        this.cantHorasClase = cantHorasClase;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "cantHorasClase=" + cantHorasClase + super.toString();
    }
}




