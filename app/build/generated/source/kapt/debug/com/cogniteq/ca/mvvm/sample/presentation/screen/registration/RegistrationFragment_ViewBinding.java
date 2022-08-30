// Generated code from Butter Knife. Do not modify!
package com.cogniteq.ca.mvvm.sample.presentation.screen.registration;

import android.view.View;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.cogniteq.ca.mvvm.android.sample.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class RegistrationFragment_ViewBinding implements Unbinder {
  private RegistrationFragment target;

  private View view7f080069;

  @UiThread
  public RegistrationFragment_ViewBinding(final RegistrationFragment target, View source) {
    this.target = target;

    View view;
    target.fullNameView = Utils.findRequiredViewAsType(source, R.id.view_full_name, "field 'fullNameView'", TextInputEditText.class);
    target.emailAddressView = Utils.findRequiredViewAsType(source, R.id.view_email_address, "field 'emailAddressView'", TextInputEditText.class);
    target.passwordView = Utils.findRequiredViewAsType(source, R.id.view_password, "field 'passwordView'", TextInputEditText.class);
    view = Utils.findRequiredView(source, R.id.btn_success, "method 'onRegistrationClick'");
    view7f080069 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRegistrationClick();
      }
    });
  }

  @Override
  public void unbind() {
    RegistrationFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.fullNameView = null;
    target.emailAddressView = null;
    target.passwordView = null;

    view7f080069.setOnClickListener(null);
    view7f080069 = null;
  }
}
