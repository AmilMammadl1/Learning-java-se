package com.company;

import com.company.dao.impl.UserRepositoryCustomImpl;
import com.company.entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import outer.MyCompanent2;
import org.springframework.data.domain.Sort;
import com.company.dao.impl.UserRepositoryCustom;
import com.company.dao.impl.UserRepository;

@SpringBootApplication
public class ResumeDbAppJpaSpringApplication {

//    @Autowired
//    @Qualifier("userDaoImpl1")
//    private UserRepositoryCustom userDao;
//    
//    @Autowired
//    @Qualifier("obj")
//    private Object object;
//    @Autowired
//    private MyCompanent companent;
//    @Autowired
//    MyCompanent2 companent2;
//    @Autowired
//    @Qualifier("alma")
//    private Object object;
//
//    @Autowired
//    @Qualifier("alma")
//    private Object object2;
    public static void main(String[] args) {
        SpringApplication.run(ResumeDbAppJpaSpringApplication.class, args);
    }

//    @Bean(name = "userDaoImpl2")
//    UserRepositoryCustom getUserDao() {
//        return new UserRepositoryCustomImpl();
//    }
//    @Bean
//    public CommandLineRunner run() {
//        CommandLineRunner clr = new CommandLineRunner() {
//            @Override
//            public void run(String... args) throws Exception {
//                // System.out.println("object= " + object);
//                // System.out.println("object= " + object2);
//                List<User> list = userDao.getAll(null, null, null);
//                User u = list.get(1);
//                //u.setName("AMILL");
////                User u = new User();
//
////                User u3 = userDao.getById(5);
////                System.out.println(u3.getEmail());3
//                userDao.updateUser(null);
//
//                //               System.out.println("salam");
////                User u = userDao.findByEmail("amilanimasiya01@gmail.com");
////                System.out.println(u.getEmail());
////                System.out.println("test");
//            }
//        };
//        return clr;
//    }
//===========================================================================================================
    @Autowired
    private UserRepository userRepository;

    @Bean
    public CommandLineRunner run() {
        CommandLineRunner clr = new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
//               List<User> list = userRepository.findAll();
//               System.out.println(list);
//                System.out.println("=======================");
//                list = userRepository.findAll(Sort.by(Sort.Order.desc("id")));
//                System.out.println(list);
                //   User u = userRepository.findById(5).get();
                //   System.out.println(u.getName());
//                User u = userRepository.findByname("Amil");
//                User u2 = userRepository.findByNameAndSurname("AMILL","testPasswordov");
//                System.out.println(u);
//                System.out.println(u2);
                User u = userRepository.findByEmail("amilanimasiya01@gmail.com");
                System.out.println(u.getName());
            }
        };
        return clr;
    }
}
