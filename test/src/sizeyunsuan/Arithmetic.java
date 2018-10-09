package sizeyunsuan;
import java.util.Random;
import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args){
        int number,answer,mol,z;//题目数量，答案，分子,用户输入的整数答案，
        int a,b,c,m,n;//a,b为分子，c为运算符，m,n为分母
        int h = 0;//答对题数
        System.out.printf("请输入需要生成的题目数量：");
        Scanner d = new Scanner(System.in);
        number = d.nextInt();//题目数量
        for(int i = 0 ; i < number ; i++){
            Random a1 = new Random();//生成随机数
            Random b1 = new Random();
            Random c1 = new Random();
            Random m1 = new Random();
            Random n1 = new Random();
            a = a1.nextInt(100);//随机数范围0-100
            b = b1.nextInt(100);
            c = c1.nextInt(4);//0为+，1为-，2为*，3为/
            m = m1.nextInt(100);
            n = n1.nextInt(100);
            if(c==0){//0为+
                if(m==0&&n==0){
                    m = m1.nextInt(100)+1;//分母不能为0
                    n = n1.nextInt(100)+1;
                    if(a%m==0&&b%n==0){//整数
                        answer = a + b;
                        System.out.printf(a+"+"+b+"= ");
                        Scanner user = new Scanner(System.in);//获取输入的答案
                        z = user.nextInt();
                        if(z==answer){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+answer);
                        }
                    }else if(a%m==0&&b%n!=0){//分数处理
                        String x = b + "/" + n;//存分数
                        mol = a*n + b ;//计算分子
                        System.out.printf(a+"+"+x+"= ");
                        String y =  mol + "/"+ n;//存分数计算结果
                        Scanner user = new Scanner(System.in);
                        String score = user.next();//用户输入的分数答案
                        if(score.equals(y)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+y);
                        }
                    }else if(a%m!=0&&b%n==0){
                        String x = a + "/" + m;
                        mol = a + b*m;
                        System.out.printf(x+"+"+b+"= ");
                        String y =  mol + "/"+ m;
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(y)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+y);
                        }
                    }else{
                        String x1 = a + "/" + m;
                        String x2 = b + "/" + n;
                        mol = a*n + b*m;
                        System.out.printf(x1+"+"+x2+"= ");
                        String y =  mol + "/"+ n*m;
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(y)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+y);
                        }
                    }
                }else if(m==0&&n!=0){
                    m = m1.nextInt(100)+1;
                    if(a%m==0&&b%n==0){
                        answer = a + b;
                        System.out.printf(a+"+"+b+"= ");
                        Scanner user = new Scanner(System.in);
                        z = user.nextInt();
                        if(z==answer){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+answer);
                        }
                    }else if(a%m==0&&b%n!=0){
                        String x = b + "/" + n;
                        mol = a*n + b ;
                        System.out.printf(a+"+"+x+"= ");
                        String y =  mol + "/"+ n;
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(y)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+y);
                        }
                    }else if(a%m!=0&&b%n==0){
                        String x = a + "/" + m;
                        mol = a + b*m;
                        System.out.printf(x+"+"+b+"= ");
                        String y =  mol + "/"+ m;
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(y)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+y);
                        }
                    }else{
                        String x1 = a + "/" + m;
                        String x2 = b + "/" + n;
                        mol = a*n + b*m;
                        System.out.printf(x1+"+"+x2+"= ");
                        String y =  mol + "/"+ n*m;
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(y)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+y);
                        }
                    }
                }else if(m!=0&&n==0){
                    n = n1.nextInt(100)+1;
                    if(a%m==0&&b%n==0){
                        answer = a + b;
                        System.out.printf(a+"+"+b+"= ");
                        Scanner user = new Scanner(System.in);
                        z = user.nextInt();
                        if(z==answer){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+answer);
                        }
                    }else if(a%m==0&&b%n!=0){
                        String x = b + "/" + n;
                        mol = a*n + b ;
                        System.out.printf(a+"+"+x+"= ");
                        String y =  mol + "/"+ n;
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(y)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+y);
                        }
                    }else if(a%m!=0&&b%n==0){
                        String x = a + "/" + m;
                        mol = a + b*m;
                        System.out.printf(x+"+"+b+"= ");
                        String y =  mol + "/"+ m;
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(y)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+y);
                        }
                    }else{
                        String x1 = a + "/" + m;
                        String x2 = b + "/" + n;
                        mol = a*n + b*m;
                        System.out.printf(x1+"+"+x2+"= ");
                        String y =  mol + "/"+ n*m;
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(y)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+y);
                        }
                    }
                }else{
                    if(a%m==0&&b%n==0){
                        answer = a + b;
                        System.out.printf(a+"+"+b+"= ");
                        Scanner user = new Scanner(System.in);
                        z = user.nextInt();
                        if(z==answer){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+answer);
                        }
                    }else if(a%m==0&&b%n!=0){
                        String x = b + "/" + n;
                        mol = a*n + b ;
                        System.out.printf(a+"+"+x+"= ");
                        String y =  mol + "/"+ n;
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(y)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+y);
                        }
                    }else if(a%m!=0&&b%n==0){
                        String x = a + "/" + m;
                        mol = a + b*m;
                        System.out.printf(x+"+"+b+"= ");
                        String y =  mol + "/"+ m;
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(y)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+y);
                        }
                    }else{
                        String x1 = a + "/" + m;
                        String x2 = b + "/" + n;
                        mol = a*n + b*m;
                        System.out.printf(x1+"+"+x2+"= ");
                        String y =  mol + "/"+ n*m;
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(y)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+y);
                        }
                    }
                }
            }
            if(c==1){//1为-
                if(m==0&&n==0){
                    m = m1.nextInt(100)+1;
                    n = n1.nextInt(100)+1;
                    if(a%m==0&&b%n==0){
                        answer = a - b;
                        System.out.printf(a+"-"+b+"= ");
                        Scanner user = new Scanner(System.in);
                        z = user.nextInt();
                        if(z==answer){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+answer);
                        }
                }else if(a%m==0&&b%n!=0){
                    String x = b + "/" + n;
                    mol = a*n - b ;
                    System.out.printf(a+"-"+x+"= ");
                    String y =  mol + "/"+ n;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else if(a%m!=0&&b%n==0){
                    String x = a + "/" + m;
                    mol = a - b*m;
                    System.out.printf(x+"-"+b+"= ");
                    String y =  mol + "/"+ m;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else{
                    String x1 = a + "/" + m;
                    String x2 = b + "/" + n;
                    mol = a*n - b*m;
                    System.out.printf(x1+"-"+x2+"= ");
                    String y =  mol + "/"+ n*m;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }
                }else if(m==0&&n!=0){
                m = m1.nextInt(100)+1;
                if(a%m==0&&b%n==0){
                    answer = a - b;
                    System.out.printf(a+"-"+b+"= ");
                    Scanner user = new Scanner(System.in);
                    z = user.nextInt();
                    if(z==answer){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+answer);
                    }
                }else if(a%m==0&&b%n!=0){
                    String x = b + "/" + n;
                    mol = a*n - b ;
                    System.out.printf(a+"-"+x+"= ");
                    String y = mol + "/"+ n;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else if(a%m!=0&&b%n==0){
                    String x = a + "/" + m;
                    mol = a - b*m;
                    System.out.printf(x+"-"+b+"= ");
                    String y = mol + "/"+ m;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else{
                    String x1 = a + "/" + m;
                    String x2 = b + "/" + n;
                    mol = a*n - b*m;
                    System.out.printf(x1+"-"+x2+"= ");
                    String y =  mol + "/"+ n*m;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }
            }else if(m!=0&&n==0){
                n = n1.nextInt(100)+1;
                if(a%m==0&&b%n==0){
                    answer = a - b;
                    System.out.printf(a+"-"+b+"= ");
                    Scanner e1 = new Scanner(System.in);
                    z = e1.nextInt();
                    if(z==answer){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+answer);
                    }
                }else if(a%m==0&&b%n!=0){
                    String x = b + "/" + n;
                    mol = a*n - b ;
                    System.out.printf(a+"-"+x+"= ");
                    String y = mol + "/"+ n;
                    Scanner user= new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else if(a%m!=0&&b%n==0){
                    String x = a + "/" + m;
                    mol = a - b*m;
                    System.out.printf(x+"-"+b+"= ");
                    String y = mol + "/"+ m;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else{
                    String x1 = a + "/" + m;
                    String x2 = b + "/" + n;
                    mol = a*n - b*m;
                    System.out.printf(x1+"-"+x2+"= ");
                    String y = mol + "/"+ n*m;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }
            }else{
                if(a%m==0&&b%n==0){
                    answer = a - b;
                    System.out.printf(a+"-"+b+"= ");
                    Scanner user = new Scanner(System.in);
                    z = user.nextInt();
                    if(z==answer){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+answer);
                    }
                }else if(a%m==0&&b%n!=0){
                    String x = b + "/" + n;
                    mol = a*n - b ;
                    System.out.printf(a+"-"+x+"= ");
                    String y =  mol + "/"+ n;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else if(a%m!=0&&b%n==0){
                    String x = a + "/" + m;
                    mol = a - b*m;
                    System.out.printf(x+"-"+b+"= ");
                    String y = mol + "/"+ m;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else{
                    String x1 = a + "/" + m;
                    String x2 = b + "/" + n;
                    mol = a*n - b*m;
                    System.out.printf(x1+"-"+x2+"= ");
                    String y = mol + "/"+ n*m;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }
            }
            }
            if(c==2){
                if(m==0&&n==0){
                    m = m1.nextInt(100)+1;
                    n = n1.nextInt(100)+1;
                    if(a%m==0&&b%n==0){
                        answer = a * b;
                        System.out.printf(a+"x"+b+"= ");
                        Scanner user = new Scanner(System.in);
                        z = user.nextInt();
                        if(z==answer){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+answer);
                        }
                }else if(a%m==0&&b%n!=0){
                    String x = b + "/" + n;
                    mol = a*b ;
                    System.out.printf(a+"x"+x+"= ");
                    String y =  mol + "/"+ n;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else if(a%m!=0&&b%n==0){
                    String x = a + "/" + m;
                    mol = b*a;
                    System.out.printf(x+"x"+b+"= ");
                    String y =  mol + "/"+ m;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else{
                    String x1 = a + "/" + m;
                    String x2 = b + "/" + n;
                    mol = a*b;
                    System.out.printf(x1+"x"+x2+"= ");
                    String y = mol + "/"+ n*m;
                    Scanner user= new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }
                }else if(m==0&&n!=0){
                m = m1.nextInt(100)+1;
                if(a%m==0&&b%n==0){
                    answer = a * b;
                    System.out.printf(a+"x"+b+"= ");
                    Scanner e1 = new Scanner(System.in);
                    z = e1.nextInt();
                    if(z==answer){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+answer);
                    }
                }else if(a%m==0&&b%n!=0){
                    String x = b + "/" + n;
                    mol = a*b;
                    System.out.printf(a+"x"+x+"= ");
                    String y =  mol + "/"+ n;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else if(a%m!=0&&b%n==0){
                    String x = a + "/" + m;
                    mol = a*b;
                    System.out.printf(x+"x"+b+"= ");
                    String y =  mol + "/"+ m;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else{
                    String x1 = a + "/" + m;
                    String x2 = b + "/" + n;
                    mol = a*b;
                    System.out.printf(x1+"x"+x2+"= ");
                    String y =  mol + "/"+ n*m;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }
            }else if(m!=0&&n==0){
                n = n1.nextInt(100)+1;
                if(a%m==0&&b%n==0){
                    answer = a * b;
                    System.out.printf(a+"x"+b+"= ");
                    Scanner e1 = new Scanner(System.in);
                    z = e1.nextInt();
                    if(z==answer){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+answer);
                    }
                }else if(a%m==0&&b%n!=0){
                    String x = b + "/" + n;
                    mol = a*b ;
                    System.out.printf(a+"x"+x+"= ");
                    String y =  mol + "/"+ n;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else if(a%m!=0&&b%n==0){
                    String x = a + "/" + m;
                    mol = a*b;
                    System.out.printf(x+"x"+b+"= ");
                    String y =  mol + "/"+ m;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else{
                    String x1 = a + "/" + m;
                    String x2 = b + "/" + n;
                    mol = a*b;
                    System.out.printf(x1+"x"+x2+"= ");
                    String y =  mol + "/"+ n*m;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }
            }else{
                if(a%m==0&&b%n==0){
                    answer = a * b;
                    System.out.printf(a+"x"+b+"= ");
                    Scanner e1 = new Scanner(System.in);
                    z = e1.nextInt();
                    if(z==answer){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+answer);
                    }
                }else if(a%m==0&&b%n!=0){
                    String x = b + "/" + n;
                    mol = a*b ;
                    System.out.printf(a+"x"+x+"= ");
                    String y =  mol + "/"+ n;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else if(a%m!=0&&b%n==0){
                    String x = a + "/" + m;
                    mol = a*b;
                    System.out.printf(x+"x"+b+"= ");
                    String y = mol + "/"+ m;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else{
                    String x1 = a + "/" + m;
                    String x2 = b + "/" + n;
                    mol = a*b;
                    System.out.printf(x1+"x"+x2+"= ");
                    String y =  mol + "/"+ n*m;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }
            }
            }
            if(c==3){
                if(b==0){
                    b = b1.nextInt(100)+1;
                    if(m==0&&n==0){
                        m = m1.nextInt(100)+1;
                        n = n1.nextInt(100)+1;
                        if(a%m==0&&b%n==0){
                            if(a%b!=0){
                                String x=a+"/"+b;
                            System.out.printf(a+"÷"+b+"= ");
                            Scanner user = new Scanner(System.in);
                            String score = user.next();
                            if(score.equals(x)){
                                System.out.println("回答正确！");
                                h++;
                            }else{
                                System.out.println("回答错误！正确答案是"+x);
                            }
                            }else{
                                answer = a / b;
                                System.out.printf(a+"÷"+b+"= ");
                                Scanner user = new Scanner(System.in);
                                z = user.nextInt();
                                if(z == answer){
                                    System.out.println("回答正确！");
                                    h++;
                                }else{
                                    System.out.println("回答错误！正确答案是"+answer);
                                }
                            }
                    }else if(a%m==0&&b%n!=0){
                        String x = b + "/" + n;
                        if(a==0){
                            System.out.println(a+"÷"+x+"= ");
                            Scanner user = new Scanner(System.in);
                            z = user.nextInt();
                            if(z==0){
                                System.out.println("回答正确！");
                                h++;
                                continue;
                            }else{
                                System.out.println("回答错误！正确答案是0");
                                continue;
                            }
                        }
                        mol = a*n ;
                        System.out.printf(a+"÷"+x+"= ");
                        String y =  mol + "/"+ b;
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(y)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+y);
                        }
                    }else if(a%m!=0&&b%n==0){
                        String x = a + "/" + m;
                        mol = a;
                        System.out.printf(x+"÷"+b+"= ");
                        String y =  mol + "/"+ m*b;
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(y)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+y);
                        }
                    }else{
                        String x1 = a + "/" + m;
                        String x2 = b + "/" + n;
                        mol = a*n;
                        System.out.printf(x1+"÷"+x2+"= ");
                        String y = mol + "/"+ b*m;
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(y)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+y);
                        }
                    }
                    }else if(m==0&&n!=0){
                    m = m1.nextInt(100)+1;
                    if(a%m==0&&b%n==0){
                        if(a%b!=0){
                            String x=a+"/"+b;
                        System.out.printf(a+"÷"+b+"= ");
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(x)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+x);
                        }
                        }else{
                            answer = a / b;
                            System.out.printf(a+"÷"+b+"= ");
                            Scanner user = new Scanner(System.in);
                            z = user.nextInt();
                            if(z==answer){
                                System.out.println("回答正确！");
                                h++;
                            }else{
                                System.out.println("回答错误！正确答案是"+answer);
                            }
                        }
                }else if(a%m==0&&b%n!=0){
                    String x = b + "/" + n;
                    if(a==0){
                        System.out.println(a+"÷"+x+"= ");
                        Scanner user = new Scanner(System.in);
                        z = user.nextInt();
                        if(z==0){
                            System.out.println("回答正确！");
                            h++;
                            continue;
                        }else{
                            System.out.println("回答错误！正确答案是0");
                            continue;
                        }
                    }
                    mol = a*n ;
                    System.out.printf(a+"÷"+x+"= ");
                    String y =  mol + "/"+ b;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else if(a%m!=0&&b%n==0){
                    String x = a + "/" + m;
                    mol = a;
                    System.out.printf(x+"÷"+b+"= ");
                    String y =  mol + "/"+ m*b;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else{
                    String x1 = a + "/" + m;
                    String x2 = b + "/" + n;
                    mol = a*n;
                    System.out.printf(x1+"÷"+x2+"= ");
                    String y =  mol + "/"+ b*m;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }
                }else if(m!=0&&n==0){
                    n = n1.nextInt(100)+1;
                    if(a%m==0&&b%n==0){
                        if(a%b!=0){
                            String x=a+"/"+b;
                        System.out.printf(a+"÷"+b+"= ");
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(x)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+x);
                        }
                        }else{
                            answer = a / b;
                            System.out.printf(a+"÷"+b+"= ");
                            Scanner user = new Scanner(System.in);
                            z = user.nextInt();
                            if(z==answer){
                                System.out.println("回答正确！");
                                h++;
                            }else{
                                System.out.println("回答错误！正确答案是"+answer);
                            }
                        }
                }else if(a%m==0&&b%n!=0){
                    String x = b + "/" + n;
                    if(a==0){
                        System.out.println(a+"÷"+x+"= ");
                        Scanner user = new Scanner(System.in);
                        z = user.nextInt();
                        if(z==0){
                            System.out.println("回答正确！");
                            h++;
                            continue;
                        }else{
                            System.out.println("回答错误！正确答案是0");
                            continue;
                        }
                    }
                    mol = a*n ;
                    System.out.printf(a+"÷"+x+"= ");
                    String y = mol + "/"+ b;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else if(a%m!=0&&b%n==0){
                    String x = a + "/" + m;
                    mol = a;
                    System.out.printf(x+"÷"+b+"= ");
                    String y = mol + "/"+ m*b;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else{
                    String x1 = a + "/" + m;
                    String x2 = b + "/" + n;
                    mol = a*n;
                    System.out.printf(x1+"÷"+x2+"= ");
                    String y = mol + "/"+ b*m;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }
                }else{
                    if(a%m==0&&b%n==0){
                        if(a%b!=0){
                            String x=a+"/"+b;
                        System.out.printf(a+"÷"+b+"= ");
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(x)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+x);
                        }
                        }else{
                            answer = a / b;
                            System.out.printf(a+"÷"+b+"= ");
                            Scanner e5 = new Scanner(System.in);
                            z = e5.nextInt();
                            if(z==answer){
                                System.out.println("回答正确！");
                                h++;
                            }else{
                                System.out.println("回答错误！正确答案是"+answer);
                            }
                        }
                }else if(a%m==0&&b%n!=0){
                    String x = b + "/" + n;
                    if(a==0){
                        System.out.println(a+"÷"+x+"= ");
                        Scanner user = new Scanner(System.in);
                        z = user.nextInt();
                        if(z==0){
                            System.out.println("回答正确！");
                            h++;
                            continue;
                        }else{
                            System.out.println("回答错误！正确答案是0");
                            continue;}
                    }
                    mol = a*n ;
                    System.out.printf(a+"÷"+x+"= ");
                    String y = mol + "/"+ b;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else if(a%m!=0&&b%n==0){
                    String x = a + "/" + m;
                    mol = a;
                    System.out.printf(x+"÷"+b+"= ");
                    String y = mol + "/"+ m*b;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else{
                    String x1 = a + "/" + m;
                    String x2 = b + "/" + n;
                    mol = a*n;
                    System.out.printf(x1+"÷"+x2+"= ");
                    String y = mol + "/"+ b*m;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }
                }
                }else{
                    if(m==0&&n==0){
                        m = m1.nextInt(100)+1;
                        n = n1.nextInt(100)+1;
                        if(a%m==0&&b%n==0){
                            if(a%b!=0){
                                String x=a+"/"+b;
                                System.out.printf(a+"÷"+b+"= ");
                                Scanner user = new Scanner(System.in);
                                String score = user.next();
                                if(score.equals(x)){
                                    System.out.println("回答正确！");
                                    h++;
                                }else{
                                    System.out.println("回答错误！正确答案是"+x);
                                }
                            }else{
                                answer = a / b;
                                System.out.printf(a+"÷"+b+"= ");
                                Scanner user = new Scanner(System.in);
                                z = user.nextInt();
                                if(z==answer){
                                    System.out.println("回答正确！");
                                    h++;
                                }else{
                                    System.out.println("回答错误！正确答案是"+answer);
                                }
                            }
                    }else if(a%m==0&&b%n!=0){
                        String x = b + "/" + n;
                        mol = a*n ;
                        System.out.printf(a+"÷"+x+"= ");
                        String y = mol + "/"+ b;
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(y)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+y);
                        }
                    }else if(a%m!=0&&b%n==0){
                        String x = a + "/" + m;
                        if(a==0){
                            System.out.println(a+"÷"+x+"= ");
                            Scanner user = new Scanner(System.in);
                            z = user.nextInt();
                            if(z==0){
                                System.out.println("回答正确！");
                                h++;
                                continue;
                            }else{
                                System.out.println("回答错误！正确答案是0");
                                continue;
                            }
                        }
                        mol = a;
                        System.out.printf(x+"÷"+b+"= ");
                        String y = mol + "/"+ m*b;
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(y)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+y);
                        }
                    }else{
                        String x1 = a + "/" + m;
                        String x2 = b + "/" + n;
                        mol = a*n;
                        System.out.printf(x1+"÷"+x2+"= ");
                        String y = mol + "/"+ b*m;
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(y)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+y);
                        }
                    }
                    }else if(m==0&&n!=0){
                        m = m1.nextInt(100)+1;
                        if(a%m==0&&b%n==0){
                            if(a%b!=0){
                                String l=a+"/"+b;
                                System.out.printf(a+"÷"+b+"= ");
                                Scanner e4 = new Scanner(System.in);
                                String p1 = e4.next();
                                if(p1.equals(l)){
                                    System.out.println("回答正确！");
                                    h++;
                                }else{
                                    System.out.println("回答错误！正确答案是"+l);
                                }
                            }else{
                                answer = a / b;
                                System.out.printf(a+"÷"+b+"= ");
                                Scanner user = new Scanner(System.in);
                                z = user.nextInt();
                                if(z==answer){
                                    System.out.println("回答正确！");
                                    h++;
                                }else{
                                    System.out.println("回答错误！正确答案是"+answer);
                                }
                            }
                        }else if(a%m==0&&b%n!=0){
                            String x = b + "/" + n;
                            if(a==0){
                                System.out.println(a+"÷"+x+"= ");
                                Scanner user = new Scanner(System.in);
                                z = user.nextInt();
                                if(z==0){
                                    System.out.println("回答正确！");
                                    h++;
                                    continue;
                                }else{
                                    System.out.println("回答错误！正确答案是0");
                                    continue;
                                }
                            }
                            mol = a*n ;
                            System.out.printf(a+"÷"+x+"= ");
                            String y =  mol + "/"+ b;
                            Scanner user = new Scanner(System.in);
                            String score = user.next();
                            if(score.equals(y)){
                                System.out.println("回答正确！");
                                h++;
                            }else{
                                System.out.println("回答错误！正确答案是"+y);
                            }
                        }else if(a%m!=0&&b%n==0){
                            String x = a + "/" + m;
                            mol = a;
                            System.out.printf(x+"÷"+b+"= ");
                            String y = mol + "/"+ m*b;
                            Scanner user = new Scanner(System.in);
                            String score = user.next();
                            if(score.equals(y)){
                                System.out.println("回答正确！");
                                h++;
                            }else{
                                System.out.println("回答错误！正确答案是"+y);
                            }
                        }else{
                            String x1 = a + "/" + m;
                            String x2 = b + "/" + n;
                            mol = a*n;
                            System.out.printf(x1+"÷"+x2+"= ");
                            String y =  mol + "/"+ b*m;
                            Scanner user = new Scanner(System.in);
                            String score = user.next();
                            if(score.equals(y)){
                                System.out.println("回答正确！");
                                h++;
                            }else{
                                System.out.println("回答错误！正确答案是"+y);
                            }
                        }
                }else if(m!=0&&n==0){
                    n = n1.nextInt(100)+1;
                    if(a%m==0&&b%n==0){
                        if(a%b!=0){
                            String x=a+"/"+b;
                        System.out.printf(a+"÷"+b+"= ");
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(x)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+x);
                        }
                        }else{
                            answer = a / b;
                            System.out.printf(a+"÷"+b+"= ");
                            Scanner user = new Scanner(System.in);
                            z = user.nextInt();
                            if(z==answer){
                                System.out.println("回答正确！");
                                h++;
                            }else{
                                System.out.println("回答错误！正确答案是"+answer);
                            }
                        }
                }else if(a%m==0&&b%n!=0){
                    String x = b + "/" + n;
                    if(a==0){
                        System.out.println(a+"÷"+x+"= ");
                        Scanner user = new Scanner(System.in);
                        z = user.nextInt();
                        if(z==0){
                            System.out.println("回答正确！");
                            h++;
                            continue;
                        }else{
                            System.out.println("回答错误！正确答案是0");
                            continue;
                        }
                    }
                    mol = a*n ;
                    System.out.printf(a+"÷"+x+"= ");
                    String y =  mol + "/"+ b;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else if(a%m!=0&&b%n==0){
                    String x = a + "/" + m;
                    mol = a;
                    System.out.printf(x+"÷"+b+"= ");
                    String y =  mol + "/"+ m*b;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }else{
                    String x1 = a + "/" + m;
                    String x2 = b + "/" + n;
                    mol = a*n;
                    System.out.printf(x1+"÷"+x2+"= ");
                    String y =  mol + "/"+ b*m;
                    Scanner user = new Scanner(System.in);
                    String score = user.next();
                    if(score.equals(y)){
                        System.out.println("回答正确！");
                        h++;
                    }else{
                        System.out.println("回答错误！正确答案是"+y);
                    }
                }
                }else{
                    if(a%m==0&&b%n==0){
                        if(a%b!=0){
                            String x=a+"/"+b;
                            System.out.printf(a+"÷"+b+"= ");
                            Scanner user = new Scanner(System.in);
                            String score = user.next();
                            if(score.equals(x)){
                                System.out.println("回答正确！");
                                h++;
                            }else{
                                System.out.println("回答错误！正确答案是"+x);
                            }
                        }else{
                            answer = a / b;
                            System.out.printf(a+"÷"+b+"= ");
                            Scanner e5 = new Scanner(System.in);
                            z = e5.nextInt();
                            if(z==answer){
                                System.out.println("回答正确！");
                                h++;
                            }else{
                                System.out.println("回答错误！正确答案是"+answer);
                            }
                        }
                    }else if(a%m==0&&b%n!=0){
                        String x = b + "/" + n;
                        if(a==0){
                            System.out.println(a+"÷"+x+"= ");
                            Scanner user = new Scanner(System.in);
                            z = user.nextInt();
                            if(z==0){
                                System.out.println("回答正确！");
                                h++;
                                continue;
                            }else{
                                System.out.println("回答错误！正确答案是0");
                                continue;
                            }
                        }
                        mol = a*n ;
                        System.out.printf(a+"÷"+x+"= ");
                        String y =  mol + "/"+ b;
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(y)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+y);
                        }
                    }else if(a%m!=0&&b%n==0){
                        String x = a + "/" + m;
                        mol = a;
                        System.out.printf(x+"÷"+b+"= ");
                        String y =  mol + "/"+ m*b;
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(y)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+y);
                        }
                    }else{
                        String x1 = a + "/" + m;
                        String x2 = b + "/" + n;
                        mol = a*n;
                        System.out.printf(x1+"÷"+x2+"= ");
                        String y =  mol + "/"+ b*m;
                        Scanner user = new Scanner(System.in);
                        String score = user.next();
                        if(score.equals(y)){
                            System.out.println("回答正确！");
                            h++;
                        }else{
                            System.out.println("回答错误！正确答案是"+y);
                        }
                    }
                    }
                }
            }
        }
        System.out.println("总共"+number+"题"+"恭喜答对"+h+"题");
        System.out.println("正确率为："+(float)h/number);
    }
}