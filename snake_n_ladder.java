//round 2: Go as you like
import java.io.*;
class proceed100
{public static void main()throws IOException
    {BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Well, come lets play the invisiible snake
and ladder. You have to take your chances to reach 100 as fast as
possible.");
        System.out.println(" There are ladders in certain positions
that will hike you up higher. But,BEWARE there are snakes too, which
can bring you down");
        System.out.println("So, try your luck!!! ALL THE BEST! :)");
        int snake[]={ 12,22,26,46,64,66,79,88,96,99};
        int tail[]={5,7,4,31,49,55,61,50,11,10};
        int ladder[]={6,13,24,36,45,53,63,72,75,81};
        int hike[]={21,25,70,59,95,62,90,85,89,94}; int steps=0; int sum=0,i,n;
        System.out.println("The number of steps you take to reaach 100
decides how well you played");
        System.out.println("Steps <=10: EXCELLENT");
        System.out.println("Steps <=20: GOOD");
        System.out.println("Steps <=25: OKAY. NOT SO BAD");
        System.out.println("Steps >25: POOOOOR.");
        while(true)
        {do
            {System.out.println(" enter a number between 1 to 5");
              n=Integer.parseInt(br.readLine());
               if(n>5 || n<1)
                 System.out.println(" Wrong Input. Re-enter number");
                }while(n>5 || n<1);
                int flag=0;
          sum+=n; steps++;
          for(i=0;i<10;i++)
            {if(sum==snake[i])
             {sum=tail[i];
                 System.out.println(" sorry Unfortunately you have hit
a snake. Your position will go down");
                 System.out.println("you are currently in position  " +sum);
                 System.out.println("number of steps to reach 100  " +
(100-sum)); flag=1;
                }
             else if(sum== ladder[i])
             { sum=hike[i];
                 System.out.println(" Congratulation you have hit a
ladder. Your position will go up");
                 System.out.println("you are currently in position=  "
+ " " +sum);
                 System.out.println("number of steps to reach 100=  "
+ " " + (100-sum)); flag=1;
                }
            }
             if(flag==0)
              {System.out.println("you are currently in position=   " +sum);
                 System.out.println("number of steps to reach 100 =  "
+ (100-sum));
                }
              if(sum==100)
               {System.out.println("Congratulation you have proceeded to 100");
                  System.out.println(" No of steps taken= " + steps);
                  break;
                }
            }
            if(steps<=10)
            System.out.println("EXCELLENT");
            else if(steps<=20)
            System.out.println("GOOD");
            else if(steps<=25)
            System.out.println("OKAY. NOT SO BAD");
            else
            System.out.println("POOOOOR.");

        }
    }
