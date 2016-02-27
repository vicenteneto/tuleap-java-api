package br.com.vicenteneto.api.tuleap.client;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.client.utils.URIBuilder;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;

import br.com.vicenteneto.api.tuleap.exceptions.TuleapClientException;

public class TuleapClient {

	private URI serverURI;
	private String username;
	private String password;

	public TuleapClient(URI serverURI, String username, String password) {
		this.serverURI = serverURI;
		this.username = username;
		this.password = password;
	}

	public HttpResponse<String> get(String path) throws TuleapClientException {
		return get(createURI(path));
	}

	private HttpResponse<String> get(URIBuilder uriBuilder) throws TuleapClientException {
		try {
			GetRequest getRequest = Unirest.get(uriBuilder.build().toString());
			getRequest.basicAuth(username, password);

			return getRequest.asString();
		} catch (UnirestException | URISyntaxException exception) {
			throw new TuleapClientException(exception);
		}
	}

	private URIBuilder createDefaultURI() {
		return new URIBuilder(serverURI);
	}

	private URIBuilder createURI(String path) {
		return createDefaultURI().setPath(path);
	}
}
