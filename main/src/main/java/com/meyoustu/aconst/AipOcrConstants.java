package com.meyoustu.aconst;

/**
 * Created at 2020/6/17 13:27.
 *
 * @author Liangcheng Juves
 */
public final class AipOcrConstants {
  private AipOcrConstants() {}

  public static String API_KEY;
  public static String SECRET_KEY;

  public static void setApiKey(String apiKey) {
    API_KEY = apiKey;
  }

  public static void setSecretKey(String secretKey) {
    SECRET_KEY = secretKey;
  }
}
