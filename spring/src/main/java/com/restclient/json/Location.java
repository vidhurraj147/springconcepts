package com.restclient.json;

public class Location {
	
	private String lat;
	private String lon;
	
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
	
	@Override
	public String toString() {
		return String.format("(%s,%s)", lat,lon);
	}
	
	

}
