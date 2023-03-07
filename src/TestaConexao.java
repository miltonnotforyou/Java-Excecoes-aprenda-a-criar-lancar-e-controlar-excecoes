
public class TestaConexao {
    public static void main(String[] args) {

        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexão");
        }

//--------------------------------------------------------------------
//        Conexao con = null;
//        try {
//            con = new Conexao();
//            con.leDados();
//            con.fecha();
//        } catch (IllegalStateException ex) {
//            System.out.println("Deu erro na conexão");
//        }finally {
//            System.out.println("Deu finally na conexão");
//            if (con != null) {
//                con.close();
//            }
//
//        }
// --------------------------------------------------------------------
    }

}
