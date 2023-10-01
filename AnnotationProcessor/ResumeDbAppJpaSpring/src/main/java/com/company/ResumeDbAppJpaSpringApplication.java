package com.company;

import com.company.dao.inter.UserDaoInter;
import com.company.entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ResumeDbAppJpaSpringApplication {

    @Autowired
    @Qualifier("userDaoImpl1")
    private UserDaoInter userDao;

    public static void main(String[] args) {
        SpringApplication.run(ResumeDbAppJpaSpringApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        CommandLineRunner clr = new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                User u = userDao.getById(5);
                System.out.println(u.getName());
            }
        };
        return clr;
    }

}
