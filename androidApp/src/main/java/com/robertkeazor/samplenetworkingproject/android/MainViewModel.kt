package com.robertkeazor.samplenetworkingproject.android

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.robertkeazor.samplenetworkingproject.NetworkClient
import com.robertkeazor.samplenetworkingproject.NetworkModule
import com.robertkeazor.samplenetworkingproject.TileCard
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
 val _tileState: MutableStateFlow<List<TileCard>> = MutableStateFlow(mutableListOf())
    val tileState: StateFlow<List<TileCard>>
    get() = _tileState

    init {
        viewModelScope.launch(Dispatchers.IO) {
            _tileState.value = NetworkModule().tiles()
        }
    }
}