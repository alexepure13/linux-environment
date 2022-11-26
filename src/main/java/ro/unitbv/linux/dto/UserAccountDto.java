package ro.unitbv.linux.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.unitbv.linux.entity.UserAccount;

@Getter
@Setter
@NoArgsConstructor
public class UserAccountDto {

    private String personName;

    private String userName;

    private String email;
    private String role;

    public UserAccountDto(UserAccount userAccount) {
        this.personName = userAccount.getFirstName() + " " + userAccount.getLastName();
        this.userName = userAccount.getUsername();
        this.role = userAccount.getRole().getName();
        this.email = userAccount.getEmail();
    }
}
