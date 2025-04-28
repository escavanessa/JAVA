public class WhichTwo {
    public String whichTwo(Integer a, Integer b, Integer c) {
        if(a + b == c) return "c";
        if(b + c == a) return "a";
        if(a + c == b) return "b";

        return "none ";
    }
}
