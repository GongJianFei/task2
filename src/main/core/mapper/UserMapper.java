package main.core.mapper;
import main.core.pojo.User;

import java.util.List;

public interface UserMapper {

        public void add(User user);

        public void delete(int id);

        public User get(int id);

        public void update(User user);

        public List<User> list();

        public int count();

    }

