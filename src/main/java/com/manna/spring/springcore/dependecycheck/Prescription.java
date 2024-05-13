package com.manna.spring.springcore.dependecycheck;
import org.springframework.beans.factory.annotation.Required;
import java.util.List;
public class Prescription {
	
	
	private String id;
	private String patientName;
	private List<String> medicine;
	@Override
	public String toString() {
		return "Prescription [id=" + id + ", patientName=" + patientName + ", medicine=" + medicine + "]";
	}
	public String getId() {
		return id;
	}
	@required
	public void setId(String id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public List<String> getMedicine() {
		return medicine;
	}
	public void setMedicine(List<String> medicine) {
		this.medicine = medicine;
	}
	
}
