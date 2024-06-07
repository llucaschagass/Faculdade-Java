public class Main {
    public static void main(String[] args) {
        Cachorro toto = new Cachorro();
        Tartaruga rafael = new Tartaruga();

        toto.latir();
        toto.abanarRabo();
        rafael.andar();
        rafael.emitirSom();

        toto.nome="Madruguinha";
        System.out.println(toto.nome);

    }
}