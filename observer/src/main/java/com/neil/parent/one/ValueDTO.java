package com.neil.parent.one;

import lombok.Builder;
import lombok.Value;

/**
 * @author nihao
 * @date 2023/5/19
 */
@Builder
@Value
public class ValueDTO {

    private String name;
    private String value;
    private String remark;

}
