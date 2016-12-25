package teampomodoro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tblUser")
public @Data class User {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
    @Column(name="firstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
    @Column(name="eMail")
    private String eMail;
    @Column(name="password")
    private String password;
    
    
    
}
