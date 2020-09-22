package ClassTest.extendTest;

public class Animal {
    public String name;

    public Animal() {
        name = "Animal";
        System.out.println("Create Animal class");
    }

    public String useDB(String dbname) {
        return dbname;
    }
}
