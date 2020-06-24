package com.meyoustu.aconst;

/**
 * Created at 2020/6/17 13:21.
 *
 * @author Liangcheng Juves
 */
public final class AliPayConstants {
  private AliPayConstants() {}

  public static String APP_ID;
  public static String PUBLIC_KEY;

  public static void setAppId(String appId) {
    APP_ID = appId;
  }

  public static void setPublicKey(String publicKey) {
    PUBLIC_KEY = publicKey;
  }
}
