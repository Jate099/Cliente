package com.example.a1143878729.cliente;

import android.util.Log;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client extends Thread {

    @Override
    public void run() {
        try {
            Socket s = new Socket("10.0.2.2", 5000);
            Log.e("DEBUG", "conexion exitosa");

            OutputStream outP = s.getOutputStream();
            //escribe el mensaje
            PrintWriter out = new PrintWriter(new OutputStreamWriter(outP));
            out.println("que paso ommme!");
            out.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
