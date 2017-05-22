package com.shri.contract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shri.contract.client.ContractClient;
import com.shri.contract.dto.Contract;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{
    public static void main( String[] args )
    {
    	
       SpringApplication.run(App.class, args);
    }
    
    @Autowired
    private ContractClient contractClient;

	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		Contract contract = contractClient.getContract(2);
		System.out.println(contract);
	}
}
