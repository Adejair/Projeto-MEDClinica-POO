public class Pessoa {

    private String nome; 
    private String endereco; 
    private String sexo;

    private int idade;

    Pessoa(String nome, String sexo, int idade) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(idade);   
    }
    
    Pessoa(String nome, String sexo) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(idade);   
    }


    Pessoa(String nome, String endereco, String sexo, int idade) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setSexo(sexo);
        this.setIdade(idade);   
    }
    

    Pessoa() { }

    public String getNome() {  return this.nome; }
    private String getEndereco() { return this.endereco; }
    private String getSexo() { return this.sexo; }
    private int getIdade() { return this.idade; }
    

    private void setNome(String nome) { this.nome = nome; }
    private void setEndereco(String endereco) { this.endereco = endereco; }
    private void setSexo(String sexo) { this.sexo = sexo; }
    private void setIdade(int idade) { this.idade = idade; }

    @Override
    public String toString() {
        return this.getNome() + " - " + this.getEndereco() + " - " + this.getSexo() + " - " + this.getIdade() + " anos"; 
    }
}