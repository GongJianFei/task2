package main.core.service.UserServiceImpl;

import main.core.mapper.UserMapper;
import main.core.pojo.User;
import main.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    public List<User> list(){
        return userMapper.list();
    }


    public void delete(int id){
        userMapper.delete(id);
    }

    public void add(User user) {
        userMapper.add(user);
    }

    public void insert(User user) {
        userMapper.add(user);
    }

    public void update(User user) {
        userMapper.update(user);
    }

}
