package br.com.vicenteneto.api.tuleap.domain;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class Artifact {

	private int id;
	@SerializedName("html_url")
	private String htmlURL;
	@SerializedName("changesets_url")
	private String changesetsURI;
	private String uri;
	private Tracker tracker;
	private Project project;
	@SerializedName("submitted_by")
	private int submittedBy;
	@SerializedName("submitted_on")
	private Date submittedOn;
	@SerializedName("last_modified_date")
	private Date lastModifiedDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHtmlURL() {
		return htmlURL;
	}

	public void setHtmlURL(String htmlURL) {
		this.htmlURL = htmlURL;
	}

	public String getChangesetsURI() {
		return changesetsURI;
	}

	public void setChangesetsURI(String changesetsURI) {
		this.changesetsURI = changesetsURI;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public Tracker getTracker() {
		return tracker;
	}

	public void setTracker(Tracker tracker) {
		this.tracker = tracker;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public int getSubmittedBy() {
		return submittedBy;
	}

	public void setSubmittedBy(int submittedBy) {
		this.submittedBy = submittedBy;
	}

	public Date getSubmittedOn() {
		return submittedOn;
	}

	public void setSubmittedOn(Date submittedOn) {
		this.submittedOn = submittedOn;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
}
