package fr.atyas.relationshipmanager.repo;

import fr.atyas.relationshipmanager.model.Relationship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelationshipRepo extends JpaRepository<Relationship, Long> {
}
