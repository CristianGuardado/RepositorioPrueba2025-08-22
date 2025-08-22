package Service.Libros;


import Entity.Libros.LibroEntity;
import Models.DTO.Libros.LibroDTO;
import Repository.Libros.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class LibroService {

    @Autowired
    private LibroRepository repo;

    public List<LibroDTO>getAllLibros(){
        List<LibroEntity> libro = repo.findAll();
        return libro.stream()
                .map(this::convertirADTO)
                .collect(Collectors.toList());
    }

    //Servicio para obtener datos de un cliente Especifico

    public LibroDTO getLibroPorID(Long,id){
        LibroEntity libros = repo.findById(id).orElseThrow

    }
}
