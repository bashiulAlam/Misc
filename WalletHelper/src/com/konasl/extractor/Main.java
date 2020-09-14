package com.konasl.extractor;

import com.sun.org.apache.xml.internal.security.Init;
import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;

import java.lang.String;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;

public class Main {

    public static void main(String[] args) throws Base64DecodingException, NoSuchAlgorithmException, InvalidKeySpecException {
        CryptoService cryptoService = new CryptoService();
        PrivateKey privateKey = cryptoService.generateKeyPair().getPrivate();
        PublicKey publicKey = cryptoService.generateKeyPair().getPublic();

        String prvtKey = "308204BD020100300D06092A864886F70D0101010500048204A7308204A30201000282010100BE1A19DFAE3EFA6569626486BDDA2A66E2420997F25884758544EC10A79D365FCE8E71752E7BB7AE1F5C003F21E36D6808450442DE0D60D8D62437ED610FBF7335151CA16980387BAAC15BFBF82F2E38FC448D24C50577644584A46A471C645958136F2E1AD1987E70E689B8B1926F96A5E4FC938795F289F97C699695E32BA20BB485BA5B4C2109AED390861A0E04754F4A006C098D3C425995BB7478CD541563A915AD7E3EBFEDC519D7267F1CEDCD71E7314071EF81A05AD77ACB102A1B3E6600B0D2904D2720872CE73F7206707BD0C4B6C5DFAE505FCAA480596CB01B55901049CE31F860FBCD5B1A661DD3E5E7D2BCCED72AB6ED4C95ED8E049155E8CB020301000102820100188EA29D04935A215395C44AABA7CD26713FFAA1484B2B014B6FF5D6C8F0441FE83CFA671AD41C8C3FBCD0C3570B5C0CBE54BC122F41272B9BAE1E136A2070A8DF4894E43D0EB53D3477B9FC38B94F8D48F94A0A5FF12ED5232DD957694C3FA253005FB263008464810D26E956F705B73E42F065D674065AD081C3DA120EC089FAEE7CCDBA46B5913AFCE77239A4CF2FE77CA60D71CBF036C55C3FE5FF93657869C06B09E51EB48E6B2CBFB230986C1FB6DD03EBA9EB744B3350A777DECFB25CE568BCF260C6E68BC47F6CA15B6599279CC5987864083E1F1D1C103DFEE125879D4DCDC7749758DADB2A877E877262823FDE550AD099113942FEFA29F3335FB102818100F9A5D834B3EDD67A302EAD5F7B5A821EC805CCC7E0B27ADD4B9DA9D804AC9B48C2C7E090696210EBB4959A1E716BFD0E4CD22C5D83067B32CAA0DF1D28D35A19E8DE3B3386FBF4B2278D331F9BC2B6519E703FA89E32EC491EE652367A0BB0B727AEFB04B597828EF9442BC27DEF1D9CA6B86035EE475133CC86D9D2661337F502818100C2F06301F6569D897D9CA63756D2B0B3D30712BD2427EC8DD43E2F2D4FFB12CB90392D8B6319F4F23A4560525F03B642D597CEBD23CB438CF67C129F427DBA0C7C7AFCC1086E8C85A02D6D9595D3D3E43A08D4CB3BC72A0CC69EA176FA2AD84D2961655E1130430D9384BD23058739BACD2BE56ECF18C51725AEA2FE0E8DE5BF02818037A4563710EF6EC15721E0348ADAD66BA3EB5F0421B9C616B2B6D657365B7E54CE4D1C693383CEFFAA053A0F94FA1BB1E73F64F206B5181A6EFD421D4EAF24C2E79B3898B87A49C4B77A0A2DFE5A7CA65E68E8575DC33DD4E2553577BCE604221E6F2AB596FFC8F2B2EE15CEC8A0D5F9C7530AE69A503CF20DA0F4C5A7489B4D02818068A7857FD8304803385C911FC48CF830926A89B4E1644DAB16F70B7CD82382C3A67A0BE9791AC65604D29A139ECEEF5A92311DDC8D0AE3091A8B21B43E8E2103F31054018DF54B9BB192B1F24CAD9C643A83E339F8ADC3F577EC51E2FE0B62748A72AF6900F1580E41D451762BD19D3C9C49A4B3089BD3B3C997280A1CE631210281810093BA4DFC7811388B3B29A396CE91E52DF3E33CA6158707E0EBC2EB075B8E1C2EA1C85C80077590F0A27B6C10B42C8BD0815C4674DB6D0F43BAD1B6BA93F5A2F3BC67197DF8A9A9EA42B470F42EA0F79583050658D23F6FA095BBCD69B715FBD1C09C3DC7651F0A53C47E6D255AAA2CFBF7DA557DBC6DDA066BD8A6534828F4CD";
        Init.init();
        //byte[] privateKeyByte = Base64.decode(prvtKey);
        byte[] privateKeyByte = prvtKey.getBytes();
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(privateKeyByte);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PrivateKey defaultPrivateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);
        System.out.println("defaultPrivateKey : " + defaultPrivateKey);

        String mpaIdValue = "1A892923ADAE0D9E70076D6A7482D3E82F704662B431D540AC014B27B422930B7BE76833C8DE5CD0D18CA184F2A492E8CF52421526F583B006F88C7FEB784BF1D1F8FE3D6E0ADDEABC6DBED4DEF79F1E38EDDF02F077449B9466137A73650BCA06A4527EA7524449960B3D4EBE2215122DD42888161DAE3F2C89DE24044C50C9";
        ByteArray mpaId = cryptoService.decryptWithRsaPrivateKey(mpaIdValue, defaultPrivateKey);
        String decryptedMpaId = mpaId.getString();

        System.out.println("decryptedMpaId : " + decryptedMpaId);

        String csr = CryptoService.generateCsr(privateKey, publicKey).toString();
        System.out.println("csr : " + csr);
    }
}
