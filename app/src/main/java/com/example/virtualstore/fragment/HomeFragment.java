package com.example.virtualstore.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.virtualstore.R;
import com.example.virtualstore.adapter.caltegoryAdapter;
import com.example.virtualstore.adapter.caltegotyDATA;
import com.example.virtualstore.adapter.popularAdapter;
import com.example.virtualstore.adapter.popularData;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private RecyclerView recyclerViewCal, recyclerViewpop;

    private ArrayList<caltegotyDATA> arrayList;

    private ArrayList<popularData> arraylist;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerViewCal = view.findViewById(R.id.recyclerView_caltegories);
        recyclerViewpop = view.findViewById(R.id.recyclerView_poplular);
        recyclerViewCaltegory();
        recyclerViewPopular();

    }

    private void recyclerViewPopular() {
        arraylist = new ArrayList<>();
        arraylist.add(new popularData("iPhone 13 Pro Max", R.drawable.iphone_13_pro, "iPhone 13 Pro Max do not include a power adapter or EarPods. Included in the box is a USB‑C to Lightning cable that supports fast charging and is compatible with USB‑C power adapters and computer ports.", 1099.00));
        arraylist.add(new popularData("iPhone 13 Pro Max", R.drawable.iphone_13_pro, "iPhone 13 Pro Max do not include a power adapter or EarPods. Included in the box is a USB‑C to Lightning cable that supports fast charging and is compatible with USB‑C power adapters and computer ports.", 1099.00));
        arraylist.add(new popularData("iPhone 13 Pro Max", R.drawable.iphone_13_pro, "iPhone 13 Pro Max do not include a power adapter or EarPods. Included in the box is a USB‑C to Lightning cable that supports fast charging and is compatible with USB‑C power adapters and computer ports.", 1099.00));
        arraylist.add(new popularData("iPhone 13 Pro Max", R.drawable.iphone_13_pro, "iPhone 13 Pro Max do not include a power adapter or EarPods. Included in the box is a USB‑C to Lightning cable that supports fast charging and is compatible with USB‑C power adapters and computer ports.", 1099.00));


        popularAdapter popularAdapter = new popularAdapter(arraylist);
        recyclerViewpop.setAdapter(popularAdapter);
        recyclerViewpop.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));

    }

    private void recyclerViewCaltegory() {
        arrayList = new ArrayList<>();


        arrayList.add(new caltegotyDATA("Smart Phone", R.drawable.smart_phone));
        arrayList.add(new caltegotyDATA("Smart Phone", R.drawable.smart_phone));
        arrayList.add(new caltegotyDATA("Smart Phone", R.drawable.smart_phone));
        arrayList.add(new caltegotyDATA("Smart Phone", R.drawable.smart_phone));
        arrayList.add(new caltegotyDATA("Smart Phone", R.drawable.smart_phone));
        arrayList.add(new caltegotyDATA("Smart Phone", R.drawable.smart_phone));

        caltegoryAdapter caltegoryAdapter = new caltegoryAdapter(arrayList);
        recyclerViewCal.setAdapter(caltegoryAdapter);
        recyclerViewCal.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));

    }

}
