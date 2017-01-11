import java.util.Scanner;
/**
 * Created by ArthurArt on 30.10.2016.
 */
public class HomeWorkTask3 {//условия
    public static void task3_1A (){
        int a=3, b=2;
        System.out.format("a=%d b=%d %n", a,b);
        if (a>b) System.out.println(a);
        else System.out.println(b);
    }
    public static void task3_1E(){
        int a=2, b=3;
        System.out.format("a=%d b=%d %n", a,b);
        if(a==b) System.out.println(0);
        else if(a>b) System.out.println(1);
        else System.out.println(2);
    }
    public static void task3_1F(){
        int a=1, b=2, c=3,max;
        System.out.format("a=%d b=%d c=%d %n", a,b,c);
        if(a>b) max=a;
        else max=b;
        if(c>max) System.out.println(c);
        else System.out.println(max);
    }
    public static void task3_1D(){
        int x=1;
        System.out.format("a=%d %n", x);
        if(x==0) System.out.println("sign(x)=0");
        else if(x>0) System.out.println("sign(x)=1");
        else System.out.println("sign(x)=-1");
    }
    public static void task3_1U(){
        int a=2, b=1, c=1;
        System.out.format("a=%d b=%d c=%d %n", a,b,c);
        if((a==b)&&(b==c)) System.out.println(3);
        else if((a==b)||(b==c)||(a==c)) System.out.println(2);
        else System.out.println(0);
    }
    public static void task3_1G(){
        int a1=1, b1=1, a2=2, b2=1;
        System.out.format("a1=%d a2=%d b1=%d b2=%d %n", a1,b1,a2,b2);
        if(a1 == a2 || b1 == b2) System.out.println("YES");
        else System.out.println("NO");
    }
    public static void task3_1V(){
        double a=1, b=3, c=120, d;
        d=b*b-4*a*c;
        System.out.format("a=%f b=%f c=%f D=%f %n", a,b,c,d);
        if(d>0) System.out.format("x1=%f x2=%f", (-b-Math.sqrt(d))/(2*a), (-b+Math.sqrt(d))/(2*a));
        else if(d==0) System.out.format("x=%f", -b/(2*a));
    }
    public static void task3_1W(){
        int a=5,b=4,c=4,l,h,max,sr,min;
        System.out.format("%d %d %d %n", a,b,c);
        if(a>b) max=a;
        else max=b;
        if(c>max) max=c;
        if(a<b) min=a;
        else min=b;
        if(c<min) min=c;
        sr=a+b+c-max-min;
        l=min*min+sr*sr;
        h=max*max;
        if((a+b<=c)||(a+c<=b)||(b+c<=a))
            System.out.println("impossible");
        else
        if(l>h) System.out.println("acute");
        else if(l<h) System.out.println("obtuse");
        else if(l==h) System.out.println("rectangular");
    }
    public static void task3_1Y(Scanner sc){
        int n = sc.nextInt(), n10, n60;
        if (n>=60) n60=n/60;
        else n60=0;
        n -=n60*60;
        if((n>=35) && (n<60)) {
            n60++;
            n -=60;
        }
        if(n>9) n10=n/10;
        else n10=0;
        n -=n10*10;
        if(n==9) {
            n10++;
            n -=10;
        }
        if(n<1) n=0;
        System.out.format("%d %d %d",n,n10,n60);
    }
    public static void task3_1Z(Scanner sc){
        int n = sc.nextInt(), n10, n60, n5 , n20;
        if (n>=60) n60=n/60;
        else n60=0;
        n -=n60*60;
        if((n>=36) && (n<60)) {
            n60++;
            n -=60;
        }
        if(n>=20) n20=n/20;
        else n20=0;
        n -=n20*20;
        if((n>=18) && (n<20)) {
            n20++;
            n -=20;
        }
        if(n>9) n10=n/10;
        else n10=0;
        n -=n10*10;
        if(n==9) {
            n10++;
            n -=10;
        }
        if(n>=5) n5=n/5;
        else n5=0;
        n -=n5*5;
        if(n<1) n=0;
        System.out.format("%d %d %d %d %d",n,n5,n10,n20,n60);
    }

    //циклы
    public static void task321(Scanner sc)
    {
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n ; i++)
        {
            sum += i*i;
        }
        System.out.println(sum);
    }
    public static void task322(Scanner sc)
    {
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n ; i++)
        {
            sum += (i-1)*i;

        }
        System.out.println(sum);
    }
    public static void task323(Scanner sc)
    {
        int n = sc.nextInt();
        int sumMain = 0;
        int sumBuf=0;
        for (int i = 1; i <= n ; i++)
        {
            sumBuf +=i;
            sumMain +=sumBuf ;
        }
        System.out.println(sumMain);
    }
    public static void task324(Scanner sc)
    {

        int a = sc.nextInt();
        int b=sc.nextInt();
        a=(a%2)==0?a:(a+1);
        for (int i = a; i <= b ; i+=2)
        {
            System.out.println(i);
        }

    }
    public static void task325(Scanner sc)
    {

        int n = sc.nextInt();
        int pr = 1;

        for (int i = 1; i <=n ; i++)
        {
            pr*=i;
        }
        System.out.println(pr);
    }
    public static void task326(Scanner sc)
    {

        int n = sc.nextInt();
        int k= sc.nextInt();
        int pr1 = 1,pr2=1;
        for (int i = 1; i <=n-k; i++)
        {
            pr1 *= (k+i);
            pr2*= i;
        }
        int CNK = pr1/pr2;
        System.out.println(CNK);
    }
    public static void task327(Scanner sc){
        double a=sc.nextDouble(),n=sc.nextDouble(),abuf=1;
        if(n!=0)
            while(n!=0){
                if(n==1) n -=1;
                else if(n % 2 == 0) {a *=a; n /=2;}
                else {abuf *=a; n -=1;}
            }
        else a=1;
        System.out.println(a*abuf);
    }
    public static void task328(Scanner sc){
        double n = sc.nextDouble(),sum=1.0;
        for(int i=2; i<=n; i++) sum +=1.0/(i*i);
        System.out.println(sum);
    }
    public static void task329(Scanner sc){
        double n = sc.nextDouble(),sum=1.0;
        int sign = -1;
        for(int i = 1 ; i <= n ; i++) {
            sum += sign / ( 2.0 * i + 1 );
            sign = -sign;
        }
        System.out.println(4*sum);
    }
    public static void task3210(Scanner sc){
        double a=sc.nextDouble(), n = sc.nextDouble(),sum=1.0, an=1.0;
        for( int i = 1 ; i <= n ; i++)
        {
            an *= a;
            sum += an;
        }
        System.out.println("без прогрессии "+sum);
        sum=1.0; an=1.0; double q=a/1.0;
        for( int i = 1 ; i <= n ; i++)
        {
            an *=a;
            sum =(an*q-1)/(q-1);
        }
        System.out.println("c прогрессией "+sum);
    }
    public static void task3211(Scanner sc){
        int n=Integer.parseInt(sc.nextLine()),sum=0;
        for (int i = 0; i < n; i++) {
            sum +=Integer.parseInt(sc.nextLine());
        }
        System.out.println(sum);
    }
    public static void task3212(){
        int d,u;
        for (u = 6; u < 10; u++) {
            d =-u/(10-2*u);
            if(2*d*u==10*d+u) System.out.println(2*d*u);
        }
    }
    public static void task3213(){
        for (int i = 110; i <= 999; i++) {
            if(i==i*i%1000) System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //task3_1A();
        //task3_1E();
        //task3_1F();
        //task3_1D();
        //task3_1U();
        //task3_1G();
        //task3_1V();
        //task3_1W();
        //task3_1Y(sc);
        //task3_1Z(sc);
        // task321(sc);
        // task322(sc);
        //task323(sc);
        // task324(sc);
        //task325(sc);
        // task326(sc);
        //task327(sc);
        //task328(sc);
        //task329(sc);
        //task3210(sc);
        //task3211(sc);
        //task3212();
        task3213();
    }
}
