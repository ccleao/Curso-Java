package Excecao.personalizadaA;

@SuppressWarnings("serial")
public class NegativeNumberExcp extends RuntimeException {
    private String atribName;

    public NegativeNumberExcp(String nota) {
        this.atribName = atribName;
    }

    public String getMessage() {
        return String.format("O atributo %s está fora do intervalo ", atribName);
    }

//    public String getMessage() {
//        return String.format("O atributo %s está vazio ", atribName);
    }
