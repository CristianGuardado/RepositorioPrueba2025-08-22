package Models.DTO.Libros;


import jakarta.validation.constraints.Email;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

@ToString @EqualsAndHashCode
@Getter @Setter
public class LibroDTO {

    private Long id;

    @NotBlank(message = "El titulo es obligatorio")
    private String titulo;

    @NotBlank(message = "El isbn no funciona ")
    private String isbn;

    @NotBlank(message = "El año es obligatorio")
    private String fechaPublicacion;

    @Getter @Setter
    private long Genero;

    private Long AutorId;

}
