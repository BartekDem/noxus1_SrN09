package lab2.com;

import java.util.Scanner;

public class Akcjezbioru implements Typykolekcji {

    private static final String SET_MENU =
            """
                    Wybierz rodzaj setu, z którego chcesz skorzystać
                    1.HashSet
                    2.TreeSet
                    """;
    public void addHashSetElement(Person person)
    {
        hashSet.add(person);
    }
    public void addTreeSetElement(Person person)
    {
        treeSet.add(person);
    }
    public void removeHashSetElement(Person person)
   {
       hashSet.remove(person);
   }
    public void removeTreeSetElement(Person person)
    {
        treeSet.remove(person);
    }
    public void displayHashSet()
    {
        for(Person person : hashSet)
        {
            String output= String.format("| %10s | %10s| %5d | %10s |",person.getName(),person.getLastName(),person.getfavGame());
            System.out.println(output);
        }
    }
    public void displayTreeSet()
    {
        for(Person person  : treeSet)
        {
            String output= String.format("| %10s | %10s| %5d | %10s |",person.getName(),person.getLastName(),person.getfavGame());
            System.out.println(output);
        }
    }

    Scanner s = new Scanner(System.in);
    @Override
    public void actions() {

        System.out.println(SET_MENU);
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
                        String game=s.nextLine();
                        Person person = new Person(name,lastName,game);
                        addHashSetElement(person);
                        System.out.println(person.getName()+" " +person.getLastName()+" Ulubuiona gra: "+person.getfavGame()+"  zostal dodany do HashSetu");
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Podaj imie: ");
                        if(hashSet.size()>=1)
                        {
                            String name = s.nextLine();
                            for (Person person: hashSet)
                            {
                                if (person.getName().equals(name))
                                {
                                    removeHashSetElement(person);
                                    System.out.println("Element zostal usunięty z HashSetu");
                                    break;
                                }
                                else
                                {
                                    System.out.println("brak elementu");
                                    break;
                                }
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
                        displayHashSet();
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
                        addTreeSetElement(person);
                        System.out.println(person.getName()+" " +person.getLastName()+" Ulubuiona gra: " +person.getfavGame()+"  zostal dodany do TreeSetu");
                        break;
                    }
                    case 2:
                    {

                        System.out.println("Podaj imie: ");
                        if(treeSet.size()>=1)
                        {
                            String name = s.nextLine();
                            for (Person person: treeSet)
                            {
                                if (person.getName().equals(name))
                                {
                                    removeTreeSetElement(person);
                                    System.out.println("Element zostal usunięty z TreeSetu");
                                    break;
                                }
                                else
                                {
                                    System.out.println("brak elementu");
                                    break;
                                }
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
                        displayTreeSet();
                        break;
                    }
                }
                break;
            }
        }
    }
}
