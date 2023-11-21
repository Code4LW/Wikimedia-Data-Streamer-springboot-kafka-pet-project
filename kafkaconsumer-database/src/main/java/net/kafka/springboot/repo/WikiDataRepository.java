package net.kafka.springboot.repo;

import net.kafka.springboot.model.WikiData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikiDataRepository extends JpaRepository<WikiData,Long> {
}
