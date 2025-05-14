public class Main {
    public static void main(String[]args)
    {
        Aluno aluno1 = new Aluno("Joao",70);
        Retangulo retangulo1 = new Retangulo(5, 5);

        aluno1.aprovado();
        double area_retangulo1 = retangulo1.getArea();
        System.out.println(area_retangulo1);
        
    }
}