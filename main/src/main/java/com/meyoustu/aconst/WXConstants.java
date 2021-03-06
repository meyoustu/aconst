package com.meyoustu.aconst;

/**
 * Created at 2020/6/17 12:16.
 *
 * @author Liangcheng Juves
 */
public final class WXConstants {
  private WXConstants() {}

  public static String API_KEY;

  public static String APP_ID;

  public static String PARTNER_ID;

  public static String APP_SECRET;

  public static String OPERATION_PWD;

  public static void setApiKey(String apiKey) {
    API_KEY = apiKey;
  }

  public static void setAppId(String appId) {
    APP_ID = appId;
  }

  public static void setPartnerId(String partnerId) {
    PARTNER_ID = partnerId;
  }

  public static void setAppSecret(String appSecret) {
    APP_SECRET = appSecret;
  }

  public static void setOperationPwd(String operationPwd) {
    OPERATION_PWD = operationPwd;
  }
}
