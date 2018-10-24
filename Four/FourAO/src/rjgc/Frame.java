package rjgc;

import javax.swing.*;

import java.awt.event.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

class Frame extends JFrame implements ActionListener
{
    int a, b,c, count, num;//a,b分别是第一个操作数，第二个操作数，c是存放用户输入的答案，count是题目总数，num是用于存放代表运算符的数
    int t=0,f=0,sum=0;
    String str;
    long s=1;//s表示阶乘结果
    float d,d1;//d是用于存放除法结果，d1是用于处理除法结果中保留小数点后两位
    int counter=0;//统计答题个数
    Timer time;
    int t1 = 0;
    JTextField T;//定义一个文本
    JLabel L1 = new JLabel("请输入题目个数(1-5):");
    JTextField T1 = new JTextField(5);   //放题目个数
    JButton B3 = new JButton("开始");
    JTextField T2 = new JTextField(10);  //设置运算式
    JTextField T3 = new JTextField(10);  //获取输入答案
    JTextField T4 = new JTextField(10);//存放答案提示
    JButton B1 = new JButton("确定");
    JButton B2 = new JButton("下一题");

    Frame() {
        T=new JTextField(10);//计时
        T.setEditable(false);
        time = new Timer(1000, this);
        time.start();
        T.setText(setTime(t1));
        this.setTitle("四则运算");
        this.setSize(280, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel p2 = new JPanel();
        JPanel p1 = new JPanel();
        p2.add(L1);
        p2.add(T1);
        p2.add(B3);
        p2.add(T2);
        p2.add(T3);
        p2.add(T4);
        p2.add(T);
        p1.add(B1);
        p1.add(B2);
        add(p2, "Center");
        add(p1, "South");

        B3.addActionListener(new ActionListener() {           //按钮B3表示开始
            public void actionPerformed(ActionEvent e) {
                boolean flag=false;
                Object bj = e.getSource(); // 获得事件源
                if (bj == B3) {
                    try{  //如果输入字符，抛出异常，提示错误
                        count = Integer.parseInt(T1.getText());  //将文本中获取的字符串转换为整型
                    }
                    catch(Exception f)
                    {
                        flag=true;
                    }
                    if(flag)
                    {
                        JOptionPane.showMessageDialog(null,"输入有误，请输入数字!");
                    }
                    if(count>5)
                    {
                        JOptionPane.showMessageDialog(null, "题目个数不能超过五个!请重新输入。");
                    }
                    if(count<=5)
                    {
                        num = (int) (Math.random() * 5);
                        a = (int) (Math.random() * 200) - 100;
                        b = (int) (Math.random() * 200) - 100;
                        if (num == 0)//num为0时，是加法运算
                        {
                            if (a < 0 && b < 0)       //判断a,b的正负并给负数加括号
                            {
                                T2.setText("(" + a + ")" + "+(" + b + ")=");
                            }
                            else if (a < 0 && b > 0)
                            {
                                T2.setText("(" + a + ")" + "+" + b + "=");
                            }
                            else if (a > 0 && b < 0)
                            {
                                T2.setText(a + "+(" + b + ")=");
                            }
                            else
                            {
                                T2.setText(a + "+" + b + "=");
                            }
                            c = a + b;
                            //处理按钮监听事件

                        } else if (num == 1)  //num为1表示减法运算
                        {
                            if (a < 0 && b < 0)
                            {
                                T2.setText("(" + a + ")" + "-(" + b + ")=");
                            }
                            else if (a < 0 && b > 0)
                            {
                                T2.setText("(" + a + ")" + "-" + b + "=");
                            }
                            else if (a > 0 && b < 0)
                            {
                                T2.setText(a + "-(" + b + ")=");
                            }
                            else
                            {
                                T2.setText(a + "-" + b + "=");
                            }
                            c = a - b;

                        } else if (num == 2) {   //num为2表示乘法运算
                            if (a < 0 && b < 0) {
                                T2.setText("(" + a + ")" + "*(" + b + ")=");

                            } else if (a < 0 && b > 0) {
                                T2.setText("(" + a + ")" + "*" + b + "=");

                            } else if (a > 0 && b < 0) {
                                T2.setText(a + "*(" + b + ")=");

                            } else {
                                T2.setText(a + "*" + b + "=");

                            }
                            c = a * b;
                        }
                        else if (num == 3&&b!=0) {   //num为3表示除法运算，并且要考虑除数不能为0的情况，因此b!=0
                            if (a < 0 && b< 0) {
                                T2.setText("(" + a + ")" + "/(" + b + ")=");

                            } else if (a < 0 && b > 0) {
                                T2.setText("(" + a + ")" + "/" + b + "=");

                            } else if (a > 0 && b< 0) {
                                T2.setText(a + "/(" + b + ")=");

                            } else {
                                T2.setText(a + "/" + b + "=");

                            }
                            d= (float)a/(float)b;  //将整型a,b强制转换为浮点型，保证结果正确
                            BigDecimal bg = new BigDecimal(d);   //将除法结果保留小数点后两位
                            d1 =(float)bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                        }
                        else
                        {
                            a=(int)(Math.random()*10);
                            T2.setText(a+"！=");
                            int i;
                            if(a==0||a==1)
                            {
                                s=1;
                            }
                            else
                            {

                                for(i=1;i<=a;i++)//计算阶乘
                                {
                                    s=s*i;
                                }
                            }
                        }

                    }
                }
            }
        });
        B2.addActionListener(new ActionListener() {           //B2表示下一题
            public void actionPerformed(ActionEvent e) {
                Object bj = e.getSource(); // 获得事件源
                if (bj == B2) {
                    int a, b, num, i = 1;
                    if (i < count) {
                        T3.setText(null);//当按钮按下一题时就将T3与T4的内容更新
                        T4.setText(null);
                        num = (int) (Math.random() * 5);
                        a = (int) (Math.random() * 200) - 100;
                        b = (int) (Math.random() * 200) - 100;
                        i++;
                        if (num == 0) {
                            if (a < 0 && b < 0) {
                                T2.setText("(" + a + ")" + "+(" + b + ")=");
                            } else if (a < 0 && b > 0) {
                                T2.setText("(" + a + ")" + "+" + b + "=");
                            } else if (a > 0 && b < 0) {
                                T2.setText(a + "+(" + b + ")=");
                            } else {
                                T2.setText(a + "+" + b + "=");
                            }
                            c = a + b;
                        } else if (num == 1) {
                            if (a < 0 && b < 0) {
                                T2.setText("(" + a + ")" + "-(" + b + ")=");

                            } else if (a < 0 && b > 0) {
                                T2.setText("(" + a + ")" + "-" + b + "=");
                            } else if (a > 0 && b < 0) {
                                T2.setText(a + "-(" + b + ")=");
                            } else {
                                T2.setText(a + "-" + b + "=");
                            }
                            c = a - b;

                        } else if (num == 2) {
                            if (a < 0 && b < 0) {
                                T2.setText("(" + a + ")" + "*(" + b + ")=");

                            } else if (a < 0 && b > 0) {
                                T2.setText("(" + a + ")" + "*" + b + "=");

                            } else if (a > 0 && b < 0) {
                                T2.setText(a + "*(" + b + ")=");

                            } else {
                                T2.setText(a + "*" + b + "=");

                            }
                            c = a * b;


                        }
                        else if (num == 3&&b!=0) {
                            if (a < 0 && b < 0) {
                                T2.setText("(" + a + ")" + "/(" + b + ")=");

                            } else if (a < 0 && b > 0) {
                                T2.setText("(" + a + ")" + "/" + b + "=");
                            } else if (a > 0 && b < 0) {
                                T2.setText(a + "/(" + b + ")=");
                            } else {
                                T2.setText(a + "/" + b + "=");
                            }
                            d= (float)a/(float)b;
                            BigDecimal bg = new BigDecimal(d);
                            d1 =(float)bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();


                        }
                        else
                        {
                            a=(int)(Math.random()*10);
                            T2.setText(a+"！=");
                            if(a==0||a==1)
                            {
                                s=1;
                            }
                            else
                            {

                                for(i=1;i<=a;i++)//计算阶乘
                                {
                                    s=s*i;
                                }
                            }
                        }

                        counter++;
                        if(counter>=count)//判断题目是否答完，答完了就弹出一个提示题目答完并给出答题时间的对话框
                        {
                            JOptionPane.showMessageDialog(null, "题目已答完,答对了"+t+"道题，答错了"+f+"道题\n\n总分是"+sum+"\n\n总用时为:"+t1+"秒");
                        }
                    }
                }
            }
        });
        B1.addActionListener(new ActionListener() {        //按钮B1表示确定
            public void actionPerformed(ActionEvent e) {
                Object bj = e.getSource();     // 获得事件源
                 str=T3.getText();
                int st=Integer.valueOf(str).intValue();
                int d3 = new Long(s).intValue();
                if (bj == B1) {
                    if (d1== Float.parseFloat(T3.getText()) || c == st || d3 == st) {
                        T4.setText("恭喜你，答对了");
                        t=t+1;
                        sum=sum+20;//每答对一题加20分
                    } else if (num==0 || num==1 || num==2){
                        T4.setText("抱歉，你答错了!正确答案为"+c);
                        f=f+1;
                    }else if (num==3) {
                        T4.setText("抱歉，你答错了!正确答案为" + d1);
                        f = f + 1;
                    }else {
                        T4.setText("抱歉，你答错了!正确答案为" + d3);
                        f = f + 1;
                    }
                }
            }
        });

    }
    public void actionPerformed(ActionEvent e) {
        t1= t1 + 1;            //累加时间
        T.setText(setTime(t1));

    }
    public String setTime(int t1) {//累加时间
        int hour, minute, second, a;
        String mytimer, strsec, strmin, strhour;
        t1=t1 % (60 * 60 * 24);
        second = t1 % 60;
        a = t1/ 60;
        minute = a % 60;

        hour = a / 60;
        if (second <= 9) {
            strsec = "0" + String.valueOf(second);
        } else {
            strsec = String.valueOf(second);
        }
        if (minute <= 9) {
            strmin = "0" + String.valueOf(minute);
        } else {
            strmin = String.valueOf(minute);
        }
        if (hour <= 9) {
            strhour = "0" + String.valueOf(hour);
        } else {
            strhour = String.valueOf(hour);
        }
        mytimer = "计时: " + strhour + ":" + strmin + ":" + strsec;
        return mytimer;
    }


}