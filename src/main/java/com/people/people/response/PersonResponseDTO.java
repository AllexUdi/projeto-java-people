package com.people.people.response;

import com.people.people.entity.Person;

public class PersonResponseDTO {

    private Long id;

    private String name;

    private String cpf;
    
    private Integer age;

    public PersonResponseDTO(Person person){
        this.id = person.getId();
        this.name = person.getName();
        this.cpf = person.getCpf();
        this.age = person.getAge();
    }

}
