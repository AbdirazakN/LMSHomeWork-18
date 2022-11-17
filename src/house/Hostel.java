package house;

import java.util.Arrays;

public class Hostel implements Pay{

    private String name;
    private int maxGuest;
    private Person[] people;

    public Hostel(String name, int maxGuest, Person[] people) {
        this.name = name;
        this.maxGuest = maxGuest;
        this.people = people;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxGuest() {
        return maxGuest;
    }

    public void setMaxGuest(int maxGuest) {
        this.maxGuest = maxGuest;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public void comUsluga(Person[] people) {

    }

    @Override
    public void arenda(Person[] people) {
        System.out.println("Аренда:  "+ people.length * 7500);
    }

    @Override
    public void livePerson() {
        System.out.println("In hostel live "+people.length+" person.There are still "+(getMaxGuest()- people.length)+" spaces available.");
    }

    @Override
    public String toString() {
        return "Hostel{" +
                "name='" + name + '\'' +
                ", maxGuest=" + maxGuest +
                ", people=" + Arrays.toString(people) +
                '}';
    }
}
