package eu.tomaka.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.tomaka.springboot.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
