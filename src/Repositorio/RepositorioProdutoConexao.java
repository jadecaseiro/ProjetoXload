package SistemaXload.Repositorio;

import SistemaXload.Conexão.Conexao;
import SistemaXload.Modelos.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RepositorioProdutoConexao extends Conexao{
    
    private ArrayList<Produto> lista;
    private static RepositorioProdutoConexao instanciaRep;
    
    public RepositorioProdutoConexao(){
    this.lista = new ArrayList<Produto>();
    }
    
    public static RepositorioProdutoConexao obterInstancia(){
    if (instanciaRep == null){
        instanciaRep = new RepositorioProdutoConexao();
    }
    return instanciaRep;
    }
    
    public ArrayList <Produto> listarTodos()throws Exception{
    Statement conex = conectar();
    ArrayList<Produto> retorno = new ArrayList<Produto>();
    String sql = "SELECT codigo, descricao, preco FROM produto order by codigo";
    try{
        ResultSet rs = conex.executeQuery(sql);
        while (rs.next()){
        Produto produto = new Produto();
        produto.setCodigo(rs.getString("codigo"));
        produto.setDescricao(rs.getString("descricao"));
        produto.setPreco(rs.getFloat("preco"));
        retorno.add(produto);
       }
   }catch(SQLException e){
            throw new Exception("Erro ao executar consulta " + e.getMessage());
   }
    desconectar();
    return retorno; 
    }
    
    public void inserir (Produto produto) throws Exception {
    if (produto == null){
            throw new Exception("produto nao instanciado");
        }
        if (produto.getCodigo() == null){
            throw new Exception ("Informe o codigo do produto");
        }
        if (produto.getCodigo().trim().equals("")) {
            throw new Exception ("Informe o codigo do produto");
        }
        if (produto.getDescricao() == null){
            throw new Exception ("Informe a descrição do produto");
        }
        if (produto.getDescricao().trim().equals("")) {
            throw new Exception ("Informe a descrição do produto");
        }
        if (produto.getPreco() == null){
            throw new Exception ("Informe o preço do produto");
        }
        if (produto.getPreco().equals("")) {
            throw new Exception ("Informe o preço do produto");
        }
        Statement conex = conectar();
        String sql = "INSERT INTO  produto (codigo, descricao, preco)"; sql += "VALUES('"+produto.getCodigo()+"','" + produto.getDescricao() + "','" +produto.getPreco()+ "')";
        try{
            conex.execute(sql);
        }catch(SQLException e){
            throw new Exception ("Erro ao executar inserção: " + e.getMessage());
        }
        desconectar(); 
    }
    
    public void remover (Produto produto) throws Exception {
    if (produto == null){
        throw new Exception ("cliente nao instanciado");
    }
    if (produto.getCodigo() == null){
        throw new Exception ("Informe o codigo do produto");
    }
    if(produto.getCodigo().trim().equals("")){
        throw new Exception ("nforme o codigo do produto");
    }
    Statement conex = conectar();
    String sql ="delete from produto where codigo = '"+ produto.getCodigo() + "'";
    try {
        conex.execute(sql);
    }catch(SQLException e){
        throw new Exception ("Erro ao executar remoção" + e.getMessage());
    }
    desconectar();
    }
    
    public void atualizar (Produto produto) throws Exception {
    if (produto == null){
            throw new Exception ("cliente nao instanciado");
        }
        if (produto.getCodigo() == null){
            throw new Exception ("informe o codigo do produto");
        }
        if (produto.getCodigo().trim().equals("")){
            throw new Exception("informe o codigo do produto");
        }
        if (produto.getDescricao() == null){
            throw new Exception ("informe a descrição do produto");
        }
        if (produto.getDescricao().trim().equals("")){
            throw new Exception("informe a descrição do produto");
        }
        if (produto.getPreco() == null){
            throw new Exception ("informe o preço do produto");
        }
        if (produto.getPreco().equals("")){
            throw new Exception("informe o preço do produto");
        }
        Statement conex = conectar();
        String sql = "update produto set " + "codigo = '" + produto.getCodigo() + "', " + "descricao= '" + produto.getDescricao() + "'," + "preco = '" + produto.getPreco() + "'"+ "where codigo= '" + produto.getCodigo()+"'";
        try{
            conex.execute(sql);
        }catch (SQLException e){
            throw new Exception("Erro ao executar atualização: " + e.getMessage());
        }
        desconectar();}
      
    
}
