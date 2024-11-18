public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal (String family,String name,int age,boolean isMammal)
    {
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
    }
    public void displayAnimal()
    {
        System.out.println(this.name);
        System.out.println(this.family);
        System.out.println(this.age);
        System.out.println(this.isMammal);
    }
}