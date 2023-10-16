package com.example.pspot;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.CameraUpdate;


public class MapFragment extends Fragment implements OnMapReadyCallback {

    private GoogleMap googleMap;
    private GLE_Parking_Map homeActivity;
    private double lat;
    private double lng;

    // Constructor to receive the coordinates
    public static MapFragment newInstance(double lat, double lng) {
        MapFragment fragment = new MapFragment();
        Bundle args = new Bundle();
        args.putDouble("lat", lat);
        args.putDouble("lng", lng);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_map, container, false);

        if (getArguments() != null) {
            lat = getArguments().getDouble("lat");
            lng = getArguments().getDouble("lng");
        }

        SupportMapFragment supportMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.MY_MAP);
        supportMapFragment.getMapAsync(this);
        return view;
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        this.googleMap = googleMap;
        LatLng cebuCityLatLng = new LatLng(10.295107, 123.880865);
        float zoomLevel = 17f;
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cebuCityLatLng, zoomLevel));

        // Add a marker at the specified location
        LatLng pinLocation = new LatLng(lat, lng);
        MarkerOptions markerOptions = new MarkerOptions().position(pinLocation).title("Pin Location");
        googleMap.addMarker(markerOptions);
    }

    public void setHomeActivity(GLE_Parking_Map homeActivity) {
        this.homeActivity = homeActivity;
    }
}