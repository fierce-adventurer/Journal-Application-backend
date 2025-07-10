package com.fierce.adventurer.journalApp.entity;

import com.fierce.adventurer.journalApp.enums.Sentiment;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.context.annotation.Primary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@Document(collection = "journalEntry")
public class JournalEntry {



    @Id

    private ObjectId id;

    @NonNull
    private String title;

    private String content;

    private LocalDateTime date;

    private Sentiment sentiment;
}
