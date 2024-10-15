package capstone.project.paticentpath.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import capstone.project.paticentpath.models.TestM;

public interface TestRepository extends JpaRepository<TestM, Integer> {

}
