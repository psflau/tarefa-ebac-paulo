package cap15;

public class CarroCompactoFactory implements CarroFactory {
    @Override
    public Carro criarCarro() {
        return new CarroCompacto();
    }
}
