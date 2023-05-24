public class Senior implements Observer {

    private  String name;
    private double salary;

    public Senior(String name) {
        this.name = name;
        salary = 100_000;
    }

        @Override
    public void receiveOffer(String companyName, double salary) {
        if (this.salary < salary){
            System.out.printf("Сеньор %s >>> Мне нужна эта работа! [%s - %f]\n", name, companyName, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Сеньор %s >>> Я найду работу получше! [%s - %f]\n", name, companyName, salary);
        }
    }
    
}
