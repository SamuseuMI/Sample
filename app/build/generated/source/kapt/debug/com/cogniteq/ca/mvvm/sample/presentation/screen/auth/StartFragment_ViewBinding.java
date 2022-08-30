// Generated code from Butter Knife. Do not modify!
package com.cogniteq.ca.mvvm.sample.presentation.screen.auth;

import android.view.View;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.cogniteq.ca.mvvm.android.sample.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class StartFragment_ViewBinding implements Unbinder {
  private StartFragment target;

  @UiThread
  public StartFragment_ViewBinding(StartFragment target, View source) {
    this.target = target;

    target.logoImage = Utils.findRequiredViewAsType(source, R.id.image_logo, "field 'logoImage'", AppCompatImageView.class);
  }

  @Override
  public void unbind() {
    StartFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.logoImage = null;
  }
}
