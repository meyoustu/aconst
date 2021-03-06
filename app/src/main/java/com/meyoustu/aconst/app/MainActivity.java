package com.meyoustu.aconst.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import com.meyoustu.aconst.ManufacturerConstants;
import com.meyoustu.aconst.SharedPrefsConstants;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    showToast(SharedPrefsConstants.KEY_IS_FIRST_OPEN_APP);
    showToast(SharedPrefsConstants.KEY_IS_FIRST_OPEN_TODAY);
    showToast(ManufacturerConstants.IS_XIAOMI);
  }

  private void showToast(Object msg) {
    Toast.makeText(this, msg.toString(), Toast.LENGTH_SHORT).show();
  }
}
