package Assignment5.Problem5;

public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Computer("Dell", "intel i9", 16, 2400);
        Computer comp2 = new Computer("HP", "intel i7", 8, 2400);
        Computer comp3 = new Computer("Dell", "intel i9", 16, 2400);
        Computer[] allComp = {comp1, comp2, comp3};
        printComputers(allComp);

        System.out.println("Is Object of comp1 equals to comp3 " + comp1.equals(comp3) + "\n");

        printHashCode(allComp);
        System.out.println("Is hash code of comp1 equals to comp2? " + ((comp1.hashCode() == comp2.hashCode()) ? "Yes" : "No"));
        System.out.println("Is hash code of comp1 equals to comp3? " + ((comp1.hashCode() == comp3.hashCode()) ? "Yes" : "No"));
    }

    static void printComputers(Computer[] allComputers){
        for (Computer comp: allComputers){
            System.out.println(comp.toString());
        }
    }

    static void printHashCode(Computer[] allComputers){
        System.out.println("All hash codes of the provided objects are");
        for (Computer comp: allComputers){
            System.out.println(comp.hashCode());
        }
    }
}
