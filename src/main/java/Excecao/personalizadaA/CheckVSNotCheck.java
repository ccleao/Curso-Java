package Excecao.personalizadaA;

public class CheckVSNotCheck {
    public static void main(String[] args) {
        try {
            errorGen1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            errorGen2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fim");

    }

    //throw herda somente de throwable;
    //Exceção não checada ou não verificada;
    static void errorGen1(){
        throw new RuntimeException("Pretty cool error");

    }

        //Exceção checada ou verificada;

        static void errorGen2 () throws Exception {
            throw new Exception("Cool error #2");

        }
    }
