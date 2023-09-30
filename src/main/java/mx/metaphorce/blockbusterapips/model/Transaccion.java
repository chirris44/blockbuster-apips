package mx.metaphorce.blockbusterapips.model;
import java.io.Serializable;
import java.time.LocalDate;
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
@Table(name = "transaccion")
public class Transaccion implements Serializable{
    @Id
    @Column(name = "transaccion_id")
    private int transaccion_id;
    @Column(name = "usuario_id")
    private int usuario_id;
    @Column(name = "carrito_id")
    private int carrito_id;
    @Column(name = "fecha")
    private LocalDate fecha;
    @Column(name = "monto_total")
    private float monto_total;
    @Column(name = "direccion_envio")
    private String direccion_envio;
    @Column(name = "informacion_pago")
    private String informacion_pago;
}
