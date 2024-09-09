package com.jmedia.jweb.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;



        import jakarta.persistence.Column;
        import jakarta.persistence.Entity;
        import jakarta.persistence.Id;
        import jakarta.persistence.Table;
        import lombok.Data;
        import org.hibernate.annotations.CreationTimestamp;

        import java.sql.Timestamp;

@Data
@Entity
@Table(name = "poker_hands")
public class PokerHands {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String hash;
    private String cards;
    private String description;
}
