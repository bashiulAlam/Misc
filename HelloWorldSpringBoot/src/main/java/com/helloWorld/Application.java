package com.helloWorld;

/**
 * Created by Sabab on 12/5/2018.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;

@SpringBootApplication
public class Application implements ApplicationRunner{

    @Autowired
    CustomerRepository repository;

    private static final Logger log = LoggerFactory.getLogger(Application.class);


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Transactional
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Saving Customer");
        Customer customer1 = new Customer("Bashiul", "Alam", 20);
        customer1 = repository.save(customer1);
        System.out.println(customer1);

        repository.save(new Customer("Jack", "Bauer", 25));
        repository.save(new Customer("Chloe", "O'Brian", 30));
        repository.save(new Customer("Kim", "Bauer", 19));
        repository.save(new Customer("David", "Palmer", 28));
        repository.save(new Customer("Michelle", "Dessler", 14));

        // fetch all customers
        log.info("Customers found with findAll():");
        log.info("-------------------------------");
        for (Customer customer : repository.findAll()) {
            log.info(customer.toString());
        }
        log.info("");

        // fetch an individual customer by ID
        repository.findById(1L)
                .ifPresent(customer -> {
                    log.info("Customer found with findById(1L):");
                    log.info("--------------------------------");
                    log.info(customer.toString());
                    log.info("");
                });

        // fetch customers by last name
        log.info("Customer found with findByLastName('Bauer'):");
        log.info("--------------------------------------------");
        repository.findByLastName("Bauer").forEach(bauer -> {
            log.info(bauer.toString());
        });
        // for (Customer bauer : repository.findByLastName("Bauer")) {
        // 	log.info(bauer.toString());
        // }

        // fetch customers by first name
        log.info("Customer found with findByFirstName('Jack'):");
        log.info("--------------------------------------------");
        repository.findByFirstName("Jack").forEach(jack -> {
            log.info(jack.toString());
        });

        //partial search

        log.info("");
    }
}
