// Generated code from Butter Knife. Do not modify!
package com.cogniteq.ca.mvvm.sample.presentation.screen.login;

import android.view.View;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.cogniteq.ca.mvvm.android.sample.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class LoginFragment_ViewBinding implements Unbinder {
  private LoginFragment target;

  private View view7f080069;

  private View view7f0801f7;

  @UiThread
  public LoginFragment_ViewBinding(final LoginFragment target, View source) {
    this.target = target;

    View view;
    target.emailAddressView = Utils.findRequiredViewAsType(source, R.id.view_email_address, "field 'emailAddressView'", TextInputEditText.class);
    target.passwordView = Utils.findRequiredViewAsType(source, R.id.view_password, "field 'passwordView'", TextInputEditText.class);
    view = Utils.findRequiredView(source, R.id.btn_success, "method 'onLoginClick'");
    view7f080069 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onLoginClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.view_sign_up, "method 'onSignUpClick'");
    view7f0801f7 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSignUpClick();
      }
    });
  }

  @Override
  public void unbind() {
    LoginFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.emailAddressView = null;
    target.passwordView = null;

    view7f080069.setOnClickListener(null);
    view7f080069 = null;
    view7f0801f7.setOnClickListener(null);
    view7f0801f7 = null;
  }
}
