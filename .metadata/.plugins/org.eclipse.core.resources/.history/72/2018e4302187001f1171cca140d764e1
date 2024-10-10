package capstone.project.paticentpath.models;

import org.hibernate.annotations.Type;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import org.hibernate.annotations.Type;



@Entity
@Table(name="doctortable")

public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String doctorName;

	private String doctorSpilist;

	private String hospitalName;
	
	public int exprence;
	
	public String education;

	private boolean doctor_avilable;
	



public Doctor(int id, String doctorName, String doctorSpilist, String hospitalName,int exprence, String education,boolean doctor_avilable) {
		super();
		this.id = id;
		this.doctorName = doctorName;
		this.doctorSpilist = doctorSpilist;
		this.hospitalName = hospitalName;
		this.exprence=exprence;
		this.education=education;
		this.doctor_avilable = doctor_avilable;
	}

public int getExprence() {
	return exprence;
}

public void setExprence(int exprence) {
	this.exprence = exprence;
}

public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getDoctorName() {
	return doctorName;
}

public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}

public String getDoctorSpilist() {
	return doctorSpilist;
}

public void setDoctorSpilist(String doctorSpilist) {
	this.doctorSpilist = doctorSpilist;
}

public String getHospitalName() {
	return hospitalName;
}

public void setHospitalName(String hospitalName) {
	this.hospitalName = hospitalName;
}

public String getEducation() {
	return education;
}

public void setEducation(String education) {
	this.education = education;
}

public boolean isDoctor_avilable() {
	return doctor_avilable;
}

public void setDoctor_avilable(boolean doctor_avilable) {
	this.doctor_avilable = doctor_avilable;
}




}
