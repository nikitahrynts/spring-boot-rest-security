package by.hryntsaliou.springboot.cruddemo.dao;

import by.hryntsaliou.springboot.cruddemo.entity.Role;

public interface RoleDao {

    public Role findRoleByName(String theRoleName);
}
