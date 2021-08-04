package lambda.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author heshuyao
 * @since 2021/8/1 - 19:53
 */
@Data
@Accessors(chain = true)
public class Person {

    private String username;

    private Integer age;
}
