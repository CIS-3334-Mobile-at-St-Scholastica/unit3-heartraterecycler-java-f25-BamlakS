package cis3334.java_heartrate_start;

import android.app.Application;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HeartrateAdapter extends RecyclerView.Adapter<HeartrateViewHolder> {

    private Application application;
    private MainViewModel mainViewModel;
    private List<Heartrate> heartrateList;

    public HeartrateAdapter(Application application, MainViewModel mainViewModel) {
        this.application = application;
        this.mainViewModel = mainViewModel;
    }

    @Override
    public HeartrateViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.heartrate_row, parent, false);
        return new HeartrateViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(HeartrateViewHolder holder, int position) {
        if (heartrateList != null) {
            Heartrate currentHeartrate = heartrateList.get(position);

            holder.getTextViewPulse().setText("Pulse: " + currentHeartrate.pulse);

            holder.getTextViewRange().setText("Range: " + currentHeartrate.getRangeName());

            holder.getTextViewDescription().setText(currentHeartrate.getRangeDescrtiption());
        }
    }

    @Override
    public int getItemCount() {
        if (heartrateList != null) {
            return heartrateList.size();
        }
        return 0;
    }

    public void setHeartrates(List<Heartrate> heartrates) {
        this.heartrateList = heartrates;
        notifyDataSetChanged();
    }
}
