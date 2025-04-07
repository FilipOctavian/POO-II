import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        CatalogService service = new CatalogService(catalog);
        Scanner scanner = new Scanner(System.in);
        boolean rulare = true;

        // ===== Valori statice inițiale =====
        service.inscrieStudent("Ana Popescu", 1);
        service.inscrieStudent("George Ionescu", 2);
        service.inscrieStudent("Maria Enache", 3);

        service.adaugaProfesor("Prof. Ionescu");
        service.adaugaProfesor("Prof. Vasilescu");

        service.adaugaMaterie("Matematica");
        service.adaugaMaterie("Informatica");
        service.adaugaMaterie("Fizica");

        service.atribuieNota(1, "Matematica", 9.5);
        service.atribuieNota(1, "Informatica", 10.0);
        service.atribuieNota(2, "Matematica", 7.8);
        service.atribuieNota(3, "Fizica", 8.5);
        service.atribuieNota(3, "Matematica", 9.0);

        // ===== Meniu interactiv =====
        while (rulare) {
            System.out.println("\n=== MENIU CATALOG ===");
            System.out.println("1. Adaugă student");
            System.out.println("2. Adaugă profesor");
            System.out.println("3. Adaugă materie");
            System.out.println("4. Atribuie notă student");
            System.out.println("5. Afișează studenți");
            System.out.println("6. Afișează profesori");
            System.out.println("7. Afișează materii");
            System.out.println("8. Afișează situație studenți");
            System.out.println("9. Afișează note pe materii");
            System.out.println("0. Ieșire");
            System.out.print("Alege opțiunea: ");

            int optiune = scanner.nextInt();
            scanner.nextLine(); // Consumă newline

            switch (optiune) {
                case 1:
                    System.out.print("Nume student: ");
                    String numeStudent = scanner.nextLine();
                    System.out.print("ID student: ");
                    int idStudent = scanner.nextInt();
                    scanner.nextLine();
                    service.inscrieStudent(numeStudent, idStudent);
                    System.out.println("Student adăugat cu succes!");
                    break;
                case 2:
                    System.out.print("Nume profesor: ");
                    String numeProfesor = scanner.nextLine();
                    service.adaugaProfesor(numeProfesor);
                    System.out.println("Profesor adăugat!");
                    break;
                case 3:
                    System.out.print("Nume materie: ");
                    String numeMaterie = scanner.nextLine();
                    service.adaugaMaterie(numeMaterie);
                    System.out.println("Materie adăugată!");
                    break;
                case 4:
                    System.out.print("ID student: ");
                    int idNota = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Materie: ");
                    String materieNota = scanner.nextLine();
                    System.out.print("Nota: ");
                    double valoareNota = scanner.nextDouble();
                    scanner.nextLine();
                    service.atribuieNota(idNota, materieNota, valoareNota);
                    System.out.println("Notă atribuită!");
                    break;
                case 5:
                    System.out.println("=== Studenți ===");
                    catalog.afiseazaStudenti();
                    break;
                case 6:
                    System.out.println("=== Profesori ===");
                    catalog.afiseazaProfesori();
                    break;
                case 7:
                    System.out.println("=== Materii ===");
                    catalog.afiseazaMaterii();
                    break;
                case 8:
                    System.out.println("=== Situație studenți ===");
                    service.afiseazaSituatieStudenti();
                    break;
                case 9:
                    System.out.println("=== Note pe materii (sortate) ===");
                    service.afiseazaNotePeMaterii();
                    break;
                case 0:
                    System.out.println("Program închis.");
                    rulare = false;
                    break;
                default:
                    System.out.println("Opțiune invalidă.");
            }
        }

        scanner.close();
    }
}
