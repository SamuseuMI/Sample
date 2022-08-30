package com.cogniteq.ca.mvvm.sample.presentation.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0014J\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/presentation/common/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "layoutId", "", "(I)V", "getLayoutId", "()I", "attachViewModel", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showToast", "message", "", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private final int layoutId = 0;
    private java.util.HashMap _$_findViewCache;
    
    public BaseActivity(@androidx.annotation.LayoutRes()
    int layoutId) {
        super();
    }
    
    protected final int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    protected void attachViewModel() {
    }
}