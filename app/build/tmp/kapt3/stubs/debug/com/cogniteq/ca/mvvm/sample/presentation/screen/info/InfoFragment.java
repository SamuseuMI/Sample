package com.cogniteq.ca.mvvm.sample.presentation.screen.info;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0007J\b\u0010\u0018\u001a\u00020\u0016H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00028VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0019"}, d2 = {"Lcom/cogniteq/ca/mvvm/sample/presentation/screen/info/InfoFragment;", "Lcom/cogniteq/ca/mvvm/sample/presentation/common/BaseFragment;", "Lcom/cogniteq/ca/mvvm/sample/presentation/screen/info/InfoViewModel;", "()V", "inputTextView", "Landroidx/appcompat/widget/AppCompatEditText;", "getInputTextView", "()Landroidx/appcompat/widget/AppCompatEditText;", "setInputTextView", "(Landroidx/appcompat/widget/AppCompatEditText;)V", "textInfoView", "Landroidx/appcompat/widget/AppCompatTextView;", "getTextInfoView", "()Landroidx/appcompat/widget/AppCompatTextView;", "setTextInfoView", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "viewModel", "getViewModel", "()Lcom/cogniteq/ca/mvvm/sample/presentation/screen/info/InfoViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "observeLastUpdateInfo", "", "onUpdateClick", "prepareViews", "app_debug"})
public final class InfoFragment extends com.cogniteq.ca.mvvm.sample.presentation.common.BaseFragment<com.cogniteq.ca.mvvm.sample.presentation.screen.info.InfoViewModel> {
    @butterknife.BindView(value = com.cogniteq.ca.mvvm.android.sample.R2.id.view_input_text)
    public androidx.appcompat.widget.AppCompatEditText inputTextView;
    @butterknife.BindView(value = com.cogniteq.ca.mvvm.android.sample.R2.id.view_text_info)
    public androidx.appcompat.widget.AppCompatTextView textInfoView;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public InfoFragment() {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.AppCompatEditText getInputTextView() {
        return null;
    }
    
    public final void setInputTextView(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.AppCompatTextView getTextInfoView() {
        return null;
    }
    
    public final void setTextInfoView(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatTextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.cogniteq.ca.mvvm.sample.presentation.screen.info.InfoViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void prepareViews() {
    }
    
    @butterknife.OnClick(value = {com.cogniteq.ca.mvvm.android.sample.R.id.btn_update_info})
    public final void onUpdateClick() {
    }
    
    private final void observeLastUpdateInfo() {
    }
}