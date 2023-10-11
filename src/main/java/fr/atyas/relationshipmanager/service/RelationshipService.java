package fr.atyas.relationshipmanager.service;

import fr.atyas.relationshipmanager.exception.UserNotFoundException;
import fr.atyas.relationshipmanager.model.Relationship;
import fr.atyas.relationshipmanager.repo.RelationshipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelationshipService {
    private final RelationshipRepo relationshipRepo;

    @Autowired
    public RelationshipService(RelationshipRepo relationshipRepo) {
        this.relationshipRepo = relationshipRepo;
    }

    public Relationship addRelationship(Relationship relationship) {
        return relationshipRepo.save(relationship);
    }

    public List<Relationship> findAllRelationships() {
        return relationshipRepo.findAll();
    }

    public Relationship updateRelationship(Relationship relationship) {
        return relationshipRepo.save(relationship);
    }

    public Relationship findRelationshipById(Long id) {
        return relationshipRepo.findRelationshipById(id)
                .orElseThrow(() -> new UserNotFoundException("Relationship" + id + "was not found"));
    }

    public void deleteRelationship(Long id) {
        relationshipRepo.deleteRelationshipById(id);
    }


}
