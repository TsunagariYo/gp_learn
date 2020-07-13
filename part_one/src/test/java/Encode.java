public class Encode {
    private static String base64EncodeChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static String utf16to8(String str) {
        int c;
        String out = "";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            c = str.charAt(i);
            if ((c >= 1) && (c <= 127)) {
                out += str.charAt(i);
            } else {
                if (c > 2047) {
                    out += (char) (224 | ((c >> 12) & 15));
                    out += (char) (128 | ((c >> 6) & 63));
                    out += (char) (128 | ((c >> 0) & 63));
                } else {
                    out += (char) (192 | ((c >> 6) & 31));
                    out += (char) (128 | ((c >> 0) & 63));
                }
            }
        }
        return out;
    }

    public static String base64encode(String str) {

        int c1;
        int c2;
        int c3;
        int len = str.length();
        String out = "";
        int i = 0;
        while (i < len) {
            c1 = ((int)str.charAt(i++)) & 255;
            if (i == len) {
                out += base64EncodeChars.charAt(c1 >> 2);
                out += base64EncodeChars.charAt((c1 & 3) << 4);
                out += "==";
                break;
            }
            c2 = str.charAt(i++);
            if (i == len) {
                out += base64EncodeChars.charAt(c1 >> 2);
                out += base64EncodeChars.charAt(((c1 & 3) << 4) | ((c2 & 240) >> 4));
                out += base64EncodeChars.charAt((c2 & 15) << 2);
                out += "=";
                break;
            }
            c3 = str.charAt(i++);
            out += base64EncodeChars.charAt(c1 >> 2);
            out += base64EncodeChars.charAt(((c1 & 3) << 4) | ((c2 & 240) >> 4));
            out += base64EncodeChars.charAt(((c2 & 15) << 2) | ((c3 & 192) >> 6));
            out += base64EncodeChars.charAt(c3 & 63);
        }
        return out;
    }


    public static String encode(String string){
        return base64encode(utf16to8(string));
    }
}
