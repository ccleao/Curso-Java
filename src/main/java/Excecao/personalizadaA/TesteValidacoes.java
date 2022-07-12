package Excecao.personalizadaA;

import java.util.EmptyStackException;
public class TesteValidacoes {
    public static void main(String[] args) {


      try{
          Validate.aluno(new Streams.Aluno("", -7, 60));
      }catch (EmptyStackException e){
          System.out.println(e.getMessage());
      }catch (NegativeNumberExcp e) {
          System.out.println(e.getMessage());
      }
        System.out.println("Fim");
    }
}