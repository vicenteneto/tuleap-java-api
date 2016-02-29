package br.com.vicenteneto.api.tuleap.domain;

import com.google.gson.annotations.SerializedName;

public enum Status {
	@SerializedName("A")
	ACTIVE,
	@SerializedName("R")
	RESTRICTED,
	@SerializedName("S")
	SUSPENDED,
	@SerializedName("D")
	DELETED
}
