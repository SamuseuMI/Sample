// Generated code from Butter Knife. Do not modify!
package com.cogniteq.ca.mvvm.sample.presentation.screen.info;

import android.view.View;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.cogniteq.ca.mvvm.android.sample.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class InfoFragment_ViewBinding implements Unbinder {
  private InfoFragment target;

  private View view7f08006a;

  @UiThread
  public InfoFragment_ViewBinding(final InfoFragment target, View source) {
    this.target = target;

    View view;
    target.inputTextView = Utils.findRequiredViewAsType(source, R.id.view_input_text, "field 'inputTextView'", AppCompatEditText.class);
    target.textInfoView = Utils.findRequiredViewAsType(source, R.id.view_text_info, "field 'textInfoView'", AppCompatTextView.class);
    view = Utils.findRequiredView(source, R.id.btn_update_info, "method 'onUpdateClick'");
    view7f08006a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onUpdateClick();
      }
    });
  }

  @Override
  public void unbind() {
    InfoFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.inputTextView = null;
    target.textInfoView = null;

    view7f08006a.setOnClickListener(null);
    view7f08006a = null;
  }
}
