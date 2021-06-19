package com.gox.xuberservice.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/gox/xuberservice/adapters/XUberReasonAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/gox/xuberservice/adapters/XUberReasonAdapter$MyViewHolder;", "mListener", "Lcom/gox/xuberservice/interfaces/CustomClickListener;", "mReasonList", "", "Lcom/gox/xuberservice/model/ReasonModel$ResponseData;", "(Lcom/gox/xuberservice/interfaces/CustomClickListener;Ljava/util/List;)V", "getMListener", "()Lcom/gox/xuberservice/interfaces/CustomClickListener;", "setMListener", "(Lcom/gox/xuberservice/interfaces/CustomClickListener;)V", "getMReasonList", "()Ljava/util/List;", "setMReasonList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "xuberservice_debug"})
public final class XUberReasonAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.gox.xuberservice.adapters.XUberReasonAdapter.MyViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private com.gox.xuberservice.interfaces.CustomClickListener mListener;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.gox.xuberservice.model.ReasonModel.ResponseData> mReasonList;
    
    public XUberReasonAdapter(@org.jetbrains.annotations.NotNull()
    com.gox.xuberservice.interfaces.CustomClickListener mListener, @org.jetbrains.annotations.NotNull()
    java.util.List<com.gox.xuberservice.model.ReasonModel.ResponseData> mReasonList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gox.xuberservice.interfaces.CustomClickListener getMListener() {
        return null;
    }
    
    public final void setMListener(@org.jetbrains.annotations.NotNull()
    com.gox.xuberservice.interfaces.CustomClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.gox.xuberservice.model.ReasonModel.ResponseData> getMReasonList() {
        return null;
    }
    
    public final void setMReasonList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.gox.xuberservice.model.ReasonModel.ResponseData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.gox.xuberservice.adapters.XUberReasonAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.gox.xuberservice.adapters.XUberReasonAdapter.MyViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/gox/xuberservice/adapters/XUberReasonAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Lcom/gox/xuberservice/databinding/ItemXuberReasonBinding;", "(Lcom/gox/xuberservice/adapters/XUberReasonAdapter;Lcom/gox/xuberservice/databinding/ItemXuberReasonBinding;)V", "mBinding", "getMBinding", "()Lcom/gox/xuberservice/databinding/ItemXuberReasonBinding;", "xuberservice_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.gox.xuberservice.databinding.ItemXuberReasonBinding mBinding = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.gox.xuberservice.databinding.ItemXuberReasonBinding itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.gox.xuberservice.databinding.ItemXuberReasonBinding getMBinding() {
            return null;
        }
    }
}