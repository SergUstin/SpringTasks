package com.example.uploadingfiles.storage;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class StorageProperties {
    String location = "upload-dir";
}
