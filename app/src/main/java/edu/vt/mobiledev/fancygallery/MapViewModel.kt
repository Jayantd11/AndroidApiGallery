package edu.vt.mobiledev.fancygallery

import androidx.lifecycle.ViewModel
import org.osmdroid.api.IGeoPoint
import org.osmdroid.util.GeoPoint

class MapViewModel: ViewModel() {
    var zoomLevel: Double = 1.5
        private set

    var mapCenter: IGeoPoint = GeoPoint(0.0, 0.0)
        private set

    fun saveMapState(zoom: Double, center: IGeoPoint) {
        zoomLevel = zoom
        mapCenter = center
    }
}