package com.smartbean.utils;

import java.io.File;
import java.io.IOException;

/**
 * @author longkai.zlk
 * @email zhaolongkai3k@gmail.com
 * @createTime 2017/9/2
 */
@FunctionalInterface
public interface FileTransferMethod {

    void transferTo(File dest) throws IOException, IllegalStateException;
}
