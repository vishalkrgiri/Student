package com.cg.iter.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.cg.iter.bean.Student;
import com.cg.iter.util.JpaUtil;

public class StudentDaoImp implements StudentDao {

	@Override
	public boolean create(Student stud) {
		try {
		EntityManager em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(stud);
		em.getTransaction().commit();
		return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		try {
			EntityManager em = JpaUtil.getEntityManager();
			Student res = null;
			res = em.find(Student.class, id);
			return res;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean updateStudent(Student stud) {
		EntityManager em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(stud);
		em.getTransaction().commit();
		return true;
	}

	@Override
	public boolean deleteStudent(int id) {
		EntityManager em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(findStudentById(id));
		em.getTransaction().commit();
		return true;
	}

	@Override
	public Student findStudentByName(String next) {
		try {
			EntityManager em = JpaUtil.getEntityManager();
			Query query = em.createQuery("select stud from Student stud where stud.name=:name");
			query.setParameter("name",next);
			return (Student) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	

}
