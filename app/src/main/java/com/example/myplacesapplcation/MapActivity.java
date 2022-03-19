package com.example.myplacesapplcation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Objects;

public class MapActivity extends AppCompatActivity {
    GoogleMap googleMap;
    MapView mapView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        findViewById(R.id.fabShowAddLocationDialog).setOnClickListener(fabShowAddLocationDialog_onClick);
        registerForContextMenu(findViewById(R.id.fabShowAddLocationDialog));

        mapView = findViewById(R.id.placesMapView);

    }

    private View.OnClickListener fabShowAddLocationDialog_onClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(MapActivity.this, "Show Add new place dialog ", Toast.LENGTH_SHORT).show();
        }
    };


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        //if (v.getId() == R.id.placesMapView || v.getId() == R.id.placesRecyclerView || v.getId() == R.id.fabShowAddLocationDialog) {
        getMenuInflater().inflate(R.menu.map_context_menu, menu);
        menu.setHeaderTitle("Map Context Menu");
        // }
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuPlacesMapView:
                findViewById(R.id.placesMapView).setVisibility(View.VISIBLE);
                findViewById(R.id.placesRecyclerView).setVisibility(View.GONE);
                break;
            case R.id.menuPlacesListView:
                findViewById(R.id.placesMapView).setVisibility(View.GONE);
                findViewById(R.id.placesRecyclerView).setVisibility(View.VISIBLE);
                break;
            case R.id.menuPlacesAddNew:
                Toast.makeText(this, "Show Add new place dialog ", Toast.LENGTH_SHORT).show();
                break;
            default:
                return false;
        }
        return true;
        //return super.onContextItemSelected(item);
    }


}
