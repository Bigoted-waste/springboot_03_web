package com.cola.service;

import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


@Repository
public class PECService {

    public BufferedReader findHostIp(){
        BufferedReader bufferedReader = null;
        try {
            System.out.println("Start script execution");
            String[] strings = new String[]{"python3", "py/find_host_ip.py"};
            Process process = Runtime.getRuntime().exec(strings);
            bufferedReader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
//            String line;
//            while ((line = bufferedReader.readLine()) != null){
//                System.out.println(line);
//            }
            bufferedReader.close();
            process.waitFor();
            System.out.println("----->end<-----");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bufferedReader;
    }
}
