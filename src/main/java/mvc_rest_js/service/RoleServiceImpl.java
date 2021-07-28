package mvc_rest_js.service;

import mvc_rest_js.dao.RoleDao;
import mvc_rest_js.models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleDao roleDao;

    @Autowired
    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }


    @Override
    public List<Role> findAll() {
        return roleDao.findAll();
    }
}
