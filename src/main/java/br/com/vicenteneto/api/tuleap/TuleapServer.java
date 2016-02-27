package br.com.vicenteneto.api.tuleap;

import java.net.URI;

import com.google.gson.Gson;

import br.com.vicenteneto.api.tuleap.client.TuleapClient;

public class TuleapServer {

	private TuleapClient TuleapClient;
	private Gson gson;

	private TuleapServer() {
		gson = new Gson();
	}

	public TuleapServer(URI serverURI, String username, String password) {
		this();
		TuleapClient = new TuleapClient(serverURI, username, password);
	}
}
