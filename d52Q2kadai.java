// s23027
// エラーを解消して、出力するように変更。

public class d52Q2kadai {
    public static void main(String[] args) {
        Temper t = new Temper();
        t.setTemperature(17.2);
        System.out.println(t.getTemperature());
    }

    static class Temper {
        private double temperature;

        public double getTemperature() {
            return temperature;
        }

        public void setTemperature(double temperature) {
            this.temperature = temperature;
        }
    }
}

