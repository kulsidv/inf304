package Thread;

public class Part extends Thread{
    double right;
    double left;
    volatile static double sum;
    double countOfPart = 100;


    Part(double right, double left) {
        this.right = right;
        this.left = left;
    }

    private Double func(Double x) {
        return Math.sin(x*x);
    }
    @Override
    public void run() {
        double h = (left - right)/countOfPart;
        for(int i = 0; i < countOfPart; ++i) {
            synchronized (this) {
                sum += h * func(right + i * h + h / 2);
            }
        }
    }
    public double getSum() {
        return sum;
    }
}
