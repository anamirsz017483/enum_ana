public class endereco1 {
    public static void main(String[] args) {
        endereco endereco1 = new endereco(123456789, "Brasil, Avenida Brasil", 23, "apto. 202", "Vossoroca", "Votorantim", "14015-040", "SP");
        System.out.println(endereco1.getId());
        System.out.println(endereco1.getLogradouro());
        System.out.println(endereco1.getNumero());
        System.out.println(endereco1.getComplemento());
        System.out.println(endereco1.getBairro());
        System.out.println(endereco1.getCidade());
        System.out.println(endereco1.getCep());
        System.out.println(endereco1.getUf());
    }
}