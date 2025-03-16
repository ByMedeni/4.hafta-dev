package presentation;

import business.ProgrammingLanguageManager;
import business.TechnologyManager;
import dataAccess.ProgrammingLanguageRepository;
import dataAccess.TechnologyRepository;
import entities.ProgrammingLanguage;
import entities.Technology;

import java.util.List;
import java.util.Scanner;

public class ConsoleUI {
    private static ProgrammingLanguageManager programmingLanguageManager;
    private static TechnologyManager technologyManager;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        programmingLanguageManager = new ProgrammingLanguageManager(new ProgrammingLanguageRepository());
        technologyManager = new TechnologyManager(new TechnologyRepository());

        while (true) {
            System.out.println("1. Programlama Dili Ekle");
            System.out.println("2. Teknoloji Ekle");
            System.out.println("3. Programlama Dillerini Listele");
            System.out.println("4. Teknolojileri Listele");
            System.out.println("5. Çıkış");
            System.out.print("Seçiminiz: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addProgrammingLanguage();
                    break;
                case 2:
                    addTechnology();
                    break;
                case 3:
                    listProgrammingLanguages();
                    break;
                case 4:
                    listTechnologies();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }

    private static void addProgrammingLanguage() {
        System.out.print("Programlama Dili ID: ");
        int id = scanner.nextInt();
        System.out.print("Programlama Dili Adı: ");
        String name = scanner.next();
        programmingLanguageManager.add(new ProgrammingLanguage(id, name));
        System.out.println("Programlama dili eklendi!");
    }

    private static void addTechnology() {
        System.out.print("Teknoloji ID: ");
        int id = scanner.nextInt();
        System.out.print("Teknoloji Adı: ");
        String name = scanner.next();
        System.out.print("Programlama Dili ID: ");
        int programmingLanguageId = scanner.nextInt();
        technologyManager.add(new Technology(id, name, programmingLanguageId));
        System.out.println("Teknoloji eklendi!");
    }

    private static void listProgrammingLanguages() {
        List<ProgrammingLanguage> languages = programmingLanguageManager.getAll();
        for (ProgrammingLanguage language : languages) {
            System.out.println(language.getId() + " - " + language.getName());
        }
    }

    private static void listTechnologies() {
        List<Technology> technologies = technologyManager.getAll();
        for (Technology technology : technologies) {
            System.out.println(technology.getId() + " - " + technology.getName() + " - Programlama Dili ID: " + technology.getProgrammingLanguageId());
        }
    }
}