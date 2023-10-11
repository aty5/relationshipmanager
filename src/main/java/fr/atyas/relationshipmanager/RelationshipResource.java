package fr.atyas.relationshipmanager;


import fr.atyas.relationshipmanager.model.Relationship;
import fr.atyas.relationshipmanager.service.RelationshipService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/relationship")
public class RelationshipResource {
    private final RelationshipService relationshipService;

    public RelationshipResource(RelationshipService relationshipService) {
        this.relationshipService = relationshipService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Relationship>> getAllRelationships () {
        List<Relationship> relationships = relationshipService.findAllRelationships();
        return new ResponseEntity<>(relationships, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Relationship> getRelationshipById (@PathVariable("id") Long id) {
        Relationship relationship = relationshipService.findRelationshipById(id);
        return new ResponseEntity<>(relationship, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Relationship> addRelationship(@RequestBody Relationship relationship){
        Relationship newRelationship = relationshipService.addRelationship(relationship);
        return new ResponseEntity<>(newRelationship, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Relationship> updateRelationship(@RequestBody Relationship relationship){
        Relationship updateRelationship = relationshipService.updateRelationship(relationship);
        return new ResponseEntity<>(updateRelationship, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteRelationship(@PathVariable("id") Long id){
        relationshipService.deleteRelationship(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}