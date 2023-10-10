//
//  ContentView.swift
//  Business Card
//
//  Created by Jaehwa Noh on 10/10/23.
//

import SwiftUI

struct ContentView: View {
    var body: some View {
        VStack {
            Spacer()
            Spacer()
            NamePartView()
            Spacer()
            InformationPartView()
            Spacer()
        }
    }
}

struct NamePartView: View {
    var body: some View {
        VStack {
            Image(systemName: "hand.thumbsup.fill")
                .resizable()
                .frame(width: 45, height: 45)
                .foregroundStyle(.green)
            Text("노재화 (Jaehwa Noh)")
                .font(.system(size: 28))
                .fontWeight(.bold)
                .padding(.bottom, 8)
            Text("세계 최고 모바일 앱 개발자\n(The World best Mobile Application developer)")
                .multilineTextAlignment(.center)
        }
    }
}

struct InformationPartView: View {
    var body: some View {
        VStack(alignment: .leading) {
            HStack {
                Image(systemName: "phone.fill")
                    .padding(.trailing, 16)
                    .foregroundStyle(.blue)
                Text("+82 10 0000 0000")
            }
            .padding(4)
            HStack {
                Image(systemName: "square.and.arrow.up.fill")
                    .padding(.trailing, 16)
                    .foregroundStyle(.blue)
                Text("https://www.linkedin.com/in/jaehwa-noh/")
            }
            .padding(4)
            HStack {
                Image(systemName: "envelope.fill")
                    .padding(.trailing, 16)
                    .foregroundStyle(.blue)
                Text("shwoghk14@gmail.com")
            }
            .padding(4)
        }
    }
}
#Preview {
    InformationPartView()
}

#Preview {
    NamePartView()
}

#Preview {
    ContentView()
}
