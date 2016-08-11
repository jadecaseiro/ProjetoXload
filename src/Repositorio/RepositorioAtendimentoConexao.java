package SistemaXload.Repositorio;

import SistemaXload.Conexão.Conexao;
import SistemaXload.Modelos.Atendimento;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class RepositorioAtendimentoConexao extends Conexao{
    private ArrayList<Atendimento> lista;
    private static RepositorioAtendimentoConexao instanciaRep;
    
    private RepositorioAtendimentoConexao(){
    this.lista = new ArrayList<Atendimento>();
    }
    
    public static RepositorioAtendimentoConexao obterInstancia(){
    if (instanciaRep == null){
        instanciaRep = new RepositorioAtendimentoConexao();
    }
    return instanciaRep;
    }
    
    public void remover (Atendimento atendimento)throws Exception {
    if (atendimento == null){
        throw new Exception ("cliente nao instanciado");
    }
    if (atendimento.getCpfCliente() == null){
        throw new Exception ("Informe o CPF do cliente");
    }
    if(atendimento.getCpfCliente().trim().equals("")){
        throw new Exception ("Informe o CPF do cliente");
    }
    Statement conex = conectar();
    String sql ="delete from atendimento where cpfCliente = '"+ atendimento.getCpfCliente() + "'";
    try {
        conex.execute(sql);
    }catch(SQLException e){
        throw new Exception ("Erro ao executar remoção" + e.getMessage());
    }
    desconectar();
    }
    
    public void inserir (Atendimento atendimento)throws Exception {
    if (atendimento == null){
            throw new Exception ("cliente nao instanciado");
        }
        if (atendimento.getCpfCliente() == null){
            throw new Exception ("informe o CPF do cliente");
        }
        if (atendimento.getCpfCliente().trim().equals("")){
            throw new Exception("informe o CPF do cliente");
        }
        if (atendimento.getDataHora() == null){
            throw new Exception ("informe a data e a hora do atendimento");
        }
        if (atendimento.getDataHora().trim().equals("")){
            throw new Exception("informe a data e a hora do atendimento");
        }
        if (atendimento.getResolucao() == null){
            throw new Exception ("informe Sim para resolvido e Não para pendente");
        }
        if (atendimento.getResolucao().trim().equals("")){
            throw new Exception ("informe Sim para resolvido e Não para pendente");
        }
        if (atendimento.getCodProduto() == null){
            throw new Exception ("informe o código do produto do atendimento");
        }
        if (atendimento.getCodProduto().trim().equals("")){
            throw new Exception ("informe o código do produto do atendimento");
        }
        if (atendimento.getDescricaoAtendimento() == null){
            throw new Exception ("informe a descrição do atendimento");
        }
        if (atendimento.getDescricaoAtendimento().trim().equals("")){
            throw new Exception ("informe a descrição do atendimento");
        }
        Statement conex = conectar();
        String sql = "INSERT INTO  atendimento (cpfCliente,dataHora,resolucao,codProduto,descricaoAtendimento)"; sql += "VALUES('"+atendimento.getCpfCliente()+"','" + atendimento.getDataHora() + "','" +atendimento.getResolucao()+ "','"+atendimento.getCodProduto()+"','"+atendimento.getDescricaoAtendimento()+"')";
        try{
            conex.execute(sql);
        }catch(SQLException e){
            throw new Exception ("Erro ao executar inserção: " + e.getMessage());
        }
        desconectar();        
    
    }
    
    public void atualizar (Atendimento atendimento)throws Exception {
    if (atendimento == null){
            throw new Exception ("cliente nao instanciado");
        }
        if (atendimento.getCpfCliente() == null){
            throw new Exception ("informe o CPF do cliente");
        }
        if (atendimento.getCpfCliente().trim().equals("")){
            throw new Exception("informe o CPF do cliente");
        }
        if (atendimento.getDataHora() == null){
            throw new Exception ("informe a data e a hora do atendimento");
        }
        if (atendimento.getDataHora().trim().equals("")){
            throw new Exception("informe a data e a hora do atendimento");
        }
        if (atendimento.getResolucao() == null){
            throw new Exception ("informe Sim para resolvido e Não para pendente");
        }
        if (atendimento.getResolucao().trim().equals("")){
            throw new Exception ("informe Sim para resolvido e Não para pendente");
        }
        if (atendimento.getCodProduto() == null){
            throw new Exception ("informe o código do produto do atendimento");
        }
        if (atendimento.getCodProduto().trim().equals("")){
            throw new Exception ("informe o código do produto do atendimento");
        }
        if (atendimento.getDescricaoAtendimento() == null){
            throw new Exception ("informe a descrição do atendimento");
        }
        if (atendimento.getDescricaoAtendimento().trim().equals("")){
            throw new Exception ("informe a descrição do atendimento");
        }
            
        Statement conex = conectar();
        String sql = "update atendimento set " + "cpfCliente = '" + atendimento.getCpfCliente() + "', " + "dataHora= '" + atendimento.getDataHora() + "'," + "resolucao = '" + atendimento.getResolucao() + "',"+"codProduto = '" + atendimento.getCodProduto() + "',"+"descricaoAtendimento = '" + atendimento.getDescricaoAtendimento() + "'"+ "where cpfCliente= '" + atendimento.getCpfCliente()+"'";
        try{
            conex.execute(sql);
        }catch (SQLException e){
            throw new Exception("Erro ao executar atualização: " + e.getMessage());
        }
        desconectar();
    }
    
    public ArrayList<Atendimento> listarTodos()throws Exception{
    Statement conex = conectar();
    ArrayList<Atendimento> retorno = new ArrayList<Atendimento>();
    String sql = "SELECT cpfCliente,dataHora,resolucao,codProduto,descricaoAtendimento FROM atendimento order by cpfCliente";
    try{
        ResultSet rs = conex.executeQuery(sql);
        while (rs.next()){
        Atendimento atendimento = new Atendimento();
        atendimento.setCpfCliente(rs.getString("cpfCliente"));
        atendimento.setDataHora(rs.getString("dataHora"));
        atendimento.setResolucao(rs.getString("resolucao"));
        atendimento.setCodProduto(rs.getString("codProduto"));
        atendimento.setDescricaoAtendimento(rs.getString("descricaoAtendimento"));
        retorno.add(atendimento);
       }
   }catch(SQLException e){
            throw new Exception("Erro ao executar consulta " + e.getMessage());
   }
    desconectar();
    return retorno; 
    }
}

