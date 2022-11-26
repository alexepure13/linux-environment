package ro.unitbv.linux.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "T_COMMAND")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Command {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name="description")
    private String description;
}
