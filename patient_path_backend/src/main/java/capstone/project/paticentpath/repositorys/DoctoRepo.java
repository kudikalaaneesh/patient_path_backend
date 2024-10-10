package capstone.project.paticentpath.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import capstone.project.paticentpath.models.Doctor;

public interface DoctoRepo extends JpaRepository<Doctor, Integer> {

	
}
