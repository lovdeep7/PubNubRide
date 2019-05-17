package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pubnub.ride.R;

import java.util.ArrayList;

import model.RidehistoryModel;


public class RidehistoryAdapter extends RecyclerView.Adapter<RidehistoryAdapter.ViewHolder> {
    Context context;
    private ArrayList<RidehistoryModel> ridehistoryModelArrayList;

    public RidehistoryAdapter(Context context, ArrayList<RidehistoryModel> ridehistoryModelArrayList) {
        this.context = context;
        this.ridehistoryModelArrayList = ridehistoryModelArrayList;
    }

    @NonNull
    @Override
    public RidehistoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ride_history,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RidehistoryAdapter.ViewHolder holder, int position) {
        holder.i1.setImageResource(ridehistoryModelArrayList.get(position).getI1());
        holder.i2.setImageResource(ridehistoryModelArrayList.get(position).getI2());
        holder.i3.setImageResource(ridehistoryModelArrayList.get(position).getI3());
        holder.txtmall.setText(ridehistoryModelArrayList.get(position).getTxtmall());
        holder.txthome.setText(ridehistoryModelArrayList.get(position).getTxthome());
        holder.txtdate.setText(ridehistoryModelArrayList.get(position).getTxtdate());
        holder.txtprice.setText(ridehistoryModelArrayList.get(position).getTxtprice());



    }

    @Override
    public int getItemCount() {
        return ridehistoryModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView i1,i2,i3;
        TextView txtmall,txthome,txtdate,txtprice;

        public ViewHolder(View itemView) {
            super(itemView);

            i1=itemView.findViewById(R.id.i1);
            i2=itemView.findViewById(R.id.i2);
            i3=itemView.findViewById(R.id.i3);
            txtmall=itemView.findViewById(R.id.txtmall);
            txthome=itemView.findViewById(R.id.txthome);
            txtdate=itemView.findViewById(R.id.txtdate);
            txtprice=itemView.findViewById(R.id.txtprice);





        }
    }
}
