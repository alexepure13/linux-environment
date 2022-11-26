package ro.unitbv.linux.dto;

import lombok.*;
import ro.unitbv.linux.entity.Role;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserAccountRegDto {

    private  int id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private boolean active;
    private Role role;
}
