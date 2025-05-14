public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome(){
        return nome;
    }

    public double getNota(){
        return nota;
    }

    public void aprovado(){
        if (nota >=60){
            System.out.println("Voce foi aprovado");
        }
        else{
            System.out.println("Voce foi reprovado");
        }
    }
}