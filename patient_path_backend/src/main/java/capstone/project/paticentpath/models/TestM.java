package capstone.project.paticentpath.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tests")
public class TestM {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private String name;
	private String TestDetails;
	private String price;
	
	
	public TestM(Integer id, String name, String testDetails, String price) {
		super();
		this.id = id;
		this.name = name;
		this.TestDetails = testDetails;
		this.price = price;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTestDetails() {
		return TestDetails;
	}

	public void setTestDetails(String testDetails) {
		TestDetails = testDetails;
	}

	public TestM() {
		super();
	} 
	
	
}