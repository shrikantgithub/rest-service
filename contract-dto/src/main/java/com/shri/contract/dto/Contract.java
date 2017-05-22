package com.shri.contract.dto;

public class Contract {

	public String contractName;
	public int conrtractNumber;
	public String getContractName() {
		return contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}
	public int getConrtractNumber() {
		return conrtractNumber;
	}
	public void setConrtractNumber(int conrtractNumber) {
		this.conrtractNumber = conrtractNumber;
	}
	@Override
	public String toString() {
		return "Contract [contractName=" + contractName + ", conrtractNumber=" + conrtractNumber + "]";
	}
	
}
