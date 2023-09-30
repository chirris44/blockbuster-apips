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
@Table(name = "resena")
public class Resena implements Serializable{
    @Id
    @Column(name = "comentario_id")
    private int comentario_id;
    @Column(name = "usuario_id")
    private int usuario_id;
    @Column(name = "producto_id")
    private int producto_id;
    @Column(name = "comentario")
    private String comentario;
    @Column(name = "puntuacion")
    private int puntuacion;
    @Column(name = "fecha")
    private LocalDate fecha;
}
