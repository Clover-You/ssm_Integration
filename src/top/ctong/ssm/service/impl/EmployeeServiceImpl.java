package top.ctong.ssm.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.ctong.ssm.dao.EmployeeDao;
import top.ctong.ssm.domain.Employee;
import top.ctong.ssm.service.EmployeeService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * █████▒█      ██  ▄████▄   ██ ▄█▀     ██████╗ ██╗   ██╗ ██████╗
 * ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒      ██╔══██╗██║   ██║██╔════╝
 * ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░      ██████╔╝██║   ██║██║  ███╗
 * ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄      ██╔══██╗██║   ██║██║   ██║
 * ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄     ██████╔╝╚██████╔╝╚██████╔╝
 * ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒     ╚═════╝  ╚═════╝  ╚═════╝
 * ░     ░░▒░ ░ ░   ░  ▒   ░ ░▒ ▒░
 * ░ ░    ░░░ ░ ░ ░        ░ ░░ ░
 * ░     ░ ░      ░  ░
 * Copyright 2021 Clover.
 * <p>
 *
 * </p>
 * @author Clover
 * @version V1.0
 * @class EmployeeServiceImpl
 * @create 2021-08-16 21:56
 */
@Service
public class EmployeeServiceImpl implements Serializable, EmployeeService {

    private static final long serialVersionUID = 8116435021510008697L;

    @Autowired
    private EmployeeDao employeeDao;

    /**
     * 获取全部员工
     * @return 员工信息
     */
    @Override
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }

}
