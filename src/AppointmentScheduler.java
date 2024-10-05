public class AppointmentScheduler {

    private NotificationService notificationService;
    private StorageService storageService;


    public AppointmentScheduler(NotificationService notificationService, StorageService storageService) {
        this.notificationService = notificationService;
        this.storageService = storageService;
    }

    // Método para agendar uma consulta e notificar o paciente
    public void schedule(String patient, String date, String time) {
        String doctor = "Carolina";

        storageService.save(doctor, patient, date, time);

        notificationService.notify("Sua consulta com Dra. " + doctor + " está marcada para " + date + " às " + time + ".", patient);
    }

    public static void main(String[] args) {

        NotificationService emailService = new EmailNotificationService();
        StorageService sqlStorage = new SQLStorageService() {
            @Override
            public void save(String service, String user, String time) {

            }
        };


        AppointmentScheduler scheduler = new AppointmentScheduler(emailService, sqlStorage);


        scheduler.schedule("Gabriella Moreira", "02/10/2024", "14:00");


        NotificationService smsService = new SMSNotificationService();


        AppointmentScheduler schedulerSMS = new AppointmentScheduler(smsService, sqlStorage);


        schedulerSMS.schedule("Marcela Moreira", "02/10/204", "15:00");
    }
}
