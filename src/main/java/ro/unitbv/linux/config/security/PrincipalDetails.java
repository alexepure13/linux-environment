package ro.unitbv.linux.config.security;


import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import ro.unitbv.linux.entity.Permission;
import ro.unitbv.linux.entity.Role;
import ro.unitbv.linux.entity.UserAccount;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class PrincipalDetails implements UserDetails {

    private int id;
    private String username;
    private String fullName;

    private String firstName;
    private String lastName;
    private String email;

    private String password;
    private boolean active;
    private Role role;
    private List<GrantedAuthority> authorities;

    public PrincipalDetails(UserAccount userAccount) {
        this.id = userAccount.getId();
        this.username = userAccount.getUsername();
        this.password = userAccount.getPassword();
        this.firstName = userAccount.getFirstName();
        this.lastName = userAccount.getLastName();
        this.password = userAccount.getPassword();
        this.email = userAccount.getEmail();
        this.fullName = userAccount.getFirstName() + " " + userAccount.getLastName();
        this.active = userAccount.isActive();
        this.role = userAccount.getRole();
        this.authorities = userAccount.getRole().getPermissionList().stream()
                .map(Permission::getPermission)
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return active;
    }
}