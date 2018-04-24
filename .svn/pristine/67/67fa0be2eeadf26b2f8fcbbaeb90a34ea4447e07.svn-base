/**
 * 文件名：Decoder.java
 * 版权：Copyright 2014 EasyUnion
 * 描述：<描述>
 * 修改人：bony
 * 修改时间：2014年7月25日
 * 修改内容：<修改内容>
 */
package net.easyunion.common.eutea;

/**
 * @author bony
 *
 */
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class Decoder {
    private static final String key = "ABCDEFGHijk!myzP";
    
    public static String Decrypt(String data) {
        return Decrypt(data, key);
    }
    
    public static String Decrypt(String data, String key) {
        if (data == null || data.length() < MIN_LENGTH) {
            return data;
        }
        byte[] code = ToByteArray(TDecrypt(
                ToLongArray(data),
                ToLongArray(PadRight(key, MIN_LENGTH).getBytes(
                        Charset.forName("UTF8")))));
        return new String(code, Charset.forName("UTF8"));
    }

    private static long[] TDecrypt(long[] data, long[] key) {
        int n = data.length;
        if (n < 1) {
            return data;
        }

        long z = data[data.length - 1], y = data[0], sum = 0, e, p, q;
        q = 6 + 52 / n;
        sum = q * DELTA;
        while (sum != 0) {
            e = (sum >> 2) & 3;
            for (p = n - 1; p > 0; p--) {
                z = data[(int) (p - 1)];
                y = data[(int) p] -= (z >> 5 ^ y << 2) + (y >> 3 ^ z << 4)
                        ^ (sum ^ y) + (key[(int) (p & 3 ^ e)] ^ z);
            }
            z = data[n - 1];
            y = data[0] -= (z >> 5 ^ y << 2) + (y >> 3 ^ z << 4) ^ (sum ^ y)
                    + (key[(int) (p & 3 ^ e)] ^ z);
            sum -= DELTA;
        }

        return data;
    }

    private static long[] ToLongArray(byte[] data) {
        int n = (data.length % 8 == 0 ? 0 : 1) + data.length / 8;
        long[] result = new long[n];

        for (int i = 0; i < n - 1; i++) {
            result[i] = bytes2long(data, i * 8);
        }

        byte[] buffer = new byte[8];
        for (int i = 0, j = (n - 1) * 8; j < data.length; i++, j++) {
            buffer[i] = data[j];
        }
        result[n - 1] = bytes2long(buffer, 0);

        return result;
    }

    private static byte[] ToByteArray(long[] data) {
        List<Byte> result = new ArrayList<Byte>();

        for (int i = 0; i < data.length; i++) {
            byte[] bs = long2bytes(data[i]);
            for (int j = 0; j < 8; j++) {
                result.add(bs[j]);
            }
        }

        while (result.get(result.size() - 1) == SPECIAL_CHAR) {
            result.remove(result.size() - 1);
        }

        byte[] ret = new byte[result.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = result.get(i);
        }
        return ret;
    }

    public static byte[] long2bytes(long num) {
        ByteBuffer buffer = ByteBuffer.allocate(8).order(
                ByteOrder.LITTLE_ENDIAN);
        buffer.putLong(num);
        return buffer.array();
    }

    public static long bytes2long(byte[] b, int index) {
        ByteBuffer buffer = ByteBuffer.allocate(8).order(
                ByteOrder.LITTLE_ENDIAN);
        buffer.put(b, index, 8);
        return buffer.getLong(0);
    }

    private static long[] ToLongArray(String data) {
        int len = data.length() / 16;
        long[] result = new long[len];
        for (int i = 0; i < len; i++) {
            result[i] = new BigInteger(data.substring(i * 16, i * 16 + 16), 16)
                    .longValue();
        }
        return result;
    }

    private static String PadRight(String source, int length) {
        while (source.length() < length) {
            source += SPECIAL_CHAR;
        }
        return source;
    }

    private static long DELTA = 2654435769L;
    private static int MIN_LENGTH = 32;
    private static char SPECIAL_CHAR = '\0';
    
    
    
    public static void main(String[] args) {
        //我们按照原接口，传入加密的纳税人识别号，您那边解密。然后继续走流程，如果解密失败的，就不继续往下走。
        String nsrsbhMw = "9c4e8b8f7524f282eef434829c596ace4f9e7802843ed61ad17b488b8c756935";
        System.out.println(Decoder.Decrypt(nsrsbhMw));
    }
}
