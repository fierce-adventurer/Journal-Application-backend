package com.fierce.adventurer.journalApp.Repository;

import com.fierce.adventurer.journalApp.entity.ConfigJournalAppEntity;
import com.fierce.adventurer.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface ConfigJournalAppRepository extends MongoRepository<ConfigJournalAppEntity, ObjectId> {

}
