package com.people.people.Service;

import java.util.List;

import com.people.people.request.RegisterPersonDTO;
import com.people.people.response.PersonResponseDTO;

public interface PersonService {

    PersonResponseDTO findById(Long id);

    List<PersonResponseDTO> findAll();

    PersonResponseDTO register(RegisterPersonDTO personRequestDTO);

    PersonResponseDTO update(RegisterPersonDTO personRequestDTO, Long id);

    String delete(Long id);


}
