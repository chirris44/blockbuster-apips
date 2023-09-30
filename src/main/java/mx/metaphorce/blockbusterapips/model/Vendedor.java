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
@Table(name = "vendedor")
public class Vendedor implements Serializable{
    @Id
    @Column(name = "vendedor_id")
    private int vendedor_id;
    @Column(name = "usuario_id")
    private int usuario_id;
}
