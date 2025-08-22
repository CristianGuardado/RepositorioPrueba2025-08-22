package Entity.Libros;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "LIBROS")
@Getter @Setter @ToString @EqualsAndHashCode
public class LibroEntity {

    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_libros")
    @SequenceGenerator(sequenceName = "seq_libros", name = "seq_libros", allocationSize = 1)
    @Column(name = "ID")
    @Id
}
