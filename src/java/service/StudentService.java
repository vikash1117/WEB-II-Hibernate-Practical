package service;

import entity.Student;
import hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StudentService {

    private final SessionFactory sessionFactory;
    private final Session session;

    public StudentService() {
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }

    public void insertStudent(Student s) {
        session.save(s);
        session.beginTransaction().commit();
    }

    public void updateStudent(Student s) {
        session.update(s);
        session.beginTransaction().commit();
    }

    public void deleteStudent(Student s) {
        session.delete(s);
        session.beginTransaction().commit();
    }

    public Student searchStudentById(int id) {
        return (Student) session.load(Student.class, id);
    }

    public List<Student> allStudents() {
        return null;
    }
}
