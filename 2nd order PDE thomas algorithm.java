public class main {
static void thomas(double h,double x1,double x2,double y1,double
y2)
{
int i; double j;
int n=(int) Math.round((x2-x1)/h);
double[] a=new double[n];
double[] b=new double[n];
double[] c=new double[n];
double[] d=new double[n];
double[] C=new double[n];
double[] D=new double[n];
for(i=1;i<n;i++)
{ a
[i]=1/(h*h)-1/((x1+i*h)*h);
b[i]=-2/(h*h)+0;
c[i]=1/(h*h)+1/((x1+i*h)*h);
if(i==1)
d[i] = 1/((x1+i*h)*(x1+i*h)) - a[1]*y1;
else if(i==n-1)
d[i] = 1/((x1+(i-1)*h)*(x1+(i-1)*h))*(1-y2);
else
d[i] = 1/((x1+i*h)*(x1+i*h));
}C[1]=c[1]/b[1];
D[1]=d[1]/b[1];
for(i=2;i<n;i++)
{
C[i]=c[i]/(b[i]-a[i]*C[i-1]);
D[i]=(d[i]-a[i]*D[i-1])/(b[i]-a[i]*C[i]-1);
}
double[] y=new double[n+1];
y[n]=y2;
for(i=n-1;i>1;i--)
y[i]=D[i]-C[i]*y[i+1];
System.out.println("\nFor h="+h);
for(i=0;i<=n;i++){
j=x1+i*h;
System.out.println("Y["+j+"] : "+y[i]+" ");
}
System.out.println("\n\n");
}

public static void main(String args[]){
System.out.println("Equation is: (x^2)*y\" + x*y' = 1 ");
int i;
double x1 =1,x2=1.4,h;
double y1 =0,y2=.0566;
thomas( .1,x1,x2,y1,y2);
thomas(.05, x1,x2,y1,y2);
thoma