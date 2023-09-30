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
@Table(name = "emailnotificacion")
public class EmailNotificacion implements Serializable{
    @Id
    @Column(name = "notificacion_id")
    private int notificacion_id;
    @Column(name = "usuario_id")
    private int usuario_id;
    @Column(name = "tipo_notificacion")
    private String tipo_notificacion;
    @Column(name = "mensaje")
    private String mensaje;
    @Column(name = "fecha_envio")
    private LocalDate fecha_envio;
}
