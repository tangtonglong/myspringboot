package com.ttl.myspringboot.po;

public class qrtz_blob_triggers extends qrtz_blob_triggersKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_blob_triggers.BLOB_DATA
     *
     * @mbggenerated
     */
    private byte[] blobData;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_blob_triggers.BLOB_DATA
     *
     * @return the value of qrtz_blob_triggers.BLOB_DATA
     *
     * @mbggenerated
     */
    public byte[] getBlobData() {
        return blobData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_blob_triggers.BLOB_DATA
     *
     * @param blobData the value for qrtz_blob_triggers.BLOB_DATA
     *
     * @mbggenerated
     */
    public void setBlobData(byte[] blobData) {
        this.blobData = blobData;
    }
}