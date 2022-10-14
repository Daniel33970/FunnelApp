package com.example.funnel4.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.funnel4.R;
import com.example.funnel4.databinding.FragmentGalleryBinding;
import com.example.funnel4.databinding.FragmentHomeBinding;
import com.example.funnel4.ui.gallery.GalleryViewModel;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
  //     HomeViewModel homeViewModel =
  //             new ViewModelProvider(this).get(HomeViewModel.class);

  //     binding = FragmentHomeBinding.inflate(inflater, container, false);
  //     View root = binding.getRoot();

  //     //final TextView textView = binding.textGallery;
  //     //galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
  //     return root;


        return inflater.inflate(R.layout.fragment_home, container, false);
    }


}