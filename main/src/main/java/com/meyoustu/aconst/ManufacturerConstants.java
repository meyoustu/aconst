package com.meyoustu.aconst;

import static android.os.Build.BRAND;

/**
 * Created at 2020/7/12 0:11.
 *
 * @author Liangcheng Juves
 */
public final class ManufacturerConstants {
  private ManufacturerConstants() {}

  public static final String BUILD_BRAND_LOWERCASE = BRAND.toLowerCase();

  public static final boolean IS_HUAWEI =
      null != BRAND
          && ("huawei".equals(BUILD_BRAND_LOWERCASE) || "honor".equals(BUILD_BRAND_LOWERCASE));

  private static boolean chkSimpleManufacturer(String name) {
    return null != BRAND && name.equals(BUILD_BRAND_LOWERCASE);
  }

  public static final boolean IS_XIAOMI = chkSimpleManufacturer("xiaomi");

  public static final boolean IS_OPPO = chkSimpleManufacturer("oppo");

  public static final boolean IS_VIVO = chkSimpleManufacturer("vivo");

  public static final boolean IS_MEIZU = chkSimpleManufacturer("meizu");

  public static final boolean IS_SAMSUNG = chkSimpleManufacturer("samsung");

  public static final boolean IS_LETV = chkSimpleManufacturer("letv");

  public static final boolean IS_SMARTISAN = chkSimpleManufacturer("smartisan");

  public static final boolean IS_360 =
      null != BRAND
          && ("360".equals(BUILD_BRAND_LOWERCASE) || "QIKU".equals(BUILD_BRAND_LOWERCASE));
}
