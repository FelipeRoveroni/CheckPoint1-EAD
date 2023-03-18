package br.com.checkpoint.CheckPoint1EAD.repositories;

import br.com.checkpoint.CheckPoint1EAD.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, UUID> {
}
