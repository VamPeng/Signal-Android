/*
 * Copyright 2025 Signal Messenger, LLC
 * SPDX-License-Identifier: AGPL-3.0-only
 */

package org.thoughtcrime.securesms;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.signal.glide.Log;

/**
 * <pre>
 *     author : Peng_YuHui
 *     time   : 2024/5/24 16:16
 *     desc   :
 * </pre>
 */
public class ActivityCallback implements Application.ActivityLifecycleCallbacks {

  private static final String TAG = "ActivityStack";

  private ApplicationContext app;

  private Activity topActivity;

  public ActivityCallback(ApplicationContext application) {
    app = application;
  }

  @Override public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {
    topActivity = activity;
    log("ActivityOnCreate: " + activity.getClass().getCanonicalName());
  }

  @Override public void onActivityStarted(@NonNull Activity activity) {

  }

  @Override public void onActivityResumed(@NonNull Activity activity) {

  }

  @Override public void onActivityPaused(@NonNull Activity activity) {

  }

  @Override public void onActivityStopped(@NonNull Activity activity) {

  }

  @Override public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {

  }

  @Override public void onActivityDestroyed(@NonNull Activity activity) {

  }

  private void log(String content) {
    Log.i(TAG, content);
  }

}
