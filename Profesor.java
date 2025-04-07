import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String nume;
    private List<Materie> materiiPredate;

    public Profesor(String nume) {
        this.nume = nume;
        this.materiiPredate = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void adaugaMaterie(Materie materie) {
        materiiPredate.add(materie);
    }

    public List<Materie> getMateriiPredate() {
        return materiiPredate;
    }
}
