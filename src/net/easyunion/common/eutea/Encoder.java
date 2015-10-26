/**
 * 文件名：Encoder.java
 * 版权：Copyright 2014 EasyUnion
 * 描述：<描述>
 * 修改人：bony
 * 修改时间：2014年4月23日
 * 修改内容：<修改内容>
 */
package net.easyunion.common.eutea;

/**
 * @author bony
 *
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public class Encoder {
    private static final String key = "ABCDEFGHijk!myzP";
    
    public static String Encrypt(String data) {
        return Encrypt(data, key);
    }
    
    public static String Encrypt(String data, String key) {
        return ToHexString(TEncrypt(
                ToLongArray(PadRight(data, MIN_LENGTH).getBytes(
                        Charset.forName("UTF8"))),
                ToLongArray(PadRight(key, MIN_LENGTH).getBytes(
                        Charset.forName("UTF8")))));
    }

    private static long[] TEncrypt(long[] data, long[] key) {
        int n = data.length;
        if (n < 1) {
            return data;
        }

        long z = data[data.length - 1], y = data[0], sum = 0, e, p, q;
        q = 6 + 52 / n;
        while (q-- > 0) {
            sum += DELTA;
            e = (sum >> 2) & 3;
            for (p = 0; p < n - 1; p++) {
                y = data[(int) (p + 1)];
                z = data[(int) p] += (z >> 5 ^ y << 2) + (y >> 3 ^ z << 4)
                        ^ (sum ^ y) + (key[(int) (p & 3 ^ e)] ^ z);
            }
            y = data[0];
            z = data[n - 1] += (z >> 5 ^ y << 2) + (y >> 3 ^ z << 4)
                    ^ (sum ^ y) + (key[(int) (p & 3 ^ e)] ^ z);
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

    private static String ToHexString(long[] data) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            sb.append(PadLeft(Long.toHexString(data[i]), 16));
        }
        return sb.toString();
    }

    private static String PadRight(String source, int length) {
        while (source.length() < length) {
            source += SPECIAL_CHAR;
        }
        return source;
    }

    private static String PadLeft(String source, int length) {
        while (source.length() < length) {
            source = '0' + source;
        }
        return source;
    }

    private static long DELTA = 2654435769L;
    private static int MIN_LENGTH = 32;
    private static char SPECIAL_CHAR = '\0';
    
}