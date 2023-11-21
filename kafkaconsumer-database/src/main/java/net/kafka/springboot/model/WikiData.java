package net.kafka.springboot.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "wikimedia_recentchange")
@Data
public class WikiData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Lob
    private String wikiEventData;
}
