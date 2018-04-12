package com.example.stud.recycle_view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by W57003 on 2018-04-12.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {

    @Override
    public ListViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout. item_view , parent, false );


        return new ListViewHolder(view) ;
    }
    @Override
    public void onBindViewHolder( ListViewHolder holder, int position) {
    }
    @Override
    public int getItemCount() {
        return 0 ;
    }
    public class ListViewHolder extends RecyclerView.ViewHolder {

        TextView tvNazwa ;
        TextView tvRodzaj ;
        TextView tvKsiezyce ;

        public ListViewHolder(View itemView) {
            super (itemView);

            tvNazwa = itemView.findViewById(R.id. tvNazwa );
            tvRodzaj = itemView.findViewById(R.id. tvRodzaj );
            tvKsiezyce = itemView.findViewById(R.id. tvKsiezyce );

        }
    }
}