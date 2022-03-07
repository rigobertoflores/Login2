package com.example.login2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.NumerosViewHolder>{
    private int mNumerosItens;
   final private  ListItemClick listItemClick;
    public RecyclerAdapter(int mNumerosItens,ListItemClick listItemClick) {
        this.mNumerosItens = mNumerosItens;
        this.listItemClick=listItemClick;
    }

    public interface ListItemClick{
        void onListItemClick(int clickeditem);
    }

    @NonNull
    @Override
    public NumerosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        int layout=R.layout.lista_numeros_rows;
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        boolean AttachmentPrent=false;
        View view =layoutInflater.inflate(layout,parent,AttachmentPrent);
        NumerosViewHolder numerosViewHolder=new NumerosViewHolder(view);

        return numerosViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NumerosViewHolder holder, int position) {
           holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mNumerosItens;
    }

    class NumerosViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView lista_view;
        public NumerosViewHolder(@NonNull View itemView) {
            super(itemView);
            lista_view=itemView.findViewById(R.id.list_view);
            itemView.setOnClickListener(this);
        }
        void bind(int listIndex){
            lista_view.setText(String.valueOf(listIndex ));
        }

        @Override
        public void onClick(View view) {
            int item=getAbsoluteAdapterPosition();
            listItemClick.onListItemClick(item);
        }
    }


}
