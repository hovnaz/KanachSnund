package am.kanachsnund.kanachsnund.util;

import am.kanachsnund.kanachsnund.exseption.FileNotExistException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * this class works with files
 */
@Component
@Slf4j
public class IOUtil {

    public byte[] getAllBytesByUrl(String fileUrl) {
        try {
            log.info("request get image");
            InputStream inputStream = new FileInputStream(fileUrl);
            return IOUtils.toByteArray(inputStream);
        } catch (IOException e) {
            log.error("fail to take image");
            throw new FileNotExistException(e.getMessage());
        }
    }
}