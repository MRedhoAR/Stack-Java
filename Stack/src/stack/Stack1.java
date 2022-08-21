package stack;

public class Stack1 {
    int stack[];
    int indek;
    //Memesan Panjang Stack
    //=============================
    public Stack1(int a)
    {
        stack = new int[a];
    }
    //=============================
    
    //Menghitung Panjang Stack
    //=============================
    public void Count()
    {
        int hasil = stack.length;
        System.out.println(" Jumlah Stak \t: "+hasil);
    }
    //=============================
    
    //Mengisi Nilai dalam Stack
    //==================================
    public void push(int isi)
    {
        stack[indek] = isi;
        indek++;
    }
    //==================================
    
    //Untuk Melihat Elemen Paling Atas
    //======================================
    public void Peek()
    {
        int hasil = 0;
        hasil+=stack.length-1;
        System.out.println(" Stack Teratas Adalah\t: "+stack[hasil]);
    }
    //======================================
    
    public void Print()
    {
        for(int i = stack.length-1 ;i>=0 ; i--)
        {
            System.out.println(" "+stack[i]);
        }
    }
    public void pop(int angka)
    {
        for(int i = 0; i<stack.length ; i++)
        {
            if(stack[i]==angka)
            {
                stack[i]=0;
            }
        }
    }
}
