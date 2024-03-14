package transaction.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "SINGER")
@NamedQuery(name=Singer.FIND_ALL, query="select s from Singer s")
public class Singer extends AbstractEntity{

    public static final String FIND_ALL = "Singer.findAll";

    @Override
    public String toString() {
        return "Singer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    @Column(name = "FIRST_NAME")
    String firstName;

    @Column(name = "LAST_NAME")
    String lastName;

    @Column(name = "BIRTH_DATE")
    LocalDate birthDate;

}
