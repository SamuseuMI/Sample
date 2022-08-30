package com.cogniteq.ca.mvvm.sample.presentation.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/presentation/navigation/ScreenNavigator;", "", "()V", "AuthNavigator", "app_debug"})
public final class ScreenNavigator {
    
    public ScreenNavigator() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\f"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/presentation/navigation/ScreenNavigator$AuthNavigator;", "", "()V", "navigateUp", "", "view", "Landroid/view/View;", "openInfoScreen", "", "openInfoScreenAfterLogin", "openLoginScreen", "openRegistrationScreen", "app_debug"})
    public static final class AuthNavigator {
        @org.jetbrains.annotations.NotNull()
        public static final com.cogniteq.ca.mvvm.sample.presentation.navigation.ScreenNavigator.AuthNavigator INSTANCE = null;
        
        private AuthNavigator() {
            super();
        }
        
        public final boolean navigateUp(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            return false;
        }
        
        public final void openLoginScreen(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        public final void openRegistrationScreen(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        public final void openInfoScreen(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        public final void openInfoScreenAfterLogin(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
    }
}