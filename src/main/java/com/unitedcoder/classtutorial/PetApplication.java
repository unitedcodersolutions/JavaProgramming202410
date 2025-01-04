package com.unitedcoder.classtutorial;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PetApplication {
    public static final String VERSION="1.0";
    public static void main(String[] args) {
        List<Pet> pets=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter 1 to add a new pet, 2 to quit the application");
        String input=scanner.next();
        if(input.equals("2"))
        {
            return;
        }
        else {
            for(int i=0;i<2;i++)
            {
                Pet pet=new Pet();
                System.out.println("Please enter a type");
                pet.setType(scanner.next());
                System.out.println("Please enter a name");
                pet.setName(scanner.next());
                System.out.println("Please enter color");
                pet.setColor(scanner.next());
                pets.add(pet);
            }

        }
        System.out.println("Application Version: "+VERSION);
        pets.forEach(pet-> System.out.println(pet.toString()));
    }
}
