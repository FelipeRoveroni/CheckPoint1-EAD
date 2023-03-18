package br.com.checkpoint.CheckPoint1EAD.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name="TB_CLIENTES")
public class ClienteModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_cliente;

    @Size(max = 100)
    private String nome;

    @Size(max = 100)
    private String email;

    @Size(max = 20)
    private String telefone;

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.FIELD})
    public @interface Descrição {
        String value();
    }

    @Descrição("Data de cadastro do cliente")
    private LocalDate dataCadastro;

    public UUID getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(UUID id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
