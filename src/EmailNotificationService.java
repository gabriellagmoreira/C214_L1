public class EmailNotificationService implements NotificationService {
    @Override
    public void notify(String message, String recipient) {

        System.out.println("Enviando e-mail para " + recipient + ": " + message);
    }
}
