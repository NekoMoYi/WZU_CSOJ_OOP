import java.util.Scanner;

class Cpu {
    public int rank;
    public int frequency;
    public double voltage;

    public Cpu(int rank, int frequency, double voltage) {
        System.out.println("Constructing a CPU");
        this.rank = rank;
        this.frequency = frequency;
        this.voltage = voltage;
    }

    public void run() {
        System.out.println("CPU is running");
    }

    public void stop() {
        System.out.println("CPU is stopping");
    }
}

public class D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rank, frequency;
        float voltage;

        rank = input.nextInt();
        frequency = input.nextInt();
        voltage = input.nextFloat();

        Cpu c = new Cpu(rank, frequency, voltage);
        System.out.println("rank: " + c.rank);
        System.out.println("frequency: " + c.frequency);
        System.out.printf("voltage: %.5f\n", c.voltage);
        c.run();
        c.stop();
        input.close();
    }
}