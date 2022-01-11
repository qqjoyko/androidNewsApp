// Generated by view binder compiler. Do not edit!
package com.laioffer.tinnews.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.laioffer.tinnews.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView appHeader;

  @NonNull
  public final View delimiter;

  @NonNull
  public final BottomNavigationView navBottomView;

  @NonNull
  public final FragmentContainerView navHostFragment;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull TextView appHeader,
      @NonNull View delimiter, @NonNull BottomNavigationView navBottomView,
      @NonNull FragmentContainerView navHostFragment) {
    this.rootView = rootView;
    this.appHeader = appHeader;
    this.delimiter = delimiter;
    this.navBottomView = navBottomView;
    this.navHostFragment = navHostFragment;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.app_header;
      TextView appHeader = ViewBindings.findChildViewById(rootView, id);
      if (appHeader == null) {
        break missingId;
      }

      id = R.id.delimiter;
      View delimiter = ViewBindings.findChildViewById(rootView, id);
      if (delimiter == null) {
        break missingId;
      }

      id = R.id.nav_bottom_view;
      BottomNavigationView navBottomView = ViewBindings.findChildViewById(rootView, id);
      if (navBottomView == null) {
        break missingId;
      }

      id = R.id.nav_host_fragment;
      FragmentContainerView navHostFragment = ViewBindings.findChildViewById(rootView, id);
      if (navHostFragment == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, appHeader, delimiter, navBottomView,
          navHostFragment);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}