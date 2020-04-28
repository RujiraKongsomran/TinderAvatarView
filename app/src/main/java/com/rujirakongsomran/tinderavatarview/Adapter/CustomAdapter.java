package com.rujirakongsomran.tinderavatarview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.athbk.avatarview.adapter.ItemVH;
import com.athbk.avatarview.adapter.TinderRVAdapter;
import com.rujirakongsomran.tinderavatarview.Interface.IFinishDrag;
import com.rujirakongsomran.tinderavatarview.Model.Item;
import com.rujirakongsomran.tinderavatarview.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


public class CustomAdapter extends TinderRVAdapter<Item, CustomAdapter.CustomViewHolder> {
    List<Item> lstData;
    Context context;

    IFinishDrag iFinishDrag;

    public void setiFinishDrag(IFinishDrag iFinishDrag) {
        this.iFinishDrag = iFinishDrag;
    }

    public CustomAdapter(List<Item> lstData, Context context) {
        this.lstData = lstData;
        this.context = context;
    }

    @Override
    protected List<Item> getListItem() {
        return lstData;
    }

    @Override
    protected CustomViewHolder onCreateItemViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_view, viewGroup, false);
        return new CustomViewHolder(itemView);
    }

    @Override
    protected void onBindItemViewHolder(CustomViewHolder vh, int i) {
        Picasso.get().load(lstData.get(i).getImgLink()).into(vh.ivPicture);
        vh.tvNumber.setTextColor(lstData.get(i).getIndex());
    }

    class CustomViewHolder extends ItemVH {

        FrameLayout frameLayout;
        ImageView ivPicture;
        TextView tvNumber;

        public CustomViewHolder(View itemView) {
            super(itemView);

            frameLayout = (FrameLayout) itemView.findViewById(R.id.frameLayout);
            ivPicture = (ImageView) itemView.findViewById(R.id.ivPicture);
            tvNumber = (TextView) itemView.findViewById(R.id.tvNumber);
        }

        @Override
        public void onItemSelected() {
            super.onItemSelected();
            frameLayout.setAlpha(0.5f);
        }

        @Override
        public void onItemClear() {
            super.onItemClear();
            frameLayout.setAlpha(1f);
            if (iFinishDrag != null) {
                iFinishDrag.updateListData((ArrayList<Item>) getListItem());
            }
        }
    }
}
