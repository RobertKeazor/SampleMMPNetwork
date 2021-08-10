//
//  CardView.swift
//  iosApp
//
//  Created by Robert Keazor on 8/9/21.
//  Copyright © 2021 orgName. All rights reserved.
//

import SwiftUI

struct CardView: View {
    var body: some View {
        ZStack(alignment:.top) {
            
            VStack(alignment: .leading) {
                Text("Title")
                    .font(/*@START_MENU_TOKEN@*/.title/*@END_MENU_TOKEN@*/)
                    .alignmentGuide(.leading) { d in
                        d[.leading]
                    }
                Text("Body")
                    .font(.body)
            }
           
        }
    }
}

struct CardView_Previews: PreviewProvider {
    static var previews: some View {
        CardView()
    }
}
