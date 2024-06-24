package itmo.lab9;

import java.util.Map;
import java.util.Scanner;

public class User {
    private String name;
    public User(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public static void searchName(Map<String,Integer> map,String name){
        if(map.containsKey(name)){
            System.out.println(map.get(name));
        }else{
            System.out.println("Name is missing from Map");
        }
    }

}
