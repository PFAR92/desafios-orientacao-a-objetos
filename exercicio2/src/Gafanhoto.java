public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public void viuMaisUm(){

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    protected void ganharExperiencia() {
        // TODO Auto-generated method stub
        
    }

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    @Override
    public String toString() {
        return "Gafanhoto [" + super.toString() + " login=" + login + ", totAssistido=" + totAssistido + "]";
    }

    

    
    
}
