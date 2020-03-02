package com.ardianeffendi.toptenuniversities.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ardianeffendi.toptenuniversities.R;
import com.ardianeffendi.toptenuniversities.Uni;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListUniAdapter extends RecyclerView.Adapter<ListUniAdapter.ListViewHolder> {
    private ArrayList<Uni> listUni;
    private OnImageListener mOnImageListener;

    public ListUniAdapter(ArrayList<Uni> listUni) {
        this.listUni = listUni;
    }

    public void setOnImageClickListener(OnImageListener listener) {
        mOnImageListener = listener;

    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_uni, parent, false);
        return new ListViewHolder(view, mOnImageListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Uni uni = listUni.get(position);
        Glide.with(holder.itemView.getContext())
                .load(uni.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(uni.getName());
        holder.tvDetail.setText(uni.getDetail());
    }

    @Override
    public int getItemCount() {
        return listUni.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView, final OnImageListener onImageListener) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.item_photo);
            tvName = itemView.findViewById(R.id.tv_uni_name);
            tvDetail = itemView.findViewById(R.id.tv_uni_detail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onImageListener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            onImageListener.OnImageClick(position);
                        }
                    }
                }
            });
        }

        //@Override
       // public void onClick(View v) {
        //    onImageListener.OnImageClick(getAdapterPosition());
        //}
    }

    public interface OnImageListener {
        void OnImageClick(int position);
    }

}
