package com.meyoustu.aconst;

/**
 * Created at 2020/6/17 12:16.
 *
 * @author Liangcheng Juves
 */
public final class UmengConstants {
  private UmengConstants() {}

  public static String U_APP_APP_KEY;
  public static String U_PUSH_APP_KEY;
  public static String U_SHARE_APP_KEY;

  public static void setUAppAppKey(String uAppAppKey) {
    U_APP_APP_KEY = uAppAppKey;
  }

  public static void setUPushAppKey(String uPushAppKey) {
    U_PUSH_APP_KEY = uPushAppKey;
  }

  public static void setUShareAppKey(String uShareAppKey) {
    U_SHARE_APP_KEY = uShareAppKey;
  }
}
