package main.com.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by Naoum on 12/02/2017.
 */

public class QuickPasswordEncodingGenerator {

    public static void main(String[] args) {
        String password = "abc125";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode(password));
    }

}
