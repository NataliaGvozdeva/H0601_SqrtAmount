import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {

        SQRService sqrService = new SQRService();
        System.out.println(sqrService.findAmount(200, 300));

    }
}
