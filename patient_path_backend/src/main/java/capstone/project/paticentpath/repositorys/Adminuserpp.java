package capstone.project.paticentpath.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import capstone.project.paticentpath.models.Adminuser;

@Repository
public interface Adminuserpp extends JpaRepository<Adminuser, Integer> {

	public Adminuser findByEmail(String email);
}
