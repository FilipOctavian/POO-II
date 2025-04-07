import java.util.ArrayList;
import java.util.List;

public class Student {
    private String nume;
    private int id;
    private List<Nota> note;

    public Student(String nume, int id) {
        this.nume = nume;
        this.id = id;
        this.note = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public int getId() {
        return id;
    }

    public void adaugaNota(Nota nota) {
        note.add(nota);
    }

    public double calculeazaMedia() {
        double sumaNote = 0;
        for (Nota n : note) {
            sumaNote += n.getValoare();
        }
        return note.isEmpty() ? 0 : sumaNote / note.size();
    }

    @Override
    public String toString() {
        return "Student: " + nume + " (ID: " + id + ")";
    }
}
