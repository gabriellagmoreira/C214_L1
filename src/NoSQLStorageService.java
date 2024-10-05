public abstract class NoSQLStorageService implements StorageService {
    @Override
    public void save(String service, String user, String time) {

        System.out.println("Salvando no banco NoSQL: Serviço: " + service + ", Usuário: " + user + ", Horário: " + time);
    }
}
