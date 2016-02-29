package br.com.vicenteneto.api.tuleap.client;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.apache.http.client.utils.URIBuilder;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;

import br.com.vicenteneto.api.tuleap.exceptions.TuleapClientException;
import br.com.vicenteneto.api.tuleap.util.ConfigurationUtil;

public class TuleapClient {
	private static final String CONTENT_TYPE = ConfigurationUtil.getConfiguration("CONTENT_TYPE");
	private static final String CONTENT_TYPE_VALUE = ConfigurationUtil.getConfiguration("APPLICATION_JSON");

	private URI serverURI;
	private String username;
	private String password;

	public TuleapClient(URI serverURI, String username, String password) {
		this.serverURI = serverURI;
		this.username = username;
		this.password = password;

		ClientSSLConfig.disableSSL();
	}

	public HttpResponse<String> get(String path) throws TuleapClientException {
		return get(createURI(path));
	}

	public HttpResponse<String> get(String path, Map<String, Object> parameters) throws TuleapClientException {
		return get(createURI(path), parameters);
	}

	private HttpResponse<String> get(URIBuilder uriBuilder) throws TuleapClientException {
		try {
			GetRequest getRequest = Unirest.get(uriBuilder.build().toString());
			getRequest.header(CONTENT_TYPE, CONTENT_TYPE_VALUE);
			getRequest.basicAuth(username, password);

			getRequest.queryString("", "");

			return getRequest.asString();
		} catch (UnirestException | URISyntaxException exception) {
			throw new TuleapClientException(exception);
		}
	}

	private HttpResponse<String> get(URIBuilder uriBuilder, Map<String, Object> parameters)
			throws TuleapClientException {
		try {
			GetRequest getRequest = Unirest.get(uriBuilder.build().toString());
			getRequest.header(CONTENT_TYPE, CONTENT_TYPE_VALUE);
			getRequest.basicAuth(username, password);

			getRequest.queryString(parameters);

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
