package desafio10;

public class Main {

    public static void enviarNot(Notificacao notificacao){
        notificacao.enviar();
    }

    public static void main(String[] args) {
        
        Notificacao note = new Email();
        Notificacao noti = new Sms();

        enviarNot(note);
        enviarNot(noti);
    }
    
}
