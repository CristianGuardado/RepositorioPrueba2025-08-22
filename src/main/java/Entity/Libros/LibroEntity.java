package Entity.Libros;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Table(name = "LIBROS")
@Getter @Setter @ToString @EqualsAndHashCode
public class LibroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_libros")
    @SequenceGenerator(sequenceName = "seq_libros", name = "seq_libros", allocationSize = 1)

    @Column(name = "ID")
    private Long id;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "ISBN")
    private String isbn;

    @Column(name = "ANIO_PUBLICACION")
    private String anio_publicacion;

    @Column(name = "GENERO")
    private long genero;

    @Column(name = "AUTOR_ID")
    private Number autor_id;
}
