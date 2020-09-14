package com.konasl.extractor;

public interface ByteArray {
    byte[] getBytes();

    void setBytes(byte[] tmp);

    int getLength();

    ByteArray append(final ByteArray toAppend);

    ByteArray appendByte(byte b);

    ByteArray appendBytes(byte[] bytes, int length);

    void setByte(int offset, byte value);

    void clear();

    ByteArray copyOfRange(int from, int to);

    byte getByte(int offset);

    String getHexString();

    String getString();

    void copyBytes(ByteArray b, int src_offset, int dest_offset, int length);

    boolean isEqual(ByteArray toCompare);

    ByteArray fill(byte val);

    /**
     * Make a xor between current ByteArray and b, without modifying current
     * ByteArray
     *
     * @param b
     * @return
     */
    ByteArray makeXor(ByteArray b);

    void parityFix();

    ByteArray getUTF8();

    /**
     * returns a new bytearray copy
     */
    ByteArray clone();

    ByteArray bitWiseAnd(ByteArray value);

    void setShort(int offset, short value);

    void copyBufferToArray(byte[] buffer, int offset_src, int offset_dst, int length);

    void appendByteArrayAsLV(ByteArray fciProprietaryTemplate);
}
