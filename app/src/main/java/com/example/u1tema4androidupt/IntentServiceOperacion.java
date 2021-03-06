package com.example.u1tema4androidupt;

import android.app.IntentService;
import android.content.Intent;
import android.os.SystemClock;

public class IntentServiceOperacion extends IntentService {
  public IntentServiceOperacion() {
    super("IntentServiceOperacion");
  }
  @Override
  protected void onHandleIntent(Intent intent) {
    double n = intent.getExtras().getDouble("numero");
    SystemClock.sleep(5000);
    //miIntentService.salida.append(n*n + "\n");
    Intent i = new Intent();
    i.setAction(miIntentService.ReceptorOperacion.ACTION_RESP);
    i.addCategory(Intent.CATEGORY_DEFAULT);
    i.putExtra("resultado", n*n);
    sendBroadcast(i);
  }
}
