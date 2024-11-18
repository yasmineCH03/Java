import java.util.Scanner;

import entities.Animal;
import entities.Zoo;
public class Main {
    public static void main(String[] args) {
        Zoo myZoo=new Zoo("Central Park","Madagascar");
        Zoo zoo2=new Zoo("ariena","tunis");
        int choix=0;
        Animal lion=new Animal("Félins","Simba",5,true);

        Animal giraffe=new Animal("Giraffe","Sam",5,true);
        Animal chat=new Animal("Chat","miel",5,true);
        do {
            do {
                System.out.println("choisir une tache a faire");
                System.out.println("1-Ajouter un animal au zoo");
                System.out.println("2-afficher les animaux du zoo");
                System.out.println("3-Chercher un animal");
                System.out.println("4-Supprimer un animal");
                System.out.println("5-is Zoo full ");
                System.out.println("6-Comparer 2 zoo");
                System.out.println("0-Quitter ");

                Scanner sc = new Scanner(System.in);  // Créer un objet Scanner

                System.out.print("Saisir votre choix : ");
                choix = sc.nextInt();

            }while (choix<0 || choix>6);
            switch (choix) {
                case 1: myZoo.addAnimal(lion);
                    myZoo.addAnimal(giraffe);
                    myZoo.addAnimal(chat);
                    System.out.println("ajout avec succés");
                    break;
                case 2: myZoo.displayAnimals();
                    break;
                case 3: myZoo.searchAnimal(lion);
                    break;
                case 4: myZoo.removeAnimal(chat);
                    break;
                case 5:myZoo.isZooFull();
                    break;
                case 6: myZoo.comparerZoo(myZoo,zoo2);
                    break;
            }
        } while (choix!=0);
    }
        /*myZoo.addAnimal(lion);
        myZoo.addAnimal(giraffe);
        myZoo.addAnimal(chat);
        myZoo.displayAnimals();
        System.out.println(myZoo.searchAnimal(chat));
        System.out.println(myZoo.comparerZoo(myZoo,zoo2).getName()+" a plus d'animaux");
        if (myZoo.isZooFull())
            System.out.println("zoo is full")    ;
        else
            System.out.println("zoo is not full");
        }*/



}