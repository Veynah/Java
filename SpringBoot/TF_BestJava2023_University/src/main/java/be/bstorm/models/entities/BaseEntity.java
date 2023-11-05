package be.bstorm.models.entities;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

// Cette entité de base est là juste pour ne pas nour répéter
// On ne répète plus l'Id dans tout notre programme
// ça veut dire que toute classe qui vont hériter de cette classe vont avoir un id
// Prof: annotation qui spécifie à jpa/hibernate que ceci n'est pas uen table mais
// une gestion d'heritage coté java
@NoArgsConstructor @AllArgsConstructor
@MappedSuperclass
// Type T (Généricité)
// Au moment d'hérité de base entity on devra spéficier quel est ce type T
// ex: String, Long, Integer
public abstract class BaseEntity<T extends Serializable> {

    // Le type de l'Id sera celui spéficié au moment de l'utilisation
    // la genericité peut server à retarder la déclaration d'un type
    @Id
    @Getter
    private T id;

}
