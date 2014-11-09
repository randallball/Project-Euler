public class Nineteen
{
    private int sundays;//counting sundays
    private int year;//what year is it. will be built in to the upDate method
    private int month;//1 - 12
    private int day;//1 - daysInCurrentMonth
    private int daysInCurrentMonth;//method written
    private boolean leap;//method written
    private int currentDay;//1 = monday, 7 = sunday. upDate method

    public Nineteen(int day, int month, int year, int currentDay)
    {
        this.year = year;
        this.currentDay = currentDay;
        this.month = month;
        this.day = day;
        this.sundays = 0;
        this.daysInCurrentMonth = 31;
        this.leap = false;
    }
	
	public Nineteen()
	{
		this(1, 1, 1901, 1);
	}

    public void isLeapYear()
    {
		if (year % 4 == 0)
		{
			if (year % 100 == 0 && year % 400 != 0)
			{
				leap = false;
			}
			else
			{
				leap = true;
			}
		}
		else
		{
			leap = false;
		}
    }

    public void daysInMonth()
    {
        if (this.month == 9 || this.month == 4 || this.month == 6 || this.month == 11)
        {
            daysInCurrentMonth = 30;
        }
        else if (this.month == 2)
        {
            if (this.leap)
            {
                daysInCurrentMonth = 29;
            }
            else
            {
                daysInCurrentMonth = 28;
            }
        }
        else
        {
            daysInCurrentMonth = 31;
        }
    }
    
    public void upDate()
    {
        if (currentDay == 7 && day == 1)
        {
            sundays++;
        }
        day++;
        currentDay++;
        if (currentDay > 7)
        {
            currentDay = 1;
        }
        if (day > daysInCurrentMonth)
        {
            day = 1;
            month++;
            if (month > 12)
            {
                year++;
                month = 1;
            }
        }
		this.daysInMonth();
        this.isLeapYear();
    }
	
	public static void main(String[] args)
	{
		Nineteen stuff = new Nineteen();
		while (stuff.year <= 2000)
		{
			//System.out.println(stuff.currentDay + " " + stuff.day + " " + stuff.month + " " + stuff.year + " " + stuff.sundays);
			stuff.upDate();
		}
		System.out.println(stuff.sundays);
	}
}