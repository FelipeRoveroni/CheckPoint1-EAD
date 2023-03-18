package br.com.checkpoint.CheckPoint1EAD.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_ITEM_PEDIDO")
public class ItemPedidoModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pedido", referencedColumnName = "id_pedido")
    private PedidoModel id_pedido;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private Float valor_unitario;

    @Column(nullable = false)
    private float quantidade;

    public UUID getId_item() {
        return id_item;
    }

    public void setId_item(UUID id_item) {
        this.id_item = id_item;
    }

    public PedidoModel getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(PedidoModel id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(Float valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }
}
