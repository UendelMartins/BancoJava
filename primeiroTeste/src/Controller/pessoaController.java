package Controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import Dao.PessoaDao;
import Dao.PessoaDaoImp;
import Model.Pessoa;

@ManagedBean
@SessionScoped
public class pessoaController {

	private Pessoa pessoa;
	private DataModel listaPessoa;

	public DataModel getListarPessoa() {
		List<Pessoa> lista = new PessoaDaoImp().list();
		listaPessoa = new ListDataModel(lista);
		return listaPessoa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String prepararAdicionarPessoa() {
		pessoa = new Pessoa();
		return "gerenciarPessoa";
	}

	public String prepararAlterarPessoa() {
		pessoa = (Pessoa) (listaPessoa.getRowData());
		return "gerenciarPessoa";
	}
	public String excluirPessoa(){
		Pessoa pessoaTemp = (Pessoa)(listaPessoa.getRowData());
		PessoaDao dao = new PessoaDaoImp();
		dao.remove(pessoaTemp);
		return "index";
		}
		public String adicionarPessoa(){
		PessoaDao dao = new PessoaDaoImp();
		dao.save(pessoa);
		return "index";
		}
		public String alterarPessoa(){
		PessoaDao dao = new PessoaDaoImp();
		dao.update(pessoa);
		return "index";
		}

}
