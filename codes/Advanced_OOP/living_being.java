package Advanced_OOP;
import java.util.*;

class Living {
    private String genus;
    private String species;
    private String status;
    private String name;
    
    public Living(String genus, String species, String status, String name){
        this.genus = genus;
        this.species = species;
        this.status = status;
        this.name = name;
    }

    public String getGenus(){ return genus; }
    public String getSpecies(){ return species; }
    public String getStatus(){ return status; }
    public String getName(){ return name; }
    public void setStatus(String status){ this.status = status; }

    public void display(){
        System.out.printf("%-10s %-10s %-10s %-10s", name, genus, species, status);
    }
}

class Animal extends Living {
    private ArrayList<Living> animals = new ArrayList<>();
    private Scanner sc;
    private String kingdom = "Animalia";

    public Animal(Scanner sc) {
        super("", "", "", "");
        this.sc = sc;
    }

    public void addAnimal(){
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter genus: ");
        String genus = sc.nextLine();
        System.out.print("Enter species: ");
        String species = sc.nextLine();
        System.out.print("Enter status: ");
        String status = sc.nextLine();
        animals.add(new Living(genus, species, status, name));
    }

    public void walk(){
        System.out.println("Animal walks on four legs.");
    }

    public void nervous(){
        System.out.println("Animal has a nervous system and can feel pain.");
    }

    public void display(){
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "NAME", "KINGDOM", "GENUS", "SPECIES", "STATUS");
        for (Living i : animals){
            System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", i.getName(), kingdom, i.getGenus(), i.getSpecies(), i.getStatus());
        }
    }
}

class Plant extends Living {
    private ArrayList<Living> plants = new ArrayList<>();
    private Scanner sc;
    private String kingdom = "Plantae";

    public Plant(Scanner sc){super("", "", "", "");this.sc = sc;}

    public void addPlant(){
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter genus: ");
        String genus = sc.nextLine();
        System.out.print("Enter species: ");
        String species = sc.nextLine();
        System.out.print("Enter status: ");
        String status = sc.nextLine();
        plants.add(new Living(genus, species, status, name));
    }

    public void walk(){
        System.out.println("Plants do not walk.");
    }

    public void nervous(){
        System.out.println("Plants do not have a nervous system.");
    }

    public void display(){
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "NAME", "KINGDOM", "GENUS", "SPECIES", "STATUS");
        for (Living i : plants){
            System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", i.getName(), kingdom, i.getGenus(), i.getSpecies(), i.getStatus());
        }
    }
}

public class living_being {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Animal animals = new Animal(sc);
        Plant plants = new Plant(sc);
        int choice;

        do{
            System.out.println("\n==== MENU ====");
            System.out.println("1. Animal");
            System.out.println("2. Plant");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.println("1. Add\n2. Walk\n3. Nervous\n4. Display");
                    int aChoice = sc.nextInt();
                    sc.nextLine();
                    switch(aChoice){
                        case 1: animals.addAnimal(); break;
                        case 2: animals.walk(); break;
                        case 3: animals.nervous(); break;
                        case 4: animals.display(); break;
                        default: System.out.println("Invalid choice!");
                    }
                    break;

                case 2:
                    System.out.println("1. Add\n2. Walk\n3. Nervous\n4. Display");
                    int pChoice = sc.nextInt();
                    sc.nextLine();
                    switch(pChoice){
                        case 1: plants.addPlant(); break;
                        case 2: plants.walk(); break;
                        case 3: plants.nervous(); break;
                        case 4: plants.display(); break;
                        default: System.out.println("Invalid choice!");
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid main choice!");
            }

        } while(choice != 3);
        sc.close();
    }
}
