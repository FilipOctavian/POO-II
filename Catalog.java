import java.util.*;

public class Catalog {
    private List<Student> studenti;
    private List<Profesor> profesori;
    private List<Materie> materii;
    private TreeMap<Materie, List<Nota>> notePeMaterie;

    public Catalog() {
        this.studenti = new ArrayList<>();
        this.profesori = new ArrayList<>();
        this.materii = new ArrayList<>();
        this.notePeMaterie = new TreeMap<>();
    }

    // ========================
    // Metode de adăugare
    // ========================
    public void adaugaStudent(Student student) {
        studenti.add(student);
    }

    public void adaugaProfesor(Profesor profesor) {
        profesori.add(profesor);
    }

    public void adaugaMaterie(Materie materie) {
        materii.add(materie);
    }

    public void adaugaNotaLaMaterie(Materie materie, Nota nota) {
        notePeMaterie.putIfAbsent(materie, new ArrayList<>());
        notePeMaterie.get(materie).add(nota);
    }

    // ========================
    // Căutări
    // ========================
    public Student gasesteStudent(int id) {
        for (Student s : studenti) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    // ========================
    // Afișări
    // ========================
    public void afiseazaStudenti() {
        for (Student s : studenti) {
            System.out.println("ID: " + s.getId() + ", Nume: " + s.getNume());
        }
    }

    public void afiseazaProfesori() {
        for (Profesor p : profesori) {
            System.out.println("Profesor: " + p.getNume());
        }
    }

    public void afiseazaMaterii() {
        for (Materie m : materii) {
            System.out.println("Materie: " + m.getNume());
        }
    }

    public void afiseazaNoteSortatePeMaterie() {
        for (Map.Entry<Materie, List<Nota>> entry : notePeMaterie.entrySet()) {
            System.out.println("Materie: " + entry.getKey().getNume());
            for (Nota n : entry.getValue()) {
                System.out.println("  - Nota: " + n.getValoare());
            }
        }
    }

    // ========================
    // Gettere pentru acces extern (ex. din CatalogService)
    // ========================
    public List<Student> getStudenti() {
        return studenti;
    }

    public List<Profesor> getProfesori() {
        return profesori;
    }

    public List<Materie> getMaterii() {
        return materii;
    }
}
