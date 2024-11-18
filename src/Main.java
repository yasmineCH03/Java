//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Animal lion=new Animal("Félins","Simba",5,true);
        //lion.displayAnimal();
        Animal giraffe=new Animal("Giraffe","Sam",5,true);
        Animal chat=new Animal("Chat","miel",5,true);
        Zoo myZoo=new Zoo("Central Park Zoo","Madagascar");
        Zoo zoo2=new Zoo("ariena","tunis");
        // myZoo.displayZoo();
        myZoo.addAnimal(lion);
        myZoo.addAnimal(giraffe);
        myZoo.addAnimal(chat);
        myZoo.displayAnimals();
        System.out.println(myZoo.searchAnimal(chat));
        System.out.println(myZoo.comparerZoo(myZoo,zoo2).name+" a plus d'animaux");
    }

}