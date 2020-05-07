package com.uca.labo4.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {

	@AssertTrue(message="UPS no puedes agregar un producto porque eres un robot, favor hacer click en regresar")
	private Boolean soyrobot;

	public Boolean getSoyrobot() {
		return soyrobot;
	}

	public void setSoyrobot(Boolean soyrobot) {
		this.soyrobot = soyrobot;
	}
}
