package com.konasl.extractor;

public class DefaultByteArrayImpl implements ByteArray {
    private byte[] data;
    /**
     * The length.
     */
    private int length;

    /**
     * Instantiates a new byte array.
     */
    public DefaultByteArrayImpl() {
    }

    /**
     * Instantiates a new byte array.
     *
     * @param len the len
     */
    public DefaultByteArrayImpl(final int len) {
        length = len;
        data = new byte[len];
    }

    /**
     * Instantiates a new byte array.
     *
     * @param string_bytes the string_bytes
     */
    public DefaultByteArrayImpl(String string_bytes) {
        if (string_bytes == null) {
            length = 0;
            return;
        }
        final int string_length = string_bytes.length();

        if (string_bytes.length() % 2 != 0) {
            throw new IllegalArgumentException(
                    "Number of characters should be even for a hexadecimal buffer");
        }
        length = string_length / 2;
        data = new byte[length];

        for (int index = 0; index < length; index++) {
            final String unit_hex = string_bytes.substring(index * 2, index * 2 + 2);
            data[index] = (byte) Integer.parseInt(unit_hex, 16);
        }

    }

    /**
     * Instantiates a new byte array.
     *
     * @param bytes the bytes
     */
    public DefaultByteArrayImpl(final byte[] bytes) {
        this.length = bytes.length;
        data = new byte[length];
        System.arraycopy(bytes, 0, data, 0, length);
    }

    /**
     * Instantiates a new byte array.
     *
     * @param bytes the bytes
     */
    public DefaultByteArrayImpl(final byte[] bytes, int length) {
        this.length = length;
        data = new byte[length];
        System.arraycopy(bytes, 0, data, 0, length);
    }

    public DefaultByteArrayImpl(final byte[] inBuffer, final int offset, final int apdu_length) {
        length = apdu_length;
        data = new byte[length];
        System.arraycopy(inBuffer, offset, data, 0, length);
    }

    @Override
    public byte[] getBytes() {
        return new byte[0];
    }

    @Override
    public void setBytes(byte[] tmp) {

    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public ByteArray append(ByteArray toAppend) {
        return null;
    }

    @Override
    public ByteArray appendByte(byte b) {
        return null;
    }

    @Override
    public ByteArray appendBytes(byte[] bytes, int length) {
        return null;
    }

    @Override
    public void setByte(int offset, byte value) {

    }

    @Override
    public void clear() {

    }

    @Override
    public ByteArray copyOfRange(int from, int to) {
        return null;
    }

    @Override
    public byte getByte(int offset) {
        return 0;
    }

    @Override
    public String getHexString() {
        return null;
    }

    @Override
    public String getString() {
        return null;
    }

    @Override
    public void copyBytes(ByteArray b, int src_offset, int dest_offset, int length) {

    }

    @Override
    public boolean isEqual(ByteArray toCompare) {
        return false;
    }

    @Override
    public ByteArray fill(byte val) {
        return null;
    }

    @Override
    public ByteArray makeXor(ByteArray b) {
        return null;
    }

    @Override
    public void parityFix() {

    }

    @Override
    public ByteArray getUTF8() {
        return null;
    }

    @Override
    public ByteArray clone() {
        return null;
    }

    @Override
    public ByteArray bitWiseAnd(ByteArray value) {
        return null;
    }

    @Override
    public void setShort(int offset, short value) {

    }

    @Override
    public void copyBufferToArray(byte[] buffer, int offset_src, int offset_dst, int length) {

    }

    @Override
    public void appendByteArrayAsLV(ByteArray fciProprietaryTemplate) {

    }
}
