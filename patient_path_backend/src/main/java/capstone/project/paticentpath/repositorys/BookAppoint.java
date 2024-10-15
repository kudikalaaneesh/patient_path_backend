package capstone.project.paticentpath.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;


import capstone.project.paticentpath.models.BookAppointment;

public interface BookAppoint extends JpaRepository<BookAppointment, Integer>{

}
