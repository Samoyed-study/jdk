package lambda;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import lambda.entity.Person;

import java.util.Map;
import java.util.function.Consumer;

/**
 * <p>
 *
 * </p>
 *
 * @author heshuyao
 * @since 2021/8/1 - 19:50
 */
public class CustomerTest {

    public static void main(String[] args) {
        Person person = new Person();
        person.setUsername("hsy").setAge(11);
        //可以添加person的额外字段
        Map<String, Object> objectMap = toMap(person, map -> map.put("sex", "man"));
        objectMap.forEach((k, v)->{
            System.out.println(k+"="+v);
        });
        //也可以不添加
        // toMap(person, null);
    }


    public static Map<String, Object> toMap(Object source, Consumer<? super Map<String, Object>> extra) {
        Map<String, Object> objectMap = BeanUtil.beanToMap(source);
        if (ObjectUtil.isNotEmpty(extra)) {
            // 这一步有点不明白
            extra.accept(objectMap);
        }
        return objectMap;
    }

}
