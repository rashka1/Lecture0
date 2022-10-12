package com.example.springbootrestexample.users;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Component;
@Component
public class UserDaoService 
{
public static int usersCount=10;
//creating an instance of ArrayList
private static List<User> users=new ArrayList<>();
//static block 
static
{
//adding users to the list
     users.add(new User(1, "ali", "waxan codsanaya crypto", "abdirashidit14@gmail.com"));
    users.add(new User(2, "omar", "waxan codsanaya crypto", "abdirashidit14@gmail.com"));
    users.add(new User(3, "farah", "waxan codsanaya crypto", "abdirashidit14@gmail.com"));
    users.add(new User(4, "osman", "waxan codsanaya crypto", "abdirashidit14@gmail.com"));
    users.add(new User(5, "abdi", "waxan codsanaya crypto", "abdirashidit14@gmail.com"));
}
//method that retrieve all users from the list
public List<User> findAll()
{
return users;
}
//method that adds a user in the list 
public User save(User user)
{
if(user.getId()==null)
{
user.setId(++usersCount);
}
users.add(user);
return user;
}
//method that find a particular user from the list
public User findOne(int id)
{
for(User user:users)
{
if(user.getId()==id)
return user;
}
return null;
}
}