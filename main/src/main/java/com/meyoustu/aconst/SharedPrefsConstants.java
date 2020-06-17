package com.meyoustu.aconst;

/**
 * Created at 2020/6/17 11:35.
 *
 * @author Liangcheng Juves
 */
public final class SharedPrefsConstants {
  private SharedPrefsConstants() {}

  static {
    try {
      Constants.initFieldsByName(SharedPrefsConstants.class);
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
  }

  public static String KEY_IS_FIRST_OPEN_APP;

  public static String KEY_USER_IS_LOGIN;

  public static String KEY_USER_IS_QQ_LOGIN;
  public static String KEY_USER_IS_WX_LOGIN;
  public static String KEY_USER_IS_ALIPAY_LOGIN;

  public static String KEY_USER_IS_DOUYIN_LOGIN;

  public static String KEY_USER_IS_LOGIN_OUT;

  public static String KEY_USER_IS_VIP;

  public static String KEY_IS_FIRST_OPEN_TODAY;

  public static void setKeyIsFirstOpenApp(String keyIsFirstOpenApp) {
    KEY_IS_FIRST_OPEN_APP = keyIsFirstOpenApp;
  }

  public static void setKeyUserIsLogin(String keyUserIsLogin) {
    KEY_USER_IS_LOGIN = keyUserIsLogin;
  }

  public static void setKeyUserIsQqLogin(String keyUserIsQqLogin) {
    KEY_USER_IS_QQ_LOGIN = keyUserIsQqLogin;
  }

  public static void setKeyUserIsWxLogin(String keyUserIsWxLogin) {
    KEY_USER_IS_WX_LOGIN = keyUserIsWxLogin;
  }

  public static void setKeyUserIsAlipayLogin(String keyUserIsAlipayLogin) {
    KEY_USER_IS_ALIPAY_LOGIN = keyUserIsAlipayLogin;
  }

  public static void setKeyUserIsDouyinLogin(String keyUserIsDouyinLogin) {
    KEY_USER_IS_DOUYIN_LOGIN = keyUserIsDouyinLogin;
  }

  public static void setKeyUserIsLoginOut(String keyUserIsLoginOut) {
    KEY_USER_IS_LOGIN_OUT = keyUserIsLoginOut;
  }

  public static void setKeyUserIsVip(String keyUserIsVip) {
    KEY_USER_IS_VIP = keyUserIsVip;
  }

  public static void setKeyIsFirstOpenToday(String keyIsFirstOpenToday) {
    KEY_IS_FIRST_OPEN_TODAY = keyIsFirstOpenToday;
  }
}
