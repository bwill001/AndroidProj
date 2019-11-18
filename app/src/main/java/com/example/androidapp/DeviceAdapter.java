package com.example.androidapp;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DeviceAdapter extends RecyclerView.Adapter<DeviceAdapter.DeviceViewHolder> {
    Context mContext;
    Cursor mCursor;

    public DeviceAdapter(Context context, Cursor cursor){
        mContext = context;
        mCursor = cursor;
    }

    public class DeviceViewHolder extends RecyclerView.ViewHolder{

        public TextView nameText;
        public TextView countText;

        public DeviceViewHolder(@NonNull View itemView) {
            super(itemView);
            nameText = itemView.findViewById(R.id.thermoName);
            countText = itemView.findViewById(R.id.thermoId);
        }
    }

    @NonNull
    @Override
    public DeviceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.thermo_items, parent, false);
        return new DeviceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DeviceViewHolder holder, int position) {
        if(!mCursor.moveToPosition(position)){
            return;
        }

        String name = mCursor.getString(mCursor.getColumnIndex(DeviceDatabaseHelper.COL2));
        String amount = mCursor.getString(mCursor.getColumnIndex(DeviceDatabaseHelper.COL1));

        holder.nameText.setText(name);
        holder.countText.setText(amount);
    }

    @Override
    public int getItemCount() {
        return mCursor.getCount();
    }

    public void swapCursor(Cursor newCursor){
        if(mCursor != null){
            mCursor.close();
        }
        mCursor = newCursor;

        if(newCursor != null){
            notifyDataSetChanged();
        }
    }
}
