package throwsdemo;

public class Teacher {
    public  void  check( int number) throws MyException{
        if (number>100 || number<0){
            throw new MyException("成绩超出范围");
        }else {
            System.out.println("成绩正常");
        }


         }

    }

