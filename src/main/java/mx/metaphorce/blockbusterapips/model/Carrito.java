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
@Table(name = "carrito")
public class Carrito implements Serializable{
    @Id
    @Column(name = "carrito_id")
    private int carrito_id;
    @Column(name = "producto_id")
    private int producto_id;
    @Column(name = "usuario_id")
    private int usuario_id;
    @Column(name = "cantidad")
    private int cantidad;
}
