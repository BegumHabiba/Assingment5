package com.example.countryvision;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {
    private String[] countryNames;
    private Integer[] flags;
    private Context context;

    public CountryAdapter(Context context, String[] countryNames, Integer[] flags) {
        this.context = context;
        this.countryNames = countryNames;
        this.flags = flags;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView countryName;
        ImageView countryFlag;

        public ViewHolder(View view) {
            super(view);
            countryName = view.findViewById(R.id.country_name);
            countryFlag = view.findViewById(R.id.country_flag);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.listcountry, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.countryName.setText(countryNames[position]);
        holder.countryFlag.setImageResource(flags[position]);
    }

    @Override
    public int getItemCount() {
        return countryNames.length;
    }
}