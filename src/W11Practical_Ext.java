import java.util.ArrayList;

public class W11Practical_Ext {
    public static void main(String[] args) {

        SoftwareCompany_Ext apple = new SoftwareCompany_Ext();

        //creating applications for testing
        Educational_Ext translator = new Educational_Ext("ED854", "Translator", 6, 15, "Tertiary", 20);
        apple.addEducationalApp(translator);

        Educational_Ext memoriser = new Educational_Ext("ED465", "Memoriser", 3, 15, "Secondary", 30);
        apple.addEducationalApp(memoriser);

        Entertainment_Ext mazeRunner = new Entertainment_Ext("ET324", "Maze Runner", 8, 20, "Action", 8.5);
        apple.addEntertainmentApp(mazeRunner);

        Entertainment_Ext warfayre = new Entertainment_Ext("ET289", "Warfayre", 4, 25, "Violence", 7.3);
        apple.addEntertainmentApp(warfayre);

        Entertainment_Ext brutalSniper = new Entertainment_Ext("ET222", "Brutal Sniper", 3, 15, "Violence", 4.8);
        apple.addEntertainmentApp(brutalSniper);

        Entertainment_Ext chineseWarrior = new Entertainment_Ext("ET583", "Chinese Warrior", 2, 20, "Action", 9.2);
        apple.addEntertainmentApp(chineseWarrior);

        Entertainment_Ext monacoWheels = new Entertainment_Ext("ET826", "Monaco Wheels", 3, 30, "Racing", 7.8);
        apple.addEntertainmentApp(monacoWheels);

        Entertainment_Ext roadDestroyer = new Entertainment_Ext("ET867", "Road Destroyer", 2, 25, "Racing", 5.6);
        apple.addEntertainmentApp(roadDestroyer);

        Finance_Ext ebitdaCalculator = new Finance_Ext("FN178", "EBITDA Calculator", 2, 40, false);
        apple.addFinanceApp(ebitdaCalculator);

        Finance_Ext pocketManager = new Finance_Ext("FN28", "Pocket Manager", 3, 30, true);
        apple.addFinanceApp(pocketManager);

        //creating managers for testing
        Manager sam = new Manager(382352, "Sam Underhill", 50000, "300323", "301017", 150);
        apple.addManager(sam);

        Manager dylan = new Manager(287293, "Dylan Hartley", 60000, "220420", "010116", 200);
        apple.addManager(dylan);

        Manager chris = new Manager(387437, "Chris Robshaw", 65000, "150722", "010110", 300);
        apple.addManager(chris);

        Manager henry = new Manager(854627, "Henry Slade", 40000, "010430", "301117", 100);
        apple.addManager(henry);

        //creating offices for testing
        Office bath = new Office("BA99783", "Bath Office", sam);
        apple.addOffice(bath);

        Office northampton = new Office("NN28667", "Northampton Office", dylan);
        apple.addOffice(northampton);

        Office london = new Office("EC44223", "Main Office London", chris);
        apple.addOffice(london);

        Office exeter = new Office("EX13245", "Exeter Office", henry);
        apple.addOffice(exeter);


        //creating employees for testing
        Employee_Ext joe= new CustomerService_Ext(467583, "Joe Moody", 20000, "050627",  ebitdaCalculator, 15);
        apple.addCSEmployee(joe);

        Employee_Ext dane = new CustomerService_Ext(467584, "Dane Coles", 25000, "050420", pocketManager, 10);
        apple.addCSEmployee(dane);

        Employee_Ext gareth = new CustomerService_Ext(267320, "Gareth Edwards", 30000, "010418", roadDestroyer, 30);
        apple.addCSEmployee(gareth);

        Employee_Ext martin = new CustomerService_Ext(220023, "Martin Johnson", 32000, "311217", brutalSniper, 8);
        apple.addCSEmployee(martin);

        Employee_Ext george = new SoftwareDeveloper_Ext(500352, "George Ford", 26000, "071219", warfayre, 4, exeter);
        apple.addSDEmployee(george);

        Employee_Ext anthony = new SoftwareDeveloper_Ext(510332, "Anthony Watson", 32000, "220418", warfayre, 12, bath);
        apple.addSDEmployee(anthony);

        Employee_Ext wyatt = new SoftwareDeveloper_Ext(520764, "Wyatt Crockett", 29000, "010119", memoriser, 3, london);
        apple.addSDEmployee(wyatt);

        Employee_Ext conor = new SoftwareDeveloper_Ext(439629, "Conor Murray", 30000, "010122", memoriser, 4, northampton);
        apple.addSDEmployee(conor);


        //calling a method from SoftwareCompany class which offers the functions which the user wants to use
        apple.printEverything();
    }
}