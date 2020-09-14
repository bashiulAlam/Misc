package com.konasl.extractor;

import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;
import java.io.IOException;
import java.security.*;

public class CryptoService {
    public static ByteArray decryptWithRsaPrivateKey(String data, PrivateKey privateKey) {
        byte[] decryptedData = null;
        try {
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            decryptedData = cipher.doFinal(new DefaultByteArrayImpl(data).getBytes());
        } catch (Exception exp) {
            exp.printStackTrace();
        }
        return new DefaultByteArrayImpl(decryptedData);
    }

    public KeyPair generateKeyPair() {
        KeyPair keyPair = null;
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(1024, new SecureRandom());
            keyPair = keyPairGenerator.generateKeyPair();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return keyPair;
    }

    public static ByteArray generateCsr(PrivateKey privateKey, PublicKey publicKey) {
        ByteArray responseData = null;
        try {
            X500Principal subject = new X500Principal("C=BD, O=Kona SL, OU=RnD, CN=www.konasl.com");
            ContentSigner signer = new JcaContentSignerBuilder("SHA1WithRSA").build(privateKey);
            PKCS10CertificationRequestBuilder builder = new JcaPKCS10CertificationRequestBuilder(subject, publicKey);
            PKCS10CertificationRequest csr = builder.build(signer);
            responseData = new DefaultByteArrayImpl(csr.getEncoded());
        } catch (OperatorCreationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return responseData;
    }
}
