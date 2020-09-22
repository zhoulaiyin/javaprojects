package ClassTest.extendTest;

public class Dog extends Animal {
    private String db;

    public Dog() {
        db = super.useDB("user");
        System.out.println("Create Dog class");
    }

    public void speak() {
        System.out.println("It's a dog AND my dbname is " + this.db);
    }
}
