package com.ridoy.autoimageslider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

public class testAdapter extends SliderViewAdapter<testAdapter.SliderAdapterVH> {

    Context context;
    List<SliderItem> itemList;

    public testAdapter(Context context, List<SliderItem> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.image_slider_layout_item, null);
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH holder, int position) {
        SliderItem item=itemList.get(position);
        Glide.with(context)
                .load(item.getImageUrl())
                .into(holder.imageViewBackground);
        holder.textViewDescription.setText(item.getDescription());
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    public class SliderAdapterVH extends SliderViewAdapter.ViewHolder {

        ImageView imageViewBackground;
        TextView textViewDescription;
        public SliderAdapterVH(View itemView) {
            super(itemView);
            imageViewBackground = itemView.findViewById(R.id.iv_auto_image_slider);
            textViewDescription = itemView.findViewById(R.id.tv_auto_image_slider);
        }
    }
}
