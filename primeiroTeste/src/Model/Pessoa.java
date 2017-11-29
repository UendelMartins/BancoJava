package Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity (name="pessoa")
public class Pessoa implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5546697501489896857L;
	
	@Id
	@GeneratedValue
	private long id;
	private int cpf;
	private String nome;
	private String tipoDeConta;
	private float saldo = 0.00f;
	private Integer senha;

    public Pessoa(){
    	
    }
    
    
    
////////////////////////////////////////////////////////////////////////////////////////////////////    
////////////////////////////////////////GETERRS E SETTERS///////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////

	public Pessoa(long id, int cpf, String nome, String tipoDeConta, float saldo, Integer senha) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.tipoDeConta = tipoDeConta;
		this.saldo = saldo;
		this.senha = senha;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoDeConta() {
		return tipoDeConta;
	}

	public void setTipoDeConta(String tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Integer getSenha() {
		return senha;
	}

	public void setSenha(Integer senha) {
		this.senha = senha;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}