public class SMSNotificationService implements NotificationService {
    @Override
    public void notify(String message, String recipient) {
        System.out.println("Enviando SMS para " + recipient + ": " + message);
    }
}
