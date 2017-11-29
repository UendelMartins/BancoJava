package Dao;

import java.util.List;

import Model.Pessoa;

public interface PessoaDao {

	public void save(Pessoa pessoa);
	public Pessoa getPessoa(int id);
	public List<Pessoa> list();
	public void remove(Pessoa pessoa);
	public void update(Pessoa pessoa);
	
	
	
}
