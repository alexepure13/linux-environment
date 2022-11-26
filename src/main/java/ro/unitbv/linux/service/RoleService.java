package ro.unitbv.linux.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.unitbv.linux.entity.Role;
import ro.unitbv.linux.repository.RoleRepository;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Role getRoleById(int id) {
        return roleRepository.findById(id).get();
    }

    public List<Role> listAllRoles() {
        return roleRepository.findAll();
    }

    public void saveRole(Role operator) {
        roleRepository.save(operator);
    }

    public int deleteRoleById(int id) {
        roleRepository.deleteById(id);
        return id;
    }
}
