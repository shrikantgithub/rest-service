package com.shri.contract.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;

import com.shri.contract.dto.Contract;

@Component
public class ContractClient {
	@Autowired
	private RestOperations restOpertaions;
	private String url;
	
	@Autowired
	public ContractClient(@Value("${service.base.url}") final String url){
		this.url = url;
	}
	
	public Contract getContract(final int contractNumber){
		Contract contract = restOpertaions.getForObject(url, Contract.class, contractNumber);
		return contract;
	}

}
