package restfull.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import restfull.model.client;

public interface clientRepository extends JpaRepository<client, Long> {

}
