package controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

import datatypes.DtEmisora;
import datatypes.DtGrabable;
import datatypes.DtGrabados;
import model.Emisora;

public class Sound  implements Runnable{
	
	private static final String DIRECTORIO = (new File("")).getAbsolutePath() + "\\records\\";
	public DtGrabable grabable;
	
	public Sound(DtGrabable grabable) {
		this.grabable = grabable;
	}
	

	@Override
	public void run() {
		record(((DtEmisora)grabable).getUrl());
//		super.run();
	}
	

	public void record(String url) {
        try{
            URLConnection conn = new URL(url).openConnection();
            InputStream is = conn.getInputStream();
        	OutputStream outstream;
        	
        	new File(DIRECTORIO).mkdirs();
            outstream = new FileOutputStream(new File( DIRECTORIO + grabable.getNombre() +"_" + (LocalDateTime.now().getMonthValue()) +"-"+ (LocalDateTime.now().getDayOfMonth()) +"-"+ (LocalDateTime.now().getYear())+ "_" + (LocalDateTime.now().getHour()) +"-" + (LocalDateTime.now().getMinute()) + "."+ grabable.getTipo()));
            byte[] buffer = new byte[4096];
            int len;
//            long t = System.currentTimeMillis();
            while ((len = is.read(buffer)) > 0) {
                outstream.write(buffer, 0, len);
                if (Thread.currentThread().isInterrupted()) {
                	System.out.println("cancelando...." + grabable.getNombre());
                	
                	outstream.close();
//                	Thread.currentThread().stop();
                	return;
                }
                	
            }
            outstream.close();
        }
        catch(Exception e){
            System.out.print(e);
        }		
	}
	

	
	
}
