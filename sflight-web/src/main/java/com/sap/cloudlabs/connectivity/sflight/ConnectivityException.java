package com.sap.cloudlabs.connectivity.sflight;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class ConnectivityException extends WebApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String reason;

	public String getReason() {
		return reason;
	}

	public ConnectivityException(String reason) {
		super(Response.status(Response.Status.INTERNAL_SERVER_ERROR)
				.entity(reason).type(MediaType.TEXT_PLAIN).build());
		this.reason = reason;
	}
}
