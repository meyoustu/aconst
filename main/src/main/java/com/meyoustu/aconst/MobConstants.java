package com.meyoustu.aconst;

/**
 * Created at 2020/6/24 9:29.
 *
 * @author Liangcheng Juves
 */
public final class MobConstants {
  private MobConstants() {}

  public static String APP_KEY;
  public static String APP_SECRET;

  public static void setAppKey(String appKey) {
    APP_KEY = appKey;
  }

  public static void setAppSecret(String appSecret) {
    APP_SECRET = appSecret;
  }
}
