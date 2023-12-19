package com.example.power_rangers.ui.heatmap
import android.os.Bundle
import android.preference.PreferenceManager
import androidx.appcompat.app.AppCompatActivity
import com.example.power_rangers.R
import org.osmdroid.config.Configuration
import org.osmdroid.views.MapView

class map : AppCompatActivity() {

    private lateinit var mapView: MapView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.map)
        // Initialize osmdroid
        Configuration.getInstance().load(applicationContext, PreferenceManager.getDefaultSharedPreferences(applicationContext))

        // Initialize MapView
        mapView = findViewById(R.id.mapView)
        mapView.setTileSource(org.osmdroid.tileprovider.tilesource.TileSourceFactory.MAPNIK)

        // Enable zoom controls
        mapView.setBuiltInZoomControls(true)
        mapView.setMultiTouchControls(true)
    }
}