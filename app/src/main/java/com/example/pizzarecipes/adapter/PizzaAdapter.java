package com.example.pizzarecipes.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;

import java.util.List;


public class PizzaAdapter extends BaseAdapter {
    private List<Produit> produits;
    private LayoutInflater inflater;

    public PizzaAdapter(List<Produit> produits, Activity activity) {
        this.produits = produits;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int position) {
        return produits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return produits.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView=inflater.inflate(R.layout.item,null);
        TextView name = convertView.findViewById(R.id.name);
        TextView nbrIngredients = convertView.findViewById(R.id.nbrIngredients);
        TextView duree = convertView.findViewById(R.id.duree);
        ImageView image = convertView.findViewById(R.id.image);

        name.setText(produits.get(position).getNom());
        nbrIngredients.setText(produits.get(position).getNbrIngredients()+"");
        duree.setText((int)produits.get(position).getDuree()+" min");
        image.setImageResource(produits.get(position).getPhoto());



        return convertView;
    }
}
