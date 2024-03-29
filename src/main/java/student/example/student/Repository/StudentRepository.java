package student.example.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import student.example.student.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}