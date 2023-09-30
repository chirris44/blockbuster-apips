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
@Table(name = "usuario")
public class Usuario implements Serializable{
    @Id
    @Column(name = "usuario_id")
    private int usuario_id;
    @Column(name = "nombre_usuario")
    private String nombre_usuario;
    @Column(name = "email")
    private String email;
    @Column(name = "contrasena")
    private String contrasena;
    @Column(name = "tipo")
    private String tipo;
}
