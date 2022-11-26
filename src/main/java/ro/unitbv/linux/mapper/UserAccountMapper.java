package ro.unitbv.linux.mapper;

import org.springframework.stereotype.Component;
import ro.unitbv.linux.dto.UserAccountRegDto;
import ro.unitbv.linux.entity.UserAccount;

@Component
public class UserAccountMapper {

    public UserAccountRegDto mapUserAccountDto(UserAccount userAccount){
        return  UserAccountRegDto.builder()
                .id(userAccount.getId())
                .username(userAccount.getUsername())
                .password(userAccount.getPassword())
                .firstName(userAccount.getFirstName())
                .lastName(userAccount.getLastName())
                .email(userAccount.getEmail())
                .active(userAccount.isActive())
                .role(userAccount.getRole())
                .build();
    }

    public UserAccount mapUserAccount(UserAccountRegDto userAccountRegDto){
        return UserAccount.builder()
                .id(userAccountRegDto.getId())
                .username(userAccountRegDto.getUsername())
                .password(userAccountRegDto.getPassword())
                .firstName(userAccountRegDto.getFirstName())
                .lastName(userAccountRegDto.getLastName())
                .email(userAccountRegDto.getEmail())
                .active(userAccountRegDto.isActive())
                .role(userAccountRegDto.getRole())
                .build();
    }
}
