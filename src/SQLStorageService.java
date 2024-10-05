public abstract class SQLStorageService implements StorageService {
    @Override
    public void save(String doctor, String patient, String date, String time) {

        System.out.println("Salvando no banco SQL: Dra. " + doctor + ", Paciente: " + patient + ", Data: " + date + ", Hora: " + time);
    }
}
