package br.com.checkpoint.CheckPoint1EAD.repositories;

import br.com.checkpoint.CheckPoint1EAD.models.ItemPedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedidoModel, UUID> {
}