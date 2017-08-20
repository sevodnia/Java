package com.example.umbra.allApps.base;


import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

public abstract class BaseItemViewHolder
        <Model,
                ViewModel extends BaseItemViewModel<Model>,
                DataBinding extends ViewDataBinding>

        extends RecyclerView.ViewHolder {

    private DataBinding dataBinding;
    private ViewModel viewModel;

    public BaseItemViewHolder(DataBinding dataBinding, ViewModel viewModel) {
        super(dataBinding.getRoot());
        this.dataBinding = dataBinding;
        this.viewModel = viewModel;
        viewModel.init();
    }

    public void bindTo(Model item, int position) {
        viewModel.setItem(item, position);
        dataBinding.executePendingBindings();
    }
}