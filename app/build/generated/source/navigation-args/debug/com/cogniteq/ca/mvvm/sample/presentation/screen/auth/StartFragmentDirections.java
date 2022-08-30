package com.cogniteq.ca.mvvm.sample.presentation.screen.auth;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.cogniteq.ca.mvvm.android.sample.R;

public class StartFragmentDirections {
  private StartFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionOpenLoginScreen() {
    return new ActionOnlyNavDirections(R.id.actionOpenLoginScreen);
  }

  @NonNull
  public static NavDirections actionOpenInfoScreen() {
    return new ActionOnlyNavDirections(R.id.actionOpenInfoScreen);
  }
}
