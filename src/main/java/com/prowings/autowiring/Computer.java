package com.prowings.autowiring;

public class Computer {
	int compId;
	String modelName;
	Central_processor cpu;

	public Computer() {
		super();

	}

	

	public Computer(int compId, String modelName, Central_processor cpu) {
		super();
		this.compId = compId;
		this.modelName = modelName;
		this.cpu = cpu;
	}



	public int getCompId() {
		return compId;
	}

	public void setCompId(int compId) {
		this.compId = compId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Central_processor getCpu() {
		return cpu;
	}

	public void setCpu(Central_processor cpu) {
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Computer [compId=" + compId + ", modelName=" + modelName + ", cpu=" + cpu + "]";
	}

}
