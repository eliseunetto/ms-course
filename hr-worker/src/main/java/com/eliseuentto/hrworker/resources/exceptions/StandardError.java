package com.eliseuentto.hrworker.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long timeStanp;
	private Integer status;
	private String message;

	public StandardError() {
		super();
	}

	public StandardError(Long timeStanp, Integer status, String message) {
		super();
		this.timeStanp = timeStanp;
		this.status = status;
		this.message = message;
	}

	public Long getTimeStanp() {
		return timeStanp;
	}

	public void setTimeStanp(Long timeStanp) {
		this.timeStanp = timeStanp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
