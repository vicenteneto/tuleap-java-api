package br.com.vicenteneto.api.tuleap;

import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;

import br.com.vicenteneto.api.tuleap.client.TuleapClient;
import br.com.vicenteneto.api.tuleap.domain.Project;
import br.com.vicenteneto.api.tuleap.exceptions.TuleapClientException;
import br.com.vicenteneto.api.tuleap.exceptions.TuleapServerException;
import br.com.vicenteneto.api.tuleap.util.ConfigurationUtil;

public class TuleapServer {

	private static final String LIMIT = ConfigurationUtil.getConfiguration("LIMIT");
	private static final String OFFSET = ConfigurationUtil.getConfiguration("OFFSET");

	private TuleapClient tuleapClient;
	private Gson gson;

	private TuleapServer() {
		gson = new Gson();
	}

	public TuleapServer(URI serverURI, String username, String password) {
		this();
		tuleapClient = new TuleapClient(serverURI, username, password);
	}

	public List<Project> getProjects() throws TuleapServerException {
		try {
			String url = ConfigurationUtil.getConfiguration("URL_API_PROJECTS");
			HttpResponse<String> response = tuleapClient.get(url);

			Project[] projects = gson.fromJson(response.getBody(), Project[].class);
			return Arrays.asList(projects);
		} catch (TuleapClientException exception) {
			throw new TuleapServerException(exception);
		}
	}

	public List<Project> getProjects(int limit, int offset) throws TuleapServerException {
		if (offset < 0) {
			String message = ConfigurationUtil.getConfiguration("OFFSET_MUST_NOT_BE_NEGATIVE");
			throw new TuleapServerException(message);
		}

		try {
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put(LIMIT, limit);
			parameters.put(OFFSET, offset);

			String url = ConfigurationUtil.getConfiguration("URL_API_PROJECTS");
			HttpResponse<String> response = tuleapClient.get(url, parameters);

			Project[] projects = gson.fromJson(response.getBody(), Project[].class);
			return Arrays.asList(projects);
		} catch (TuleapClientException exception) {
			throw new TuleapServerException(exception);
		}
	}
}
