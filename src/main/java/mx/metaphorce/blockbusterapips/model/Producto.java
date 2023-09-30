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
@Table(name = "producto")
public class Producto implements Serializable{
    @Id
    @Column(name = "producto_id")
    private int producto_id;
    @Column(name = "vendedor_id")
    private int vendedor_id;
    @Column(name = "categoria_id")
    private int categoria_id;
    @Column(name = "precio")
    private float precio;
    @Column(name = "descripcion")
    private String descripcion;
}
