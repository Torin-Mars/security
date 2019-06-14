package com.imooc.web.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.imooc.dto.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    @JsonView(User.UserSimpleView.class)
    @ApiOperation(value = "创建用户")
    public List<User> query(@PageableDefault() Pageable pageable){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new User());
        users.add(new User());
        return users;
    }

    @GetMapping("/{id:\\d}")
    @JsonView(User.UserDetailView.class)
    public User getInfo(@PathVariable  String id){
        User user = new User();
        user.setUsername("liming");
        return user;
    }

    @PostMapping
    public User create(@Valid @RequestBody User user, BindingResult erros){
        if (erros.hasErrors()){
            erros.getAllErrors().stream().forEach(err -> System.out.println(err));
        }
        user.setId(1);
        return user;
    }

    @PutMapping("/{id:\\d}")
    public User update(@Valid @RequestBody User user, BindingResult erros){
        if (erros.hasErrors()){
            erros.getAllErrors().stream().forEach(err -> System.out.println(err));
        }
        user.setId(1);
        return user;
    }
}
