package org.example;



@Entity
public class Personne {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY);
  private long id;
  private String nom;
  private String prenom;
  
}

