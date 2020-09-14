package com.helloWorld;

/**
 * Created by Sabab on 12/5/2018.
 */
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/customers")
    public List<Customer> customerList(@RequestParam(value="lastName", required = false) String lastName,
                                       @RequestParam(value = "firstName", required = false) String firstName) {

        if (lastName != null)
            return customerRepository.findByLastName(lastName);
        else if (firstName != null)
            return customerRepository.findByFirstName(firstName);
        else
            return customerRepository.findAll();
    }
}
