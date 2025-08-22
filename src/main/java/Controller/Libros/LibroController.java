package Controller.Libros;

import Models.DTO.Libros.LibroDTO;
import Service.Libros.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LibroController {

    @Autowired
    private LibroService acceso;

    @GetMapping("/libros")
    public List<LibroDTO> datosLibros() {
        return acceso.getAllLibros();
    }
}
