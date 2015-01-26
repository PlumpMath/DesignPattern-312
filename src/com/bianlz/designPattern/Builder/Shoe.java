package com.bianlz.designPattern.Builder;

public class Shoe {
	//鞋带
	private String shoelace;
	//鞋底
	private String sole;
	//鞋面
	private String vamp;
	//LOGO
	private String logo;
	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getShoelace() {
		return shoelace;
	}

	public void setShoelace(String shoelace) {
		this.shoelace = shoelace;
	}

	public String getSole() {
		return sole;
	}

	public void setSole(String sole) {
		this.sole = sole;
	}

	public String getVamp() {
		return vamp;
	}

	public void setVamp(String vamp) {
		this.vamp = vamp;
	}

}
