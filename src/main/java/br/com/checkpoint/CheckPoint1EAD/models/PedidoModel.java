package br.com.checkpoint.CheckPoint1EAD.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="TB_PEDIDOS")
public class PedidoModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_pedido;

    @Column(nullable = false, length = 10)
    private int id_cliente;

}
