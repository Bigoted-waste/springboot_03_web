package com.cola;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SpringBootTest
class Springboot03WebApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void find_test(){
        try {
            System.out.println("Start script execution");
            String[] strings = new String[]{"python3", "py/find_host_ip.py"};
            Process process = Runtime.getRuntime().exec(strings);
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
            process.waitFor();
            System.out.println("----->end<-----");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
