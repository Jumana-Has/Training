
//1 Byte = 8 Bits

//1 KB = 1024 Bytes

//1 MB = 1024 KB

//1 GB = 1024 MB

//1 TB = 1024 GB

//1 PB = 1024 TB

public class Hello {
    public static void main(String[] args) {

        long kb = 1024;
        long mb = 1024 * kb;
        long gb = 1024 * mb;
        long tb = 1024 * gb;
        long pb = 1024 * tb;

        System.out.println("1 KB = " + kb + " Bytes");
        System.out.println("1 MB = " + mb + " Bytes");
        System.out.println("1 GB = " + gb + " Bytes");
        System.out.println("1 TB = " + tb + " Bytes");
        System.out.println("1 PB = " + pb + " Bytes");
    
    }
}