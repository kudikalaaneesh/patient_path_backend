package capstone.project.paticentpath.services.impl;



import capstone.project.paticentpath.models.TestM;
import capstone.project.paticentpath.services.TestService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import capstone.project.paticentpath.repositorys.TestRepository; // Assuming you have a repository
import capstone.project.paticentpath.services.TestService;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestRepository testRepo;

	@Override
	public TestM addTest(TestM test) {
		
		return testRepo.save(test);
	}

	@Override
	public List<TestM> getAllTests() {
		// TODO Auto-generated method stub
		return testRepo.findAll();
	}

	@Override
	public TestM getTestById(Integer id) {
		Optional<TestM> test = testRepo.findById(id);
		return test.orElse(null);
	}

	@Override
	public boolean deleteTest(Integer id) {
		 if (testRepo.existsById(id)) {
	            testRepo.deleteById(id);
	            return true;
	        }
	        return false;
	}

	@Override
	public boolean updateAppointment(int id, TestM test) {
		Optional<TestM> testOrder=testRepo.findById(id);
		TestM updateAppoint=null;
		if(testOrder.isPresent()) {
			updateAppoint =(TestM) testOrder.get();
			if(updateAppoint.getId()==id) {
				updateAppoint.setName(test.getName());
				updateAppoint.setTestDetails(test.getTestDetails());
				updateAppoint.setPrice(test.getPrice());
				testRepo.save(updateAppoint);
				return true;
				
			}
			
		}
		return false;
	}
    
	
}