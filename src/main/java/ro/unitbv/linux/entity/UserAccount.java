package ro.unitbv.linux.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "T_USERACCOUNT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "username", unique = true)
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "active")
    private boolean active = true;

    @ManyToOne
    @JoinColumn(name = "id_role", nullable = false)
    private Role role;

}