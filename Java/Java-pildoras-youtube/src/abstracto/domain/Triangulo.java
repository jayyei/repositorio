package abstracto.domain;

public class Triangulo extends FiguraGeometrica {

    public Triangulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Aqui deberia de dibujar un: " + this.getClass().getSimpleName());
    }
}
