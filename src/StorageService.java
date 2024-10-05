public interface StorageService {
    void save(String doctor, String patient, String date, String time);

    void save(String service, String user, String time);
}
