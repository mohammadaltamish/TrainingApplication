package com.training.al.trainingapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class BlankFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("onCreate","Fragment onCreate");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("onCreateView","Fragment onCreateView");
        return inflater.inflate(R.layout.fragment_blank, container, false);

    }

   /* @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("onActivityCreated","Fragment onActivityCreated");
    }*/

    @Override
    public void onStart() {
        super.onStart();
        Log.d("onStart","Fragment onStart");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("onResume","Fragment onResume");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("onAttach","Fragment onAttach");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("onDetach","Fragment onDetach");
    }


}
