package Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import Model.Pessoa;
import Utils.HibernateUtil;

public class PessoaDaoImp implements PessoaDao {

	///////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////// MÉTODOS/////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public void save(Pessoa pessoa) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(pessoa);
		t.commit();
	}

	@Override
	public List<Pessoa> list() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		List lista = session.createQuery("from Pessoa").list();
		t.commit();
		return lista;
	}

	@Override
	public void remove(Pessoa pessoa) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.delete(pessoa);
		t.commit();
	}

	@Override
	public void update(Pessoa pessoa) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.update(pessoa);
		t.commit();
	}

	@Override
	public Pessoa getPessoa(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		return (Pessoa) session.load(Pessoa.class, id);
		
	}

}
