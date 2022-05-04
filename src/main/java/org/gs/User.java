package org.gs;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "app_user")
public class User extends PanacheEntity {

    public String firstName;
    public String lastName;
    public LocalDate birthDate;

}
