package com.doschechko.matylionak.wcguide.citaty;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.doschechko.matylionak.wcguide.databinding.ItemQuoteBinding;


public class MyHolder extends RecyclerView.ViewHolder {

    public ItemQuoteBinding binding;

    public MyHolder(View itemView) {
        super(itemView);

        binding = DataBindingUtil.bind(itemView);


    }
}
