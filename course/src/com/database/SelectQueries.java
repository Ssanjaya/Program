package com.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class SelectQueries {

    private static Connection connection;

    static
    {
        try
        {
            connection = SqlConnection.connectionInstance();
        }
        catch (ClassNotFoundException | SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
    private static final String SELECTUSERQUERY = "select email,password from registration where email = ?";
    private static final String SLOT1USERID = "select user_id from student_academic_details where cut_off_marks <=200 and cut_off_marks >170 order by cut_off_marks";
    private static final String SLOT2USERID = "select user_id from student_academic_details where cut_off_marks <=170 and cut_off_marks >140 order by cut_off_marks";
    private static final String SLOT3USERID = "select user_id from student_academic_details where cut_off_marks <=140 and cut_off_marks >110 order by cut_off_marks";
    private static final String ISCOUNSELLED =  "select dept_code from student_academic_details where user_id = ?";
    private static final String SLOT4USERID = "select user_id from student_academic_details where cut_off_marks <=110 and cut_off_marks >70 order by cut_off_marks";
    private static final String SELECTGRADEUSINGUSERID = "select cut_off_marks from student_academic_details where student_id = (select student_id from student_personal_details where user_id = ?)";
    private static final String SELECTISAPPLIED = "select user_id from student_personal_details where user_id = ?";
    private static final String STUDENTDETAILSBEFORE = "select a.*,b.cut_off_marks,b.school_name,b.mathematics_marks,b.chemistry_marks,b.physics_marks from student_personal_details a join student_academic_details b on a.user_id = b.user_id where a.user_id = ?";
    private static final String COLLEGEDETAILS = "select * from college_details where total_seats <> 0";
    private static final String DEPARTMENTDETAILS = "select dept_code,dept_name,seats_per_department from department_details where college_code = ?";
    private static final String ISCOLLEGEEXIST = "select college_code from college_details where college_code = ? and total_seats <> 0";
    private static final String ISDEPARTMENTEXIST = "select dept_code from department_details where college_code = ? and dept_code = ? and seats_per_department <> 0";
    private static final String RESULTOFCOUNSEL =  "select a.college_code,a.college_name,a.city_name,b.dept_code,b.dept_name from college_details a join department_details b on a.college_code = b.college_code where a.college_code = ? and b.dept_code = ?";

    static String[] usersList;
    static int sizeOfUsers;
    public static ResultSet selectEmailPasswordQuery(String userName) throws Exception
    {
        PreparedStatement preparedStatement = connection.prepareStatement(SELECTUSERQUERY);
        preparedStatement.setString(1, userName);

        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet;
    }

    public static float selectCutOff(String userId) throws Exception
    {
        PreparedStatement preparedStatement = connection.prepareStatement(SELECTGRADEUSINGUSERID);
        preparedStatement.setString(1, userId);

        ResultSet resultSet = preparedStatement.executeQuery();
        float cutOff = 0;
        if (resultSet.next())
        {
            cutOff = resultSet.getFloat(1);
        }
        return cutOff;
    }

    public static boolean isApplied(String userId) throws Exception
    {
        String user = null;
        PreparedStatement preparedStatement = connection.prepareStatement(SELECTISAPPLIED);
        preparedStatement.setString(1, userId);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next())
            user = resultSet.getString("user_id");
        if (user == null)
            return false;
        return true;
    }

    public static ResultSet studentDetails(String userId) throws Exception
    {
        PreparedStatement preparedStatement = connection.prepareStatement(STUDENTDETAILSBEFORE);
        preparedStatement.setString(1, userId);

        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet;
    }

    public static int slot1useridCount() throws SQLException
    {
        PreparedStatement preparedStatement1 = connection.prepareStatement("select count(user_id) from student_academic_details where cut_off_marks <=200 and cut_off_marks >170");

        ResultSet resultSet1 = preparedStatement1.executeQuery();
        if (resultSet1.next())
            sizeOfUsers = resultSet1.getInt(1);

        return sizeOfUsers;
    }
    public static String[] slot1userid() throws Exception
    {
        PreparedStatement preparedStatement = connection.prepareStatement(SLOT1USERID);

        ResultSet resultSet = preparedStatement.executeQuery();

            sizeOfUsers = slot1useridCount();

        usersList = new String[sizeOfUsers];
        int i = 0;
        while (resultSet.next())
        {
            usersList[i] = resultSet.getString(1).trim();
            i++;
        }
        return usersList;
    }

    public static int slot2useridCount() throws SQLException
    {
        PreparedStatement preparedStatement1 = connection.prepareStatement("select count(user_id) from student_academic_details where cut_off_marks <=170 and cut_off_marks >140");

        ResultSet resultSet1 = preparedStatement1.executeQuery();
        if (resultSet1.next())
            sizeOfUsers = resultSet1.getInt(1);

        return sizeOfUsers;
    }
    public static String[] slot2userid() throws Exception
    {
        PreparedStatement preparedStatement = connection.prepareStatement(SLOT2USERID);

        ResultSet resultSet = preparedStatement.executeQuery();
        sizeOfUsers = slot2useridCount();
        usersList = new String[sizeOfUsers];
        int i = 0;
        while (resultSet.next())
        {
            usersList[i] = resultSet.getString(1).trim();
            i++;
        }
        return usersList;
    }

    public static int slot3useridCount() throws SQLException
    {
        PreparedStatement preparedStatement1 = connection.prepareStatement("select count(user_id) from student_academic_details where cut_off_marks <=140 and cut_off_marks >110");

        ResultSet resultSet1 = preparedStatement1.executeQuery();
        if (resultSet1.next())
            sizeOfUsers = resultSet1.getInt(1);

        return sizeOfUsers;
    }
    public static String[] slot3userid() throws Exception
    {
        PreparedStatement preparedStatement = connection.prepareStatement(SLOT3USERID);
        ResultSet resultSet = preparedStatement.executeQuery();
            sizeOfUsers = slot3useridCount();
        usersList = new String[sizeOfUsers];
        int i = 0;
        while (resultSet.next())
        {
            usersList[i] = resultSet.getString(1).trim();
            i++;
        }
        return usersList;
    }

    public static int slot4useridCount() throws SQLException
    {
        PreparedStatement preparedStatement1 = connection.prepareStatement("select count(user_id) from student_academic_details where cut_off_marks <=110 and cut_off_marks >70");

        ResultSet resultSet1 = preparedStatement1.executeQuery();
        if (resultSet1.next())
            sizeOfUsers = resultSet1.getInt(1);

        return sizeOfUsers;
    }
    public static String[] slot4userid() throws Exception
    {
        PreparedStatement preparedStatement = connection.prepareStatement(SLOT4USERID);

        ResultSet resultSet = preparedStatement.executeQuery();
            sizeOfUsers = slot4useridCount();

        usersList = new String[sizeOfUsers];
        int i = 0;
        while (resultSet.next())
        {
            usersList[i] = resultSet.getString(1).trim();
            i++;
        }
        return usersList;
    }

    public static boolean isCounselled(String userId) throws SQLException
    {
        String deptCode = null;
        PreparedStatement preparedStatement = connection.prepareStatement(ISCOUNSELLED);
        preparedStatement.setString(1,userId);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next())
            deptCode = resultSet.getString("dept_code");

        if (deptCode == null)
            return false;
        return true;
    }

    public static synchronized ResultSet collegeDetails() throws Exception
    {
        PreparedStatement preparedStatement = connection.prepareStatement(COLLEGEDETAILS);

        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet;
    }

    public static synchronized ResultSet departmentDetails(int deptCode) throws Exception
    {
        PreparedStatement preparedStatement = connection.prepareStatement(DEPARTMENTDETAILS);
        preparedStatement.setInt(1, deptCode);

        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet;
    }

    public static synchronized boolean isCollegeCodeExist(int collegeCode) throws SQLException
    {
        int code = 0;
        PreparedStatement preparedStatement = connection.prepareStatement(ISCOLLEGEEXIST);
        preparedStatement.setInt(1, collegeCode);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next())
            code = resultSet.getInt("college_code");
        if (code == 0)
            return false;
        return true;
    }

    public static synchronized boolean isDepartmentCodeExist(int collegeCode, String deptCode) throws SQLException
    {
        String code = null;
        PreparedStatement preparedStatement = connection.prepareStatement(ISDEPARTMENTEXIST);
        preparedStatement.setInt(1, collegeCode);
        preparedStatement.setString(2,deptCode);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next())
            code = resultSet.getString("dept_code");

        if (code == null)
            return false;
        return true;
    }

    public static synchronized ResultSet finalResult(int collegeCode, String deptCode) throws SQLException
    {

        PreparedStatement preparedStatement = connection.prepareStatement(RESULTOFCOUNSEL);
        preparedStatement.setInt(1, collegeCode);
        preparedStatement.setString(2,deptCode);

        return preparedStatement.executeQuery();

    }
	

}
