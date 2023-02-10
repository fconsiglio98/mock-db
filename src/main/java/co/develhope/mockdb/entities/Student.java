package co.develhope.mockdb.entities;

import javax.persistence.*;

@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    public String firstName;
    public String lastName;
    @Column(unique = true)
    public String email;
}