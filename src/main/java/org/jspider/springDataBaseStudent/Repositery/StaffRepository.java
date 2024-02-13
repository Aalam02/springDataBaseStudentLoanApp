package org.jspider.springDataBaseStudent.Repositery;

import org.jspider.springDataBaseStudent.Domian.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StaffRepository extends JpaRepository<Staff,Integer> {
@Query(value = "select * from staff",nativeQuery = true)
    List<Staff>getAllStaff();

}
