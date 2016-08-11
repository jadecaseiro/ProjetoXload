package repositorio;

import SistemaXload.Conexão.Conexao;
import SistemaXload.Modelos.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class RepositorioClienteConexao extends Conexao{
    private ArrayList<Cliente> lista;
    private static RepositorioClienteConexao instanciaRep;
    
    private RepositorioClienteConexao(){
    this.lista = new ArrayList<Cliente>();
    }
    
    public static RepositorioClienteConexao obterInstancia(){
    if (instanciaRep == null){
        instanciaRep = new RepositorioClienteConexao();
    }
    return instanciaRep;
    }
    
    public void remover (Cliente cliente)throws Exception {
    if (cliente == null){
        throw new Exception ("cliente nao instanciado");
    }
    if (cliente.getCpf() == null){
        throw new Exception ("Informe o CPF do cliente");
    }
    if(cliente.getCpf().trim().equals("")){
        throw new Exception ("Informe o CPF do cliente");
    }
    Statement conex = conectar();
    String sql ="delete from cliente where cpf = '"+ cliente.getCpf() + "'";
    try {
        conex.execute(sql);
    }catch(SQLException e){
        throw new Exception ("Erro ao executar remoção" + e.getMessage());
    }
    desconectar();
    }
    
    public void inserir (Cliente cliente)throws Exception {
    if (cliente == null){
            throw new Exception("cliente nao instanciado");
        }
        if (cliente.getCpf() == null){
            throw new Exception ("Informe o CPF do cliente");
        }
        if (cliente.getCpf().trim().equals("")) {
            throw new Exception ("Informe o CPF do cliente");
        }
        if (cliente.getNome() == null){
            throw new Exception ("Informe o Nome do cliente");
        }
        if (cliente.getNome().trim().equals("")) {
            throw new Exception ("Informe o Nome do cliente");
        }
        if (cliente.getEmail() == null){
            throw new Exception ("Informe o Email do cliente");
        }
        if (cliente.getEmail().trim().equals("")) {
            throw new Exception ("Informe o Email do cliente");
        }
        Statement conex = conectar();
        String sql = "INSERT INTO  cliente (nome, cpf, email)"; sql += "VALUES('"+cliente.getNome()+"','" + cliente.getCpf() + "','" +cliente.getEmail()+ "')";
        try{
            conex.execute(sql);
        }catch(SQLException e){
            throw new Exception ("Erro ao executar inserção: " + e.getMessage());
        }
        desconectar();        
    
    }
    
    public void atualizar (Cliente cliente)throws Exception {
    if (cliente == null){
            throw new Exception ("cliente nao instanciado");
        }
        if (cliente.getCpf() == null){
            throw new Exception ("informe o CPF do cliente");
        }
        if (cliente.getCpf().trim().equals("")){
            throw new Exception("informe o CPF do cliente");
        }
        if (cliente.getNome() == null){
            throw new Exception ("informe o nome do cliente");
        }
        if (cliente.getNome().trim().equals("")){
            throw new Exception("informe o nome do cliente");
        }
        if (cliente.getEmail() == null){
            throw new Exception ("informe o Email do cliente");
        }
        if (cliente.getEmail().trim().equals("")){
            throw new Exception("informe o Email do cliente");
        }
        Statement conex = conectar();
        String sql = "update cliente set " + "nome = '" + cliente.getNome() + "', " + "cpf= '" + cliente.getCpf() + "'," + "email = '" + cliente.getEmail() + "'"+ "where cpf= '" + cliente.getCpf()+"'";
        try{
            conex.execute(sql);
        }catch (SQLException e){
            throw new Exception("Erro ao executar atualização: " + e.getMessage());
        }
        desconectar();
    }
    
    public ArrayList<Cliente> listarTodos()throws Exception{
    Statement conex = conectar();
    ArrayList<Cliente> retorno = new ArrayList<Cliente>();
    String sql = "SELECT cpf, nome, email FROM cliente order by nome";
    try{
        ResultSet rs = conex.executeQuery(sql);
        while (rs.next()){
        Cliente cliente = new Cliente();
        cliente.setNome(rs.getString("nome"));
        cliente.setCpf(rs.getString("cpf"));
        cliente.setEmail(rs.getString("email"));
        retorno.add(cliente);
       }
   }catch(SQLException e){
            throw new Exception("Erro ao executar consulta " + e.getMessage());
   }
    desconectar();
    return retorno; 
    }
}

