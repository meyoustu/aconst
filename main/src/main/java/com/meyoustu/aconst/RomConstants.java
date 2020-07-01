package com.meyoustu.aconst;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created at 2020/7/1 20:50.
 *
 * @author Liangcheng Juves
 */
public final class RomConstants {

  private static final boolean invokeMethodReturnEmpty(String param)
      throws InvocationTargetException, IllegalAccessException, ClassNotFoundException,
          NoSuchMethodException {
    Class<?> sysProps = Class.forName("android.os.SystemProperties");
    if (null != sysProps) {
      Method get = sysProps.getDeclaredMethod("get", String.class, String.class);
      return ((String) get.invoke(sysProps, param, "")).isEmpty();
    }
    return false;
  }

  static {
    try {
      if (!invokeMethodReturnEmpty(RomConstants.KEY_VERSION_MIUI)) {
        isMIUI = true;
      } else if (!invokeMethodReturnEmpty(RomConstants.KEY_VERSION_EMUI)) {
        isEMUI = true;
      } else if (!invokeMethodReturnEmpty(RomConstants.KEY_VERSION_OPPO)) {
        isColorOS = true;
      } else if (!invokeMethodReturnEmpty(RomConstants.KEY_VERSION_SMARTISAN)) {
        isSmartisanOS = true;
      } else if (!invokeMethodReturnEmpty(RomConstants.KEY_VERSION_VIVO)) {
        isFuntouchOS = true;
      } else if (null != Build.class.getMethod("hasSmartBar")) {
        isFlyme = true;
      } else if ("360".equals(Build.MANUFACTURER) || "QIKU".equals(Build.MANUFACTURER)) {
        is360OS = true;
      }
    } catch (Throwable t) {
      t.printStackTrace();
    }
  }

  private RomConstants() {}

  private static final String KEY_VERSION_MIUI = "ro.miui.ui.version.name";
  private static final String KEY_VERSION_EMUI = "ro.build.version.emui";
  private static final String KEY_VERSION_OPPO = "ro.build.version.opporom";
  private static final String KEY_VERSION_SMARTISAN = "ro.smartisan.version";
  private static final String KEY_VERSION_VIVO = "ro.vivo.os.version";

  public static boolean isMIUI;
  public static boolean isEMUI;
  public static boolean isColorOS;
  public static boolean isSmartisanOS;
  public static boolean isFuntouchOS;
  public static boolean isFlyme;
  public static boolean is360OS;
}
