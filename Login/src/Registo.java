
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Registo {
    
    //Variáveis Globais
    String firstName,surname,sexo,id,password,mes;
    int dia,ano;
    static ArrayList <Registo> registos = new ArrayList <> (); //Uma array para todos os objetos Registos.
    
    public Registo(String firstName,String surname,String sexo,String id,String password,int dia, String mes,int ano)
    {
      this.firstName=firstName;
      this.surname=surname;
      this.sexo=sexo;
      this.id=id;
      this.password=password;
      this.dia=dia;
      this.mes=mes;
      this.ano=ano;
    }
    public Registo()
    {
        
    }
    //Métodos Seletores
    public String getNome()
    {
        return this.firstName;
    }
    
    public String getApelido()
    {
        return this.surname;
    }
    
    public String getId()
    {
        return this.id;
    }
    
    public String getPass()
    {
        return this.password;
    }
    
    //Método para inserir um registo no ArrayList
    public void insereReg(Registo reg)
    {
        registos.add(reg); //Insere o registo no ArrayList.
    }
    
    public String pesquisaReg(String id,String pass)
    {
        if(registos.size()!=0)
        {
        for(int i=0;i<registos.size();i++)
        {
            if((id.equals(registos.get(i).id)==false))
            {
                return "ErroId";
            }
            else if((pass.equals(registos.get(i).password))==false)
            {
                return "ErroPass";
            }
            
        }
        return "Certo";
        }
        return "ErroVazio";
    }
}
