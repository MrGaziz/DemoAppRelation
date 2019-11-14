package com.practice5.demo.domain;

import javax.persistence.*;
import java.io.Serializable;


@Entity
    public class Person  {
        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Integer id;
        private String name;
        private Integer age;

    @ManyToOne
    @JoinColumn(name="Phone")
    private Phone phone;


    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

        public Integer getAge()
        {
            return age;
        }
        public void setAge(Integer age)
        {
            this.age = age;

        }
        public String getName()
        {
            return name;
        }
        public void setName(String name)
        {
            this.name = name;
        }


    }

