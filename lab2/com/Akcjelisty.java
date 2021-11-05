package lab2.com;

import java.util.*;

public class Akcjelisty implements Typykolekcji {

private static final String LIST_MENU =
        """
                Wybierz rodzaj
                1.ArrayList
                2.LinkedList
                """;
    public void addArrayListElement(Person person)
 {
      arrayList.add(person);

  }
    public void addLinkedListElement(Person person)
    {
       linkedList.add(person);

    }

    public void removeArrayListElement(int index)
    {
        arrayList.remove(index-1);
    }
    public void removeLinkedListElement(int index)
    {
        linkedList.remove(index-1);
    }
    public void displayArrayList()
    {

        for(Person person : arrayList)
        {
             String output= String.format("| %10s | %10s| %5d | %10s |",person.getName(),person.getLastName(),person.getfavGame());
             System.out.println(output);

        }
    }
    public void displayLinkedList()
    {
        for(Person person : linkedList)
        {
            String output= String.format("| %10s | %10s| %5d | %10s |",person.getName(),person.getLastName(),person.getfavGame());
            System.out.println(output);

        }
    }

    Scanner s = new Scanner(System.in);
    @Override
    public void actions() {

        System.out.println(LIST_MENU);
        int wybor_1=Integer.parseInt(s.nextLine());
        switch(wybor_1)
        {
            case 1:
            {
                System.out.println(ACTION_MENU);
                int wybor_2 = Integer.parseInt(s.nextLine());

                switch(wybor_2)
                {
                    case 1:
                    {

                        System.out.println("Podaj imie: ");
                        String name = s.nextLine();
                        System.out.println("Podaj nazwisko: ");
                        String lastName=s.nextLine();
                        System.out.println("Podaj ulubioną grę komputerową: ");
                        String job=s.nextLine();
                        Person person = new Person(name,lastName,job);
                        addArrayListElement(person);
                        System.out.println(person.getName()+ " " +person.getLastName()+" Ulubuiona gra: " +person.getfavGame()+"  zostal dodany do Arraylisty");
                        break;
                    }
                    case 2:
                    {
                        if(arrayList.size()>=1)
                        {
                            try{
                                int index= Integer.parseInt(s.nextLine());
                                removeArrayListElement(index);
                                System.out.println("Element o indeksie "+index+ " zostal usunięty z Arraylisty");
                                break;
                            }catch(Exception e){
                                System.out.println("pusto");
                            }
                        }
                        else{
                            System.out.println("pusto");
                            break;
                        }

                        break;
                    }
                    case 3:
                    {
                        displayArrayList();
                        break;
                    }
                }
                break;
            }
            case 2:
            {
                System.out.println(ACTION_MENU);
                int wybor_2 = Integer.parseInt(s.nextLine());

                switch(wybor_2)
                {

                    case 1:
                    {

                        System.out.println("Podaj imie: ");
                        String name = s.nextLine();
                        System.out.println("Podaj nazwisko: ");
                        String lastName=s.nextLine();
                        System.out.println("Podaj ulubioną grę komputerową: ");
                        String job=s.nextLine();
                        Person person = new Person(name,lastName,job);
                        addLinkedListElement(person);
                        System.out.println(person.getName()+ " " +person.getLastName()+" Ulubuiona gra: "+person.getfavGame()+"  zostal dodany do Linkedlisty");
                        break;
                    }
                    case 2:
                    {

                        if(linkedList.size()>=1)
                        {
                            try{
                                int index= Integer.parseInt(s.nextLine());
                                removeLinkedListElement(index);
                                System.out.println("Element o indeksie "+index+ " zostal usunięty z Linkedlisty");
                                break;
                            }catch(Exception e){
                                System.out.println("brak elementu");
                            }
                        }
                        else{
                            System.out.println("pusto");
                            break;
                        }

                        break;
                    }
                    case 3:
                    {
                        displayLinkedList();
                        break;
                    }
                }
                break;
            }
        }


    }
}
