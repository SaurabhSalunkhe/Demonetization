/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.People.Person;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author Saurabh Salunkhe
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Person people;
    private Role role;
    private WorkQueue workQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setPeople(Person people) {
        this.people = people;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Person getPeople() {
        return people;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}