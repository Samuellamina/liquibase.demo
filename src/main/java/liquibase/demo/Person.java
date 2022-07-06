package liquibase.demo;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "person")
public class Person {
    @Id
    private long id;

    private String firstName;
    private String lastName;
}
