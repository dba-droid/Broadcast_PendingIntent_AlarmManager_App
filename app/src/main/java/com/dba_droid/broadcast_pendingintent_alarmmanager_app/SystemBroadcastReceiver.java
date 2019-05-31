package com.dba_droid.broadcast_pendingintent_alarmmanager_app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class SystemBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("onReceive", "onReceive");

        if (intent != null && intent.getAction() != null) {
            Log.i("onReceive", intent.getAction());
        } else {
            throw new UnsupportedOperationException("Not yet implemented");
        }
    }
}
