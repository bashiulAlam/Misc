/**
 * Created by Sabab on 3/31/2018.
 */

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.naming.ldap.StartTlsResponse;

public class main {

    public static void main(String args[]) {
        String originalString = "nXJWBvUrzguFDs251uSlOwJm96bnlQxgjSluJbNRVNqNWjjIKkTchnY3lpqBWE9++2dB+JOnrZBKYOz9wACHlQ==";
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        byte[] encodedhash = digest.digest(originalString.getBytes(StandardCharsets.UTF_8));
        String encodedSha = bytesToHex(encodedhash);
        System.out.println("Sha 256 : " + encodedSha.toUpperCase());
        String str = "asss''aaa'";
        System.out.println(str);
    }

    private static String bytesToHex(byte[] hash) {
// String = null;
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
