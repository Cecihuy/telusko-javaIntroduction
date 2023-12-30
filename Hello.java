/**
 * sample of StringBuffer overview
 */
class Hello{
    public static void main(String[] args){
        StringBuffer stringBuffer = new StringBuffer("Navin");
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.append(" Reddy"));
        System.out.println(stringBuffer.deleteCharAt(2));
        System.out.println(stringBuffer.insert(5, "Java "));
        stringBuffer.setLength(20);
        String str = stringBuffer.toString();
        System.out.println(str);
    }
}