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
@Table(name = "inventario")
public class Inventario implements Serializable{
    @Id
    @Column(name = "inventario_id")
    private int inventario_id;
    @Column(name = "producto_id")
    private int producto_id;
    @Column(name = "vendedor_id")
    private int vendedor_id;
    @Column(name = "precio_venta")
    private float precio_venta;
    @Column(name = "cantidad_solicitad")
    private int cantidad_solicitada;
}
