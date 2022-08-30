package com.cogniteq.ca.mvvm.sample.presentation.screen.login;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.cogniteq.ca.mvvm.android.sample.R;

public class LoginFragmentDirections {
  private LoginFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionOpenRegistrationScreen() {
    return new ActionOnlyNavDirections(R.id.actionOpenRegistrationScreen);
  }

  @NonNull
  public static NavDirections actionOpenInfoScreen() {
    return new ActionOnlyNavDirections(R.id.actionOpenInfoScreen);
  }
}
