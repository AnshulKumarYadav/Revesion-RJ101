public class CompareString {

    public static void simpleCode() {
        String s3 = "Value1";
        String s2 = "Value2";

        for (int i = 0; i < 100000; ++i) {
            s3 = s3 + s2;
        }
        System.out.println(s3);
    }

    public static void bufferCode() {
        StringBuffer s3 = new StringBuffer("Value1");
        String s2 = "Value2";

        for (int i = 0; i < 100000; ++i) {
            s3.append(s2);
        }
        System.out.println(s3);
    }

    public static void main(String[] args) {

        simpleCode();
        // bufferCode();

    }

}
