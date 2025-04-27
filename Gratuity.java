public class Gratuity {
    public Double computeTip(Double total, Integer percent) {
        Double percentConversion = percent / 100.0;
        Double tip = total * percentConversion;
        return tip;
    }
}
