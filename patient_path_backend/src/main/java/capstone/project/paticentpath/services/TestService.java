package capstone.project.paticentpath.services;

import java.util.List;
import capstone.project.paticentpath.models.TestM;

public interface TestService {
    TestM addTest(TestM test);
    List<TestM> getAllTests();
    TestM getTestById(Integer id);
    boolean deleteTest(Integer id);
	boolean updateAppointment(int id, TestM test);
}
