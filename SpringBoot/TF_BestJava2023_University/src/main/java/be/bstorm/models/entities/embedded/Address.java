package be.bstorm.models.entities.embedded;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

// annotation jpa pour définir que cette classe peut etre embarequé
// cad devient uen sorte d'extension
@Embeddable
@Getter @Setter
public class Address {
    @Column(nullable = false, length = 50)
    private String street;

    @Column(nullable = false, length = 10)
    private String number;

    @Column(nullable = false, length = 6)
    private  String zipcode;

    @Column(nullable = false, length = 100)
    private String city;

    @Column(nullable = false, length = 50)
    private String country;
}
