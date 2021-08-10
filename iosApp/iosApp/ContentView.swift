import SwiftUI
import shared

struct ContentView: View {
	let greet = Greeting().greeting()
    @ObservedObject var viewModel: MainViewModel = MainViewModel()
    
	var body: some View {
        VStack {
            if !viewModel.tiles.isEmpty {
            Text(viewModel.tiles[0].body)
            }
        Text(greet)
        Text(greet)
        Text(greet)
        }
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
