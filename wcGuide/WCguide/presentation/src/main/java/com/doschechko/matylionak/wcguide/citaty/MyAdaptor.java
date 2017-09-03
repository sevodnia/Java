package com.doschechko.matylionak.wcguide.citaty;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.doschechko.matylionak.domain.entity.Quote;
import com.doschechko.matylionak.wcguide.databinding.ItemQuoteBinding;

import java.util.ArrayList;


public class MyAdaptor extends RecyclerView.Adapter<MyHolder> {
    ArrayList<Quote> list = new ArrayList<>();

    public void setList(ArrayList<Quote> arrayList) {
        list.clear();
        list.addAll(arrayList);
        notifyDataSetChanged();
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        ItemQuoteBinding binding = ItemQuoteBinding.inflate(inflater, parent, false);
        return new MyHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        Item_QuoteViewModel model = new Item_QuoteViewModel();
        model.setAuthor(list.get(position).getAuthor());
        model.setBody(list.get(position).getBody());
        holder.binding.setViewModel(model);
    }



    @Override
    public int getItemCount() {
        return list.size();
    }
}
