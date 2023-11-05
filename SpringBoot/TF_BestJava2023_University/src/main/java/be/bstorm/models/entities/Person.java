package be.bstorm.models.entities;

import be.bstorm.models.entities.embedded.Address;
import be.bstorm.models.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
// Sert à gérer la stratégie d'héritage qu'on veut employer en DB
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@NoArgsConstructor @AllArgsConstructor
@ToString @EqualsAndHashCode
public abstract class Person extends BaseEntity<String> {

    @Column(nullable = false, length = 50)
    @Getter @Setter
    private String firstname;

    @Column(nullable = false, length = 50)
    @Getter @Setter
    private String lastname;

    // Annotation qui pemet d'embarquer la classe Address
    // Toutes les colonnes défniie dans Address deviennent des colonnes de la table Person
    @Embedded
    @Getter @Setter
    private Address address;

}
