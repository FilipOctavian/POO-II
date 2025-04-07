public class CatalogService {
    private Catalog catalog;

    public CatalogService(Catalog catalog) {
        this.catalog = catalog;
    }

    public void inscrieStudent(String nume, int id) {
        Student student = new Student(nume, id);
        catalog.adaugaStudent(student);
    }

    public void adaugaProfesor(String nume) {
        Profesor profesor = new Profesor(nume);
        catalog.adaugaProfesor(profesor);
    }

    public void adaugaMaterie(String nume) {
        Materie materie = new Materie(nume);
        catalog.adaugaMaterie(materie);
    }

    public void atribuieNota(int studentId, String numeMaterie, double valoare) {
        Student student = catalog.gasesteStudent(studentId);
        if (student == null) {
            System.out.println("Studentul nu există!");
            return;
        }

        Materie materieGasita = null;
        for (Materie m : catalog.getMaterii()) {
            if (m.getNume().equalsIgnoreCase(numeMaterie)) {
                materieGasita = m;
                break;
            }
        }

        if (materieGasita == null) {
            System.out.println("Materia nu există!");
            return;
        }

        Nota nota = new Nota(valoare, materieGasita);
        student.adaugaNota(nota);
        catalog.adaugaNotaLaMaterie(materieGasita, nota);
    }

    public void afiseazaSituatieStudenti() {
        for (Student student : catalog.getStudenti()) {
            System.out.println("Student: " + student.getNume() + " | Medie: " + student.calculeazaMedia());
        }
    }

    public void afiseazaNotePeMaterii() {
        catalog.afiseazaNoteSortatePeMaterie();
    }
}
