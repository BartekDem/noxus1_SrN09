package lab2.com;

import java.util.Random;

public class Person {
    private String name;
    private String lastName;

    private String game;

    public Person(String name, String lastName, String game) {
        this.name = name;
        this.lastName=lastName;
        this.game= game;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }


    public String getfavGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person that = (Person) o;

        if (!name.equals(that.name)) return false;
        return lastName.equals(that.lastName);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }
}
