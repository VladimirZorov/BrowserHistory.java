package hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String name;
    private int capacity;
    private List<Person> person;

    public void setPerson(List<Person> person) {
        this.person = new ArrayList<>();
    }


    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void add(Person person) {
        if (this.person.size() < this.capacity) {
            this.person.add(person);
        }
    }

    public boolean remove(String name) {
        for (int i = 0; i < this.person.size(); i++) {
            if (this.person.get(i).getName().equals(name)) {
                this.person.remove(i);
                return true;
            }
        }
        return false;

    }

    public Person getPerson(String name, String hometown) {
        for (int i = 0; i < this.person.size(); i++) {
            if (this.person.get(i).equals(name)) {

            }
            return null;
        }
        return null;
    }

    public int getCount() {
        return this.person.size();
    }

    public boolean getStatistics() {
//        return String.format("The people in the hotel %s are:%n
//        {%s}
//        {%s}
//        (…),this.name, ");
        return false;
    }
}

