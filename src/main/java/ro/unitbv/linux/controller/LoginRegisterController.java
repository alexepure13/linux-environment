package ro.unitbv.linux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ro.unitbv.linux.dto.UserAccountRegDto;
import ro.unitbv.linux.entity.Role;
import ro.unitbv.linux.entity.UserAccount;
import ro.unitbv.linux.service.RoleService;
import ro.unitbv.linux.service.UserAccountService;

import java.util.List;

@Controller
public class LoginRegisterController {

    @Autowired
    UserAccountService userAccountService;

    @Autowired
    RoleService roleService;

    @GetMapping("/addUser")
    public String addUser(@ModelAttribute UserAccountRegDto userAccountRegDto){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        userAccountRegDto.setPassword(encoder.encode(userAccountRegDto.getPassword()));
        userAccountService.saveUser(userAccountRegDto);
        return "redirect:/login";
    }

    @GetMapping("/editUser")
    public String editUser(@ModelAttribute UserAccountRegDto userAccountRegDto){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        userAccountRegDto.setPassword(encoder.encode(userAccountRegDto.getPassword()));
        userAccountService.saveUser(userAccountRegDto);
        return "redirect:/login";
    }

    @GetMapping(value = "/editUser/{id}")
    public ModelAndView showEditPage(@PathVariable(name = "id") int id) throws Exception{
        ModelAndView editUser = new ModelAndView("UserEditForm");
        UserAccount userAccount = userAccountService.getUserAccountById(id);
        List<Role> roleList = roleService.listAllRoles();
        editUser.addObject("user",userAccount);
        editUser.addObject("roleList", roleList);
        return editUser;
    }

    @RequestMapping(path = "/deleteUser/{id}")
    public String deleteUserById(@PathVariable("id") int id)
    {
        userAccountService.deleteUserAccountById(id);
        return "redirect:/admin";
    }

}
