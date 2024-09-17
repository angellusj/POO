package exercicios.exerciciosArrays.cliente;

public class Cliente {
    private int id;
    private int idade;
    private String nome;
    private String telefone;

    public Cliente(int id, int idade, String nome, String telefone){
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId(){
        return id;
    }

    public int getIdade(){
        return idade;
    }

    public String getNome(){
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public void informacoesDoCliente(){
        System.out.println("ID: " + id + "\n" + "Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Telefone: " + telefone);
        System.out.println("---------------------------------------");
    }
}
