package com.example.popactivityandtimepicker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.viewmodel.CreationExtras;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;

public class pop_activity extends DialogFragment implements View.OnClickListener {
    View view;
    TimePicker timePicker;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        view = inflater.inflate(R.layout.activity_pop,container,false);
        Button btn =view.findViewById(R.id.btnClose);
        timePicker = view.findViewById(R.id.timePicker);
        btn.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v) {
      this.dismiss();
      String getTime = timePicker.getHour()  + ":"+timePicker.getMinute();
      MainActivity ma = (MainActivity) getActivity();
      ma.setData(getTime);
    }


}