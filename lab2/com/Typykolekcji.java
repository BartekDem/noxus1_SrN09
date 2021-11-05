package lab2.com;

import java.util.*;

public interface Typykolekcji {
    String ACTION_MENU=
            """
                    Co zrobić
                    1.Dodać
                    2.Odjąć   
                    3.Wyświetlić                                   
                    """;

     List<Person> arrayList=new ArrayList<>();
     List<Person> linkedList=new LinkedList<>();
     Set<Person> hashSet=new HashSet<>();
     Set<Person> treeSet=new TreeSet<>(new Akcjezbioru.Tree_SetComparator());
     Map<Integer,Person> hashMap= new HashMap<>();
     Map<Integer,Person> treeMap= new TreeMap<>();

static class Tree_SetComparator implements Comparator<Person>
{
    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }
}
    void actions();


}
