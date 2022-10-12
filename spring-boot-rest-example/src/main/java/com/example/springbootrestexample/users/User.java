package com.example.springbootrestexample.users;
import java.util.Date;
public class User 
{
//default constructor	
protected User(int i, String john, String waxan_codsanaya_crypto, String s)
{
	
}
public User(Integer id, String name, Date dob) 
{
super();
this.id = id;
this.Fname = Fname;
this.Comment= Comment;
this.email = email;

}
private Integer id;
private String Fname;
private String Comment;
private  String email;

public Integer getId() 
{
return id;
}
public void setId(Integer id) 
{
this.id = id;
}
public String getName() 
{
return Fname;
}
public void setName(String Fname)
{
this.Fname = Fname;
}
public String getComment(){ return Comment;}
    public void setComment(String Comment){this.Comment = Comment;}
    public String getEmail(){ return email;}
    public void setEmail(String email){this.email = email;}

@Override
public String toString() 
{
//return "User [id=" + id + ", name=" + name + ", dob=" + dob + "]";
return String.format("User [id=%s, name=%s, dob=%s]", id, Fname);
}
}
