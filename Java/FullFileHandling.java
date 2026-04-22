import java.io.*;

public class FullFileHandling {

    public static void main(String[] args) {

        // FILE PATH
        String fileName = "example.txt";
        String copyFile = "copy.txt";
        
        // 1. FILE CREATION
    
        try {
            File file = new File(fileName);

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }

            System.out.println("File Path: " + file.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. WRITE USING OUTPUT STREAM
        
        FileOutputStream fos = null;

        try {
            // OPEN
            fos = new FileOutputStream(fileName);

            String data = "Hello! This is full Java File Handling example.";

            // WRITE
            fos.write(data.getBytes());

            System.out.println("Data written successfully");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // CLOSE
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

       
        // 3. READ USING INPUT STREAM
        
        FileInputStream fis = null;

        try {
            // OPEN
            fis = new FileInputStream(fileName);

            int ch;

            System.out.println("\nReading file content:");

            // READ
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // CLOSE
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 4. BYTE STREAM (BUFFER COPY)
      
        try (
            FileInputStream input = new FileInputStream(fileName);
            FileOutputStream output = new FileOutputStream(copyFile)
        ) {
            byte[] buffer = new byte[1024];
            int length;

            // READ + WRITE
            while ((length = input.read(buffer)) != -1) {
                output.write(buffer, 0, length);
            }

            System.out.println("\nFile copied using byte stream");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // 5. USING GENERIC STREAMS
        
        try (
            InputStream in = new FileInputStream(fileName);
            OutputStream out = new FileOutputStream("streamCopy.txt")
        ) {
            int data;

            // READ + WRITE
            while ((data = in.read()) != -1) {
                out.write(data);
            }

            System.out.println("File copied using InputStream & OutputStream");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}