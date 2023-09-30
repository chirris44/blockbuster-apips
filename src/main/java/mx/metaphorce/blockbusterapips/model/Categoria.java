package mx.metaphorce.blockbusterapips.model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Data
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable{
    @Id
    @Column(name = "categoria_id")
    private int categoria_id;
    @Column(name = "nombre")
    private String nombre;
}