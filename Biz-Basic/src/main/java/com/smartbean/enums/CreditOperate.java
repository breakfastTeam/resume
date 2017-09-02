package com.smartbean.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author longkai.zlk
 * @email zhaolongkai3k@gmail.com
 * @createTime 2017/9/2
 */
@AllArgsConstructor
@Getter
public enum CreditOperate {
    SIGN(1)/**签到**/,
    CREATE(2),
    UPLOAD(2);/**上传**/

    private int credits;
}
