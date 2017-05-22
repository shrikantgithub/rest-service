package com.shri.contract.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shri.contract.dto.Contract;

@RestController
@RequestMapping(ServiceController.BASE_URI)
public class ServiceController {

	public static final String BASE_URI = "svc/v1/contract";
	
	@RequestMapping("/{contractNumber}")
	public Contract getContract(@PathVariable("contractNumber") final int contractNumber){
		Contract contract = new Contract();
		contract.setContractName("ABC");
		contract.setConrtractNumber(contractNumber);
		for(int i=0;i<9000000; i++){
			
		}
		return contract;
	}
}
