package org.mapsa;

import org.mapsa.entities.Permission;
import org.mapsa.entities.Role;
import org.mapsa.service.RoleService;

import java.util.ArrayList;
import java.util.List;

public class RoleCrudTest {


    public static void main(String[] args) {

        Role role = new Role("Admin") ;

        Permission p1 = new Permission("add person") ;
        Permission p2 = new Permission("edit person") ;
        Permission p3 = new Permission("view person") ;

        List<Permission> ps = new ArrayList<>() ;
        ps.add(p1);
        ps.add(p2);
        ps.add(p3);
        role.setPermissions(ps);

        RoleService roleService = new  RoleService(SessionFactoryProvider.getSessionFactory()) ;

        roleService.create(role);


     //   roleService.delete(role);






       // userService.delete(mona);





    }


}
