public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sBuffer = new StringBuffer("Hello");
        System.out.println(sBuffer);
        sBuffer.append("World");
        System.out.println(sBuffer);

        System.out.println(sBuffer.charAt(5));
        System.out.println(sBuffer.indexOf("W"));
    }

}
