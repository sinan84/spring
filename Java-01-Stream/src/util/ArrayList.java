package util;

import java.util.List;

public class ArrayList {
    public static void createList(){
        List<Integer> list = new java.util.ArrayList<>();
        list.add(5);list.add(10);list.add(20);
        for(Integer l : list){
            System.out.println(l);
        }
    }
    public static List<Role> createRoleList(){
        List<Role> roleList = new java.util.ArrayList<>();
        roleList.add(new Role(1,"Manager"));
        roleList.add(new Role(2,"Employee"));
        roleList.add(new Role(3,"Admin"));
        roleList.add(new Role(4,"Employee"));
        roleList.add(new Role(5,"Employee"));
        return roleList;
    }
}
