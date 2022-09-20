public class Main {
   public static void main(String[]args){
       var dog = 8.0;
       System.out.println(dog);
       var cat = 3.6;
       System.out.println(cat);
       var paper = 763789;
       System.out.println(paper);
       dog = dog + 4;
       System.out.println(dog);
       cat = cat + 4;
       System.out.println(cat);
       paper = paper + 4;
       System.out.println(paper);
       dog = dog - 3.5;
       System.out.println(dog);
       cat = cat - 1.6;
       System.out.println(cat);
       paper = paper - 7639;
       System.out.println(paper);
       var friend = 19;
       friend = friend + 2;
       System.out.println(friend);
       friend = friend / 7;
       System.out.println(friend);
       var frog = 3.5;
       System.out.println(frog);
       frog = frog * 10;
       System.out.println(frog);
       frog = frog / 3.5;
       System.out.println(frog);
       frog = frog + 4;
       System.out.println(frog);
       var firstBoxer = 78.2;
       var secondBoxer = 82.7;
       var totalWeightOfBoxers = firstBoxer + secondBoxer;
       System.out.println("общий вес боксеров будет равен " + totalWeightOfBoxers + " кг" );
       var overWeight = secondBoxer % firstBoxer;
       System.out.println("перевес боксеров будет составлять " + overWeight + " кг");
       var overWeight2 = firstBoxer - secondBoxer;
       System.out.println("перевес боксеров будет составлять " + overWeight2 + " кг");
       var workHours = 640;
       var workHoursForOneEmploer = 8;
       var amountEmployersInCompany = workHours / workHoursForOneEmploer;
       System.out.println("Всего работников в компании –  " + amountEmployersInCompany + " человек");
       var newEmployers = amountEmployersInCompany + 94;
       var newWorkHours = workHoursForOneEmploer * newEmployers;
       System.out.println("Если в компании работает " + newEmployers + " человек, то всего " + newWorkHours + " часа работы может быть поделено между сотрудниками" );




   }
}