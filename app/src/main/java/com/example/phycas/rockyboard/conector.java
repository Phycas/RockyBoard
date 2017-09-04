package com.example.phycas.rockyboard;
import java.io.*;
import java.net.*;
/**
 * Created by Phycas on 03-09-2017.
 */

public class conector {
    private String serverip;
    private int serverport;

    public conector(String ip, int port){
        this.serverip = ip;
        this.serverport = port;

    }

    public void testConsole() throws Exception{

        Socket sock = new Socket(serverip, serverport);
        PrintStream PS = new PrintStream(sock.getOutputStream());
        PS.println("It works from android");

        InputStreamReader IR = new InputStreamReader(sock.getInputStream());
        BufferedReader BR = new BufferedReader(IR);

        String msj = BR.readLine();
    }

}
