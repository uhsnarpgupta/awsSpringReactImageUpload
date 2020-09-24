package com.awsreact.bucket;

public enum BucketName {
    PROFILE_IMAGE("spring-react-image-upload-uhs");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
