package com.counselling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.database.SelectQueries;
import com.thread.CreatingThread;
import com.validation.Validations;


public class VerifyToCounsel {
	private final Date SLOTDATE1 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("23-10-2022 17:00:00");
    private final Date SLOTDATE2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("24-10-2022 12:00:00");
    private final Date SLOTDATE3 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("25-10-2022 14:00:00");
    private final Date SLOTDATE4 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("26-10-2022 15:00:00");

public VerifyToCounsel()throws ParseException{
	
}
public void generateSlot(String userId)throws Exception{
	String []usersList ;
	int usersCount;
	CreatingThread creatingThread = new CreatingThread();
	float cutOff ;
    Date currentDate = new Date();

    cutOff = SelectQueries.selectCutOff(userId);
    if (cutOff == 0.0)
    {
        System.out.println("Sorry You didn't applied for Counselling :(");
        return;
    }

    if ((cutOff <= 200 && cutOff > 170) && (currentDate.after(SLOTDATE1)))
    {
        usersCount = SelectQueries.slot1useridCount();
        usersList = SelectQueries.slot1userid();
        creatingThread.generateThread(userId, usersList, usersCount);
    }

    else if ((cutOff <= 170 && cutOff > 140) && (currentDate.after(SLOTDATE2)))
    {
        usersCount = SelectQueries.slot2useridCount();
        usersList = SelectQueries.slot2userid();
        creatingThread.generateThread(userId, usersList, usersCount);
    }

    else if ((cutOff <= 140 && cutOff > 110) && (currentDate.after(SLOTDATE3)))
    {
        usersCount = SelectQueries.slot3useridCount();
        usersList = SelectQueries.slot3userid();
        creatingThread.generateThread(userId, usersList, usersCount);
    }

    else if ((cutOff <= 110 && cutOff > 70) && (currentDate.after(SLOTDATE4)))
    {
        usersCount = SelectQueries.slot4useridCount();
        usersList = SelectQueries.slot4userid();
        creatingThread.generateThread(userId, usersList, usersCount);
    }
    else
        System.out.println(Validations.displayInfo(cutOff));
}

public Date getSLOT1DATE()
{
    return SLOTDATE1;
}
}
