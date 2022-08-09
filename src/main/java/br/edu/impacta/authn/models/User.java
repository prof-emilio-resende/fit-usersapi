package br.edu.impacta.authn.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="e_mail", unique = true)
    private String email;
    private String name;
    @OneToMany(mappedBy = "user")
    private List<UserRole> roles;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }   
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<UserRole> getRoles() {
        return roles;
    }
    public void setRoles(List<UserRole> roles) {
        this.roles = roles;
    }
}
