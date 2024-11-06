public class App {
    public static void main(String[] args) throws Exception {

        Imovel casa = new Imovel();
        casa.setTipo(TipoImovel.Apartamento);
        casa.setGaragem(true);
        casa.setMetrosQuadrados(42);
        casa.setNumAndares(1);
        casa.setNumBanheiros(1);
        casa.setComodos("Cozinha, sala, 2 quartos");
        casa.setPiso(TipoPiso.Cerâmica);
        System.out.println(casa.infos());
    }
}
