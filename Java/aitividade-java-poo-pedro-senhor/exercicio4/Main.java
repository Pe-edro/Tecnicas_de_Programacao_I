public class Main {
    public static void main(String[] args) {
        Pagamento pagamentoPix = new PagamentoPix(100);
        Pagamento pagamentoCartao = new PagamentoCartao(100, 3);
        Pagamento pagamentoBoleto = new PagamentoBoleto(100);
 
        pagamentoPix.processar();
        System.out.println();
        pagamentoCartao.processar();
        System.out.println();
        pagamentoBoleto.processar();
    }
}