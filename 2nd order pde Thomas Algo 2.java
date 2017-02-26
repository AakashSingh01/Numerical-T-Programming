public class mainclass {
static void thomas(double h){
int i;
double x1 =0,x2=1.0;
double j;
int n=(int) Math.round((x2-x1)/h);
double[] a=new double[n+1];
double[] b=new double[n+1];
double[] c=new double[n+1];
double[] d=new double[n+1];
double[] C=new double[n+1];
double[] D=new double[n+1];
double gm1=1.0;
double ap1=-1.0;
double bt1=0.0;
double gm2=2.0;
double ap2=-1.0;
double bt2=1.0;
for(i=0;i<=n;i++)
{
if(i==0)
{a[i] = 1/(h*h) - (h*i+x1)/h;
b[i] = -2/(h*h) -2 + 2* a[0]* h*gm1/ap1;
c[i] = a[0] + 1/(h*h) - 2*(h*i+x1)/(2*h);
d[i] = -4*(h*i+x1) + 2 * a[0]*h*bt1/ap1;
}
else if(i==n)
{ a
[i] = 1/(h*h) + (h*i+x1)/h + 1/(h*h) - (h*i+x1)/h;
c[i] = 1/(h*h) - 2*(h*i+x1)/(2*h);
b[i] = -2/(h*h) -2 - 2*h*gm2*c[n]/ap2;
d[i] = -4*(h*i+x1) - 2*h*bt2*c[n]/ap2;
}
else
{ a
[i] = 1/(h*h) + (h*i+x1)/h;
b[i] = -2/(h*h) -2;
c[i] = 1/(h*h) - (h*i+x1)/h;
d[i] =-4*(h*i+x1);
} }
for(i=0;i<=n;i++)
{
if(i==0)
{ C
[i] = c[0]/b[0];
D[i] = d[0]/b[0];
}
else
{ C
[i] = c[i]/(b[i] - (a[i]*C[i-1]));
D[i] = (d[i] - (a[i]*D[i-1]))/(b[i] - (a[i]*C[i-1]));
} }
double[] y=new double[n+1];
for(i=n;i>=0;i--){
if(i==n)
y[i] = D[n];
else
y[i] = D[i] - (C[i]*y[i+1]);
}
System.out.println("\nSolutions for h= "+h+" :");
for(i=0;i<=n;i++)
{
System.out.println("y["+x1+"] = "+y[i]+"" );
x1+=h;
}
System.out.println( );
}
public static void main(String args[]){
System.out.println("Equation is: y\" - 2xy’ - 2y = -4x ");
thomas(.1);
thomas(.05);
thomas(.01);
} }