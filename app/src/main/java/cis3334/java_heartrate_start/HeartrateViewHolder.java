package cis3334.java_heartrate_start;


import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class HeartrateViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewPulse;
    private TextView textViewRange;
    private TextView textViewDescription;

    public HeartrateViewHolder(View itemView) {
        super(itemView);

        textViewPulse = itemView.findViewById(R.id.textViewPulse);
        textViewRange = itemView.findViewById(R.id.textViewRange);
        textViewDescription = itemView.findViewById(R.id.textViewDescription);
    }

    public TextView getTextViewPulse() {
        return textViewPulse;
    }

    public TextView getTextViewRange() {
        return textViewRange;
    }

    public TextView getTextViewDescription() {
        return textViewDescription;
    }
}