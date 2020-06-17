package com.meyoustu.aconst;

import java.lang.reflect.Field;

/**
 * Created at 2020/6/17 11:42.
 *
 * @author Liangcheng Juves
 */
public final class Constants {
  private Constants() {}

  public static final void initFieldsByName(Class<?> clazz) throws IllegalAccessException {
    if (null != clazz) {
      Field[] fields = clazz.getDeclaredFields();
      if (null != fields) {
        for (Field field : fields) {
          field.set(clazz, field.getName());
        }
      }
    }
  }
}
