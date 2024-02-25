package singleton;

public class DataBaseService {

    private static volatile DataBaseService dataBaseService = null;

    private DataBaseService() {
        if (dataBaseService != null) {
            throw  new RuntimeException("There can only be one instance of Database");
        }
    }

    public static DataBaseService getInstance() {
        if (dataBaseService == null){
        synchronized (DataBaseService.class) {
            if (dataBaseService == null) {
                dataBaseService = new DataBaseService();
            }
        }
    }

        return dataBaseService;
    }

}
