package capstone.project.paticentpath.repositorys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import capstone.project.paticentpath.models.User;

@Repository
public interface UserReg extends JpaRepository<User,Integer>{

	public User findByEmail(String email);
}
