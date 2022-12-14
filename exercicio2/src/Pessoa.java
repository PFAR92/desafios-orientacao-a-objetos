public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float esperiencia;
    

    protected abstract void ganharExperiencia();


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getSexo() {
        return sexo;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public float getEsperiencia() {
        return esperiencia;
    }


    public void setEsperiencia(float esperiencia) {
        this.esperiencia = esperiencia;
    }


    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.esperiencia = 0;
    }


    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", esperiencia=" + esperiencia + "]";
    }

    

    
}
