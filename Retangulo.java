public class Retangulo {
    private int base, altura;

    public Retangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    public double getArea(){
        return base * altura;
    }

    public double getPerimetro(){
        return (base + altura) *2;
    }
}