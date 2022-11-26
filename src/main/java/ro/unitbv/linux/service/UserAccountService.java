package ro.unitbv.linux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.unitbv.linux.dto.UserAccountRegDto;
import ro.unitbv.linux.entity.UserAccount;
import ro.unitbv.linux.mapper.UserAccountMapper;
import ro.unitbv.linux.repository.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserAccountService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserAccountMapper userAccountMapper;

    public List<UserAccountRegDto> getUsers(){
        return userRepository.findAll().stream()
                .map(e -> userAccountMapper.mapUserAccountDto(e))
                .collect(Collectors.toList());
    }

    public UserAccount getUserAccountById(int id) throws Exception{
        Optional<UserAccount> userAccount = userRepository.findById(id);

        if(userAccount.isPresent())
            return userAccount.get();
        else
            throw new Exception("Exceptie");
    }

    public void saveUser(UserAccountRegDto userAccountRegDto){
        UserAccount userAccount = userAccountMapper.mapUserAccount(userAccountRegDto);
        userRepository.save(userAccount);
    }

    public void deleteUserAccountById(int id){
        userRepository.deleteById(id);
    }
}
