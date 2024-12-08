package com.people.people.Service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.people.people.Repository.PersonRepository;
import com.people.people.entity.Person;
import com.people.people.request.RegisterPersonDTO;
import com.people.people.response.PersonResponseDTO;

@Service
@Primary
public class PersonServiceImpl implements PersonService{


    private PersonRepository personRepository;
    
    @Override
    public PersonResponseDTO findById(Long id) {
        Person person = returnPerson(id);

    }

    @Override
    public List<PersonResponseDTO> findAll() {
        return null;
    }

    @Override
    public PersonResponseDTO register(RegisterPersonDTO personRequestDTO) {
        return null;
    }

    @Override
    public PersonResponseDTO update(RegisterPersonDTO personRequestDTO, Long id) {
        Person person = returnPerson(id);
    }

    @Override
    public String delete(Long id) {
        return null;
    }

    public Person returnPerson(Long id){
        return personRepository.findById(id).orElseThrow(()-> new RuntimeException("Person wans't found in database!"));
    }

}
