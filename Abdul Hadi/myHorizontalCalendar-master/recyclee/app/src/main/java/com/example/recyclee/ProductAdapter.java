package com.example.recyclee;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//public class ProductAdapter {
/*
Recyclerview.Adapter
Recyclerview.ViewHolder
 */
public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {


    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<product> productList;

    //getting the context and product list with constructor
    public ProductAdapter(Context mCtx, List<product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout,null);
        ProductViewHolder holder=new ProductViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        product product=productList.get(position);
        holder.textViewtitle.setText(product.getTitle());
        holder.textViewdesc.setText(product.getShort_desc());
        holder.textViewrating.setText(String.valueOf(product.getRating()));
        holder.textViewprice.setText(String.valueOf(product.getPrice()));
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends  RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textViewtitle, textViewdesc, textViewrating, textViewprice;

            public ProductViewHolder(@NonNull View itemView) {
                super(itemView);
                imageView =itemView.findViewById(R.id.imageView);
                textViewtitle=itemView.findViewById(R.id.textViewTitle);
                textViewdesc=imageView.findViewById(R.id.textViewShortDesc);
                textViewprice=imageView.findViewById(R.id.textViewPrice);
                textViewrating=imageView.findViewById(R.id.textViewRating);

            }
        }

}


