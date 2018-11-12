package org.baeldung.grpc;

import java.io.IOException;

public class StartServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        HelloServer server = new HelloServer();
        server.start();
        server.blockUntilShutdown();
    }
}
