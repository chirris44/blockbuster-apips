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
@Table(name = "tienda")
public class Tienda implements Serializable{
    @Id
    @Column(name = "tienda_id")
    private int tienda_id;
    @Column(name = "vendedor_id")
    private int vendedor_id;
    @Column(name = "nombre_tienda")
    private String nombre_tienda;
    @Column(name = "descripcion")
    private String descripcion;
}