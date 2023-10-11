package fr.atyas.relationshipmanager.repo;

import fr.atyas.relationshipmanager.model.Relationship;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RelationshipRepo extends JpaRepository<Relationship, Long> {
    void deleteRelationshipById(Long id);

    Optional<Relationship> findRelationshipById(Long id);
}
