public class Zero {
    public Boolean isEndWithZero(Integer num){
        String s = Integer.toString(num);
        return s.charAt(s.length() - 1) == '0';
   }
}
