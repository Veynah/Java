import java.time.LocalDate;
import java.time.Period;

public class PrivatePers{
  private String name;
  private String surname;
  private String mail;
  private LocalDate birthDate;

  // Getters and setters
  public String getName(){
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getSurname(){
    return surname;
  }

  public void setSurname(String surname){
    this.surname = surname;
  }

  public String getMail(){
    return mail;
  }

  public void setMail(String mail){
    this.mail = mail;
  }

  public LocalDate getBirthDate(){
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate){
    this.birthDate = birthDate;
  }
  
  public int CalculateAge() {
    return Period.between(birthDate, LocalDate.now()).getYears();
  }

  public void Present(){
    System.out.println("Bonjour, je suis " + name + " " + surname + " et j'ai " + CalculateAge() + " ans.");
  }
}

