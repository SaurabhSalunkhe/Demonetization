/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import java.util.ArrayList;

/**
 *
 * @author Saurabh Salunkhe
 */
public class PersonDirectory {
    
    private ArrayList<Person> peopleList;

    public PersonDirectory() {
        peopleList = new ArrayList<>();
    }

    public ArrayList<Person> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(ArrayList<Person> peopleList) {
        this.peopleList = peopleList;
    }

    
    public Person createPeople(String name){
        Person people = new Person();
        people.setName(name);
        peopleList.add(people);
        return people;
    }
}