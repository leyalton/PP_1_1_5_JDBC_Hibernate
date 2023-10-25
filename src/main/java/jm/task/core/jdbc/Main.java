package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceHibernateImpl;

import java.sql.SQLException;

public class Main {
    private final static UserService userService = new UserServiceHibernateImpl();
    public static void main(String[] args) throws SQLException {

        userService.saveUser("Иван1", "Иван1", (byte) 1);
        userService.saveUser("Иван2", "Иван2", (byte) 2);
        userService.saveUser("Иван3", "Иван3", (byte) 3);
        userService.saveUser("Иван4", "Иван4", (byte) 4);

        System.out.print(userService.getAllUsers());
    }
}
