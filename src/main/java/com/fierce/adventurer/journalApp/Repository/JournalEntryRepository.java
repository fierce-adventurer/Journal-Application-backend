package com.fierce.adventurer.journalApp.Repository;

import com.fierce.adventurer.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalEntryRepository  extends MongoRepository<JournalEntry , ObjectId> {

}
