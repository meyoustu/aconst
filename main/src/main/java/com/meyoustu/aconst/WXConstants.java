package com.meyoustu.aconst;

/**
 * Created at 2020/6/17 12:16.
 *
 * @author Liangcheng Juves
 */
public final class WXConstants {
  private WXConstants() {}

  public static String API_KEY;

  public static String APP_KEY;

  public static String PARTNER_ID;

  public static String APP_SECRET;

  public static void setApiKey(String apiKey) {
    API_KEY = apiKey;
  }

  public static void setAppKey(String appKey) {
    APP_KEY = appKey;
  }

  public static void setPartnerId(String partnerId) {
    PARTNER_ID = partnerId;
  }

  public static void setAppSecret(String appSecret) {
    APP_SECRET = appSecret;
  }
}
