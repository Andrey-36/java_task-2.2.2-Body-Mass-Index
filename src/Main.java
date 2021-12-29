public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
    float weight = 74; // масса человека в килограммах
    float growth = 172; // рост в сантиметрах
float index = service.calculate(weight, growth);
        System.out.println(index);
     }
    }

