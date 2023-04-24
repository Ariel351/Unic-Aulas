public class Main {
    public static void main(String[] args) {
        Televisao tv1 = new Televisao(100.0, "preto", "samsung", 'A', 10, 1080, true);
        Televisao tv2 = new Televisao(32, false);
        WashingMachine wm1 =new WashingMachine(29, 100, "preto", "samsung", 'A', 50);
        WashingMachine wm2 =new WashingMachine(29, 10);
        double precoFinalTv1 = tv1.precoFinal();
        double precoFinalTv2 = tv2.precoFinal();
        double precoFinalwm1 = wm1.precoFinal();
        double precoFinalwm2 = wm2.precoFinal();
        
        System.out.println("Preço final da TV 1: " + precoFinalTv1);
        System.out.println("Preço final da TV 2: " + precoFinalTv2);
        System.out.println("Preço final da WM 1: " + precoFinalwm1);
        System.out.println("Preço final da WM 2: " + precoFinalwm2);
    }
}
