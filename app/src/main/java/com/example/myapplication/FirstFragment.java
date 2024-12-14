package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle arguments = getArguments();
        if (arguments != null) {
            String name = arguments.getString("Name", "No Name");
            String age = arguments.getString("Age", "No Age");
            String email = arguments.getString("Email", "No Email");

            TextView nameView = view.findViewById(R.id.name);
            TextView ageView = view.findViewById(R.id.Age);
            TextView emailView = view.findViewById(R.id.Email);

            nameView.setText(String.format("Name: %s", name));
            ageView.setText(String.format("Age: %s", age));
            emailView.setText(String.format("Email: %s", email));
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
