package house;

import java.util.Arrays;

public class Flat implements Pay{

    private String name;
    private int maxGuest;
    private Person[] people;

    public Flat(String name, int maxGuest, Person[] people) {
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
        System.out.println("Коммунальные услуги:  "+ people.length * 1000);
    }

    @Override
    public void arenda(Person[] people) {

    }

    @Override
    public void livePerson() {
        System.out.println("In flat live "+people.length+" person.There are still "+(getMaxGuest()- people.length)+" spaces available.");
    }

    @Override
    public String toString() {
        return "Flat{" +
                "name='" + name + '\'' +
                ", maxGuest=" + maxGuest +
                ", people=" + Arrays.toString(people) +
                '}';
    }
}
