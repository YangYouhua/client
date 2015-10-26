/**
 * 文件名：T.java
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
public class T {
    public static void main(String[] args) {
        String test = "340404198102010012";
        test = Encoder.Encrypt(test);
        System.out.println(test);
        test = Decoder.Decrypt(test);
        System.out.println(test);
    }
}
