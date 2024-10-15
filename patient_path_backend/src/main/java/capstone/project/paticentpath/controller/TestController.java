package capstone.project.paticentpath.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import capstone.project.paticentpath.models.TestM;
import capstone.project.paticentpath.services.TestService;

@CrossOrigin(origins = "http://localhost:4200", 
methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE} , maxAge = 3600)
@RestController
@RequestMapping("/tests")
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping
    public ResponseEntity<TestM> addTest(@RequestBody TestM test) {
        TestM createdTest = testService.addTest(test);
        return new ResponseEntity<>(createdTest, HttpStatus.CREATED);
    }

     @PutMapping("{id}")
	public String updateAppoint(@RequestBody TestM test,@PathVariable int id) {
		boolean check=testService.updateAppointment(id, test);
		if(check) {
			return "update appointment succesuufully";
		}
		return "update appointment failure";
	}
	
    @GetMapping
    public ResponseEntity<List<TestM>> getAllTests() {
        List<TestM> tests = testService.getAllTests();
        return new ResponseEntity<>(tests, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TestM> getTestById(@PathVariable Integer id){
    	TestM test = testService.getTestById(id);
    	if(test!=null) {
    		return new ResponseEntity<>(test,HttpStatus.OK);
    	}
    	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @DeleteMapping("/{id}")
    public String deleteTest(@PathVariable Integer id) {
        boolean deleted = testService.deleteTest(id);
        if (deleted) {
        	return "test deleted succesfully";
        	
        }
        return "unable to delete";
    }
}