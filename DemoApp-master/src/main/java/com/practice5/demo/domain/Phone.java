package com.practice5.demo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="Phones")
public class Phone {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private Integer number;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "phone")
    private List<Person> persons;

    public List<Person> getPersons() { return persons;}
    public void setPersons(List<Person> persons) {this.persons = persons;}
    public Integer getNumber() { return number; }
    public void setNumber(Integer number) {
        this.number = number;
    }
}
