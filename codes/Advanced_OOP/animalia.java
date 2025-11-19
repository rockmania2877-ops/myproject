package Advanced_OOP;
import java.util.*;

class Animals {
    private String name;
    private String genus;
    private String species;

    public Animals(String name, String genus, String species) {
        this.name = name;
        this.genus = genus;
        this.species = species;
    }

    public String getName() { return name; }
    public String getGenus() { return genus; }
    public String getSpecies() { return species; }

    public void display() {
        System.out.printf("%-10s %-10s %-10s\n", name, genus, species);
    }
}

class Wild extends Animals {
    private int stock;
    private String vulner;
    private static ArrayList<Wild> wilds = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public Wild(String name, String genus, String species, int stock, String vulner) {
        super(name, genus, species);
        this.stock = stock;
        this.vulner = vulner;
    }
    public Wild(){
        super("","","");
    }

    public int getStock() { return stock; }
    public String getVulner() { return vulner; }

    public void setStock(int stock) { this.stock = stock; }
    public void setVulner(String vulner) { this.vulner = vulner; }

    private static String classify(int stock) {
        if (stock == 0) return "Extinct";
        if (stock <= 10) return "Extinct in Wild";
        if (stock <= 100) return "Vulnerable";
        if (stock <= 1000000) return "Protected";
        return "No Problem";
    }

    public static void addWild() {
        System.out.print("Enter the no.of Animals : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            try{
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter genus: ");
        String genus = sc.nextLine();
        System.out.print("Enter species: ");
        String species = sc.nextLine();
        System.out.print("Enter count: ");
        int stock = sc.nextInt();
        sc.nextLine();

        String vulner = classify(stock);
        wilds.add(new Wild(name, genus, species, stock, vulner));
        System.out.println("Wild Animal added successfully");
    }catch (InputMismatchException e){System.out.println("Invalid input");return;}
}
    }

    public static void displayWilds() {
        if (wilds.isEmpty()) {
            System.out.println("No animals available.");
            return;
        }
        System.out.printf("%-10s %-10s %-10s %-10s %-15s\n", "NAME", "GENUS", "SPECIES", "COUNT", "VULNERABILITY");
        for (Wild i : wilds) {
            System.out.printf("%-10s %-10s %-10s %-10s %-15s\n",i.getName(),i.getGenus(),i.getSpecies(),i.getStock(),i.getVulner());
        }
    }

    public static void UpdateWild(){
        if(wilds.isEmpty()){System.out.println("No animals left."); return;}
        System.out.print("Enter the name of the Animal : ");
        String name = sc.nextLine();
        boolean found = false;
        for(Wild i:wilds) {
            if(i.getName().equalsIgnoreCase(name)){
                found = true;
                System.out.print("Enter the updated count : ");
                int stock = sc.nextInt();
                i.setStock(stock);
                String  vulner = classify(stock);
                i.setVulner(vulner);
            }
        }if(!found){System.out.println("Given Name doesn't match");}
    }

    public static void DeleteWild(){
        if(wilds.isEmpty()){System.out.println("No animals left."); return;}
        System.out.print("Enter the name of the Animal : ");
        String name = sc.nextLine();
        boolean found = false;
        Iterator<Wild> it = wilds.iterator();
        while(it.hasNext()){
            Wild i = it.next();
            if(i.getName().equalsIgnoreCase(name)){
                it.remove();
                System.out.println("Animal Deleted Successfully");
            }
        }if(!found){System.out.println("No such animal found.");}
    }

    public static void SearchWild(){
        if(wilds.isEmpty()){System.out.println("No animals left."); return;}
        System.out.println("Enter the name of the animal : ");
        String name = sc.nextLine();
        boolean found = false;
        System.out.printf("%-10s %-10s %-10s %-10s %-15s\n", "NAME", "GENUS", "SPECIES", "COUNT", "VULNERABILITY");
        for(Wild i : wilds){
            if(i.getName().equalsIgnoreCase(name)){
                System.out.printf("\"%-10s %-10s %-10s %-10s %-15s\n",i.getName(),i.getGenus(),i.getSpecies(),i.getStock(),i.getVulner());
            }
        }if(!found){System.out.println("Animal Not found"); return;}
    }

    public static void Buy(){
        System.out.println("Wild animals are Illegal to pet.");
        System.out.println("It is punishable under law");
    }
}

class Domestic extends Animals{
    private static ArrayList<Domestic> domestics = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    private int stock;
    private int rate;
    public Domestic(String name,String genus,String species,int stock,int rate){
        super(name,genus,species);
        this.stock = stock;
        this.rate = rate;
    }
    public Domestic(){
        super("","","");
    }

    public int getStock(){return stock;}
    public int getRate(){return rate;}

    public void setStock(int stock){this.stock = stock;}
    public void setRate(int rate){this.rate = rate;}

    public static void addDom() {
        System.out.print("Enter the no.of animals : ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            try{
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter genus: ");
            String genus = sc.nextLine();
            System.out.print("Enter species: ");
            String species = sc.nextLine();
            System.out.print("Enter stock: ");
            int stock = sc.nextInt();
            System.out.print("Enter the price of the animal : ");
            int rate = sc.nextInt();
            sc.nextLine();    
            domestics.add(new Domestic(name, genus, species, stock, rate));
            System.out.println("Domestic Animal added successfully");
         }catch (InputMismatchException e){System.out.println("Invalid input");}
        }
    }

    public static void displayDom() {
        if (domestics.isEmpty()) {
            System.out.println("No animals available.");
            return;
        }
        System.out.printf("%-10s %-10s %-10s %-10s %-15s\n", "NAME", "GENUS", "SPECIES", "COUNT", "RATE");
        for (Domestic i : domestics) {
            System.out.printf("%-10s %-10s %-10s %-10s %-15s\n",i.getName(),i.getGenus(),i.getSpecies(),i.getStock(),i.getRate());
        }
    }

    public static void UpdateDom(){
        if(domestics.isEmpty()){System.out.println("No animals left."); return;}
        System.out.print("Enter the name of the Animal : ");
        String name = sc.nextLine();
        boolean found = false;
        for(Domestic i : domestics) {
            if(i.getName().equalsIgnoreCase(name)){
                System.out.print("1.STOCK \n2.RATE");
                int choice = sc.nextInt();
            switch(choice){
                case 1 :
                System.out.print("Enter the new Count : ");
                int stock = sc.nextInt();
                i.setStock(stock);
                break;

                case 2:
                System.out.print("Enter new Price : ");
                int rate = sc.nextInt();
                i.setRate(rate);
                break;

                default:
                System.out.println("Invalid choice"); return;
            }
            }
        }if(!found){System.out.println("Given Name doesn't match");}
    }

    public static void DeleteDom(){
        if(domestics.isEmpty()){System.out.println("No animals left."); return;}
        System.out.print("Enter the name of the Animal : ");
        String name = sc.nextLine();
        boolean found = false;
        Iterator<Domestic> it = domestics.iterator();
        while(it.hasNext()){
            Domestic i = it.next();
            if(i.getName().equalsIgnoreCase(name)){
                found = true;
                it.remove();
                System.out.println("Animal Deleted Successfully");
            }
        }if(!found){System.out.println("No such animal found.");}
    }

    public static void SearchDom(){
        if(domestics.isEmpty()){System.out.println("No animals left."); return;}
        System.out.println("Enter the name of the animal : ");
        String name = sc.nextLine();
        boolean found = false;
        System.out.printf("%-10s %-10s %-10s %-10s %-15s\n", "NAME", "GENUS", "SPECIES", "COUNT", "RATE");
        for(Domestic i : domestics){
            if(i.getName().equalsIgnoreCase(name)){
                found = true;
                System.out.printf("\"%-10s %-10s %-10s %-10s %-15s\n",i.getName(),i.getGenus(),i.getSpecies(),i.getStock(),i.getRate());
            }
        }if(!found){System.out.println("Animal Not found"); return;}
    }

    public static void DomBuy(){
        if(domestics.isEmpty()){System.out.println("No animals to buy"); return;}
        System.out.print("Enter the name of the animal : ");
        String name = sc.nextLine();
        boolean found = false;
        int price = 0;
        int bill= 0;
        int choice;
        for(Domestic i : domestics){
            if(i.getName().equalsIgnoreCase(name)){ 
               do{System.out.print("1.BUY\n2.LEAVE");
                 choice = sc.nextInt();
                 System.out.print("Enter the count : ");
                 int count = sc.nextInt();
                 if(count > i.getStock()){System.out.print("Not enough pet available."); return;}
                 price = count * i.getRate();
                 i.setStock(i.getStock()-count);
                } while(choice != 2);
                bill = bill + price;
            }
        }if(!found){System.out.println("No such animal available");}
        System.out.print("ThankYou for Visting");
        System.out.println("Your Total bill : "+bill);
    }
}
public class animalia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Wop,Dop;
        System.out.println("1.DOMESTIC \n2.WILD\n 3.EXIT");
        System.out.print("Enter the choice : ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
        do{
            System.out.println("1.Add Animal");
            System.out.println("2.Search Animal");
            System.out.println("3.Update Animal");
            System.out.println("4.Display Animal");
            System.out.println("5.Buy Animal");
            System.out.println("6.Delete Animal");
            System.out.println("7.Exit");
            System.out.print("option: ");
            Dop = sc.nextInt();
            sc.nextLine();
            
            switch(Dop){
            case 1 : Domestic.addDom();    break;
            case 2: Domestic.SearchDom();break;
            case 3:Domestic.UpdateDom();break;
            case 4:Domestic.displayDom();break;
            case 5:Domestic.DomBuy();break;
            case 6 : Domestic.DeleteDom();break;
            case 7:System.out.println("Thank you visit again");
            default : System.out.println("Invalid choice"); return;
    
            }
        }while(Dop!=7);

        case 2:
        do{
            System.out.println("1.Add Animal");
            System.out.println("2.Search Animal");
            System.out.println("3.Update Animal");
            System.out.println("4.Display Animal");
            System.out.println("5.Buy Animal");
            System.out.println("6.Delete Animal");
            System.out.println("7.Exit");
            System.out.print("option: ");
            Wop = sc.nextInt();
            sc.nextLine();

            switch(Wop){
            case 1 : Wild.addWild();    break;
            case 2: Wild.SearchWild();break;
            case 3:Wild.UpdateWild();break;
            case 4:Wild.displayWilds();break;
            case 5:Wild.Buy();break;
            case 6 : Wild.DeleteWild();break;
            case 7:System.out.println("Thank you visit again"); break;
            default : System.out.println("Invalid choice"); return;
            }
        }while(Wop !=7);
        }while(choice != 7);
        sc.close();
    }   
}
