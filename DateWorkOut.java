import java.util.Scanner;
import java.util.Calendar;
public class DateWorkOut{
public static void main(String[] args){
    Calendar calendar = Calendar.getInstance();
    int Nyear = calendar.get(Calendar.YEAR);
    int Nmouth = calendar.get(Calendar.MONTH) + 1;
    int Ndate = calendar.get(Calendar.DATE);

    System.out.println("请输入出生年份!");
    Scanner iyear = new Scanner(System.in);
    int year = iyear.nextInt();
    System.out.println("请输入出生月份!");
    Scanner imout = new Scanner(System.in);
    int mouth = imout.nextInt();
    System.out.println("生日是几号?");
    Scanner iday = new Scanner(System.in);
    int date = iday.nextInt();
    int OutDate;
    int OutMou;
    int OutYea;
    int dotm;
    if(mouth == 2| mouth == 4| mouth == 6| mouth == 9| mouth == 11){
    if(mouth == 2){
    if(year%4 == 0){
    dotm = 29;
    }else{
    dotm=28;
    }
    }else{
    dotm=30;
    }
    }else{
    dotm = 31;
    }
    if(date<= Ndate){
        OutDate = Ndate - date;
    }else{
    OutDate = dotm - date +Ndate;
    }
    boolean dc = false;
    if(date <= Ndate){
    dc = true;
    }
    if(dc){
    OutMou = 12- mouth+Nmouth;
    }else{
    OutMou = 12- mouth+Nmouth-1;
    }
    if(OutMou>=12){
    OutMou-=12;
    }
    boolean mc = false;
    if(mouth <= Nmouth){
    mc = true;
}
if(mc){
OutYea= Nyear - year;
}else{
OutYea= Nyear - year-1;
}
    System.out.println("你已经有"+OutYea+"岁"+OutMou+"个月"+OutDate+"天了");
    if(OutYea<18){
        System.out.println("你还未成年");
    }
    System.out.println("截至今天成年人应在"+(Nyear-18)+"年"+Nmouth+"月"+Ndate+"日之前出生");
}
}
