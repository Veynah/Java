import java.time.LocalDate;

public class PersonnePrivee {
    public static void main(String[] args) {
        PrivatePers p = new PrivatePers();
        p.setName("Tangiev");
        p.setSurname("Adam");
        p.setMail("pasmonadress@mail.com");
        p.setBirthDate(LocalDate.of(1996, 12, 18));

        p.Present();
    }
}
