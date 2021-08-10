//
//  MainViewModel.swift
//  iosApp
//
//  Created by Robert Keazor on 8/10/21.
//  Copyright © 2021 orgName. All rights reserved.
//

import SwiftUI
import shared

class MainViewModel: ObservableObject {
    @Published var tiles : [TileCard] = [TileCard]()
    let networkModule: NetworkModule = NetworkModule()
    init() {
        networkModule.tiles() { tilesCards, error in
            self.tiles = tilesCards ?? [TileCard]()
        }
    }
}
