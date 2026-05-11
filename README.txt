Project: Multi-Client Chat Room

Compile:
javac Project/*.java

Run Server:
java Project.ChatServer

Run Client:
java Project.ChatClient

Description:
This application supports multiple clients using TCP sockets.
Each client runs on its own thread. Shared state is managed
using a thread-safe collection. The server handles unexpected
disconnects and invalid input gracefully.
