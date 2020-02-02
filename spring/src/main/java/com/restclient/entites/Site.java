package com.restclient.entites;

public class Site {

	private int id;
	private String name;
	private String latitude;
	private String Longitude;

	public Site() {
	}

	public Site(String name, String latitude, String longitude) {
		super();
		this.name = name;
		this.latitude = latitude;
		Longitude = longitude;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return Longitude;
	}

	public void setLongitude(String longitude) {
		Longitude = longitude;
	}

}
