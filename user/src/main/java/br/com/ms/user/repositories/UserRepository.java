package br.com.ms.user.repositories;

import br.com.ms.user.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
}
