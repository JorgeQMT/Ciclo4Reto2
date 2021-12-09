package com.ciclo4.reto2;

import com.ciclo4.reto2.repository.CosmeticCrudRepository;
import com.ciclo4.reto2.repository.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Reto2Application implements CommandLineRunner{
    @Autowired
    private UserCrudRepository userCrudRepository;
    @Autowired
    private CosmeticCrudRepository cosmeticCrudRepository;
    
    public static void main(String[] args) {
	SpringApplication.run(Reto2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userCrudRepository.deleteAll();
        cosmeticCrudRepository.deleteAll();

        
        
    }

}
