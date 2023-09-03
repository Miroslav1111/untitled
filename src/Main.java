public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
        dog=dog + 2;
        cat=cat + 2;
        paper=paper + 2;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
        dog=dog - 3.5;
        cat=cat - 1.6;
        paper=paper - 7639;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
        var friend = 7;
        System.out.println (friend);
        friend=friend - 2;
        System.out.println (friend);
        friend=friend / 7;
        System.out.println (friend);
        var frog=3.5;
        frog=frog*10;
        System.out.println (frog);
        frog=frog/3.5;
        System.out.println (frog);
        frog=frog + 4 ;
        System.out.println (frog);
        var boxer1=78.2;
        var boxer2=82.7;
        System.out.println (boxer1 + boxer2);
        System.out.println (boxer2 - boxer1);
        var weightBoxers= 160.9;
        System.out.println (boxer2 - boxer1 % weightBoxers);
        var hours=640;
        var workDay=8;
        System.out.println ("всего работают в компании " +hours/workDay + " человек");
        var workers=174;
        var hours1= hours/workers;
        System.out.println (hours1);
        System.out.println ( "если в компании работает "+ workers+" человека то всего "+hours1+" часа работы может быть поделено между ними! ");
    }
}