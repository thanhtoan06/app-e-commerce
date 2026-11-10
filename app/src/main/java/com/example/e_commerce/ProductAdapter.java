package com.example.e_commerce;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ProductAdapter extends ArrayAdapter<Product> {

    private final LayoutInflater inflater;

    public ProductAdapter(@NonNull Context context, @NonNull Product[] products) {
        super(context, 0, products);
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_product, parent, false);
            holder = new ViewHolder();
            holder.tvIcon = convertView.findViewById(R.id.tvIcon);
            holder.flIconContainer = convertView.findViewById(R.id.flIconContainer);
            holder.tvCategory = convertView.findViewById(R.id.tvCategory);
            holder.tvName = convertView.findViewById(R.id.tvName);
            holder.tvPrice = convertView.findViewById(R.id.tvPrice);
            holder.tvDescription = convertView.findViewById(R.id.tvDescription);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Product product = getItem(position);
        if (product != null) {
            holder.tvIcon.setText(product.getIcon());

            GradientDrawable drawable = new GradientDrawable();
            drawable.setShape(GradientDrawable.RECTANGLE);
            drawable.setCornerRadius(24f);
            drawable.setColor(product.getColor());
            holder.flIconContainer.setBackground(drawable);

            holder.tvCategory.setText(product.getCategory());
            holder.tvName.setText(product.getName());
            holder.tvPrice.setText(product.getFormattedPrice());
            holder.tvDescription.setText(product.getDescription());
        }

        return convertView;
    }

    private static class ViewHolder {
        TextView tvIcon;
        View flIconContainer;
        TextView tvCategory;
        TextView tvName;
        TextView tvPrice;
        TextView tvDescription;
    }
}
