public class ObjetoitemTema {
    public static void main (String [] args){

        itemTema itemTema1 = new itemTema();

        itemTema1.setId(123456789);
        itemTema1.setNome("Fone preto");
        itemTema1.setDescricao("Fones de fio simples, vendidos no camêlo");

        System.out.println(itemTema1.getId());
        System.out.println(itemTema1.getNome());
        System.out.println(itemTema1.getDescricao());
    }
}