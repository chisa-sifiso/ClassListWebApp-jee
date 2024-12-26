
<body>

  <h1>ClassList Application</h1>
    <p>Welcome to the ClassList Application. This is a Java web-based project that allows users to perform CRUD operations (Create, Read, Update, and Delete) on student data.</p>

  <h2>Overview</h2>
    <p>This application allows the user to add, delete, search, and view student details such as student number, name, surname, and a photo. The application interacts with a backend database and uses servlets and JSP for its frontend components.</p>
    <h2>Installation and Setup</h2>
    <p>To set up and run the ClassList Application, follow the instructions below:</p>
    <ul>
        <li>Install a Java web server like Apache Tomcat or GlassFish.</li>
        <li>Deploy the application by copying the project folder into the webapps directory of your server.</li>
        <li>Ensure that the database is properly configured and the necessary tables are created.</li>
        <li>Run the server and access the application at <code>http://localhost:8080/YourAppName</code>.</li>
    </ul>
    <h2>File Structure</h2>
    <div class="file-structure">
        <ul>
            <li><b>WEB-INF/</b></li>
            <ul>
                <li><b>add_student_outcome.jsp</b> - Displays a success message when a student is added.</li>
                <li><b>delete_student.jsp</b> - Displays a confirmation message when a student is deleted.</li>
                <li><b>index.html</b> - Main menu for the application, allowing users to navigate to other operations.</li>
                <li><b>search_student.html</b> - Allows users to search for a student by student number.</li>
                <li><b>view_student.html</b> - Displays student details after a search.</li>
            </ul>
                        <li><b>Source Packages (za.ac.tut.web)</b></li>
            <ul>
                <li><b>addStudentServlet.java</b> - Servlet for handling the addition of a student to the system.</li>
                <li><b>deleteSevlet.java</b> - Servlet for handling the deletion of a student.</li>
                <li><b>numstudentServlet.java</b> - Servlet for displaying the total number of students.</li>
                <li><b>searchStudentServlet.java</b> - Servlet for searching a student by their student number.</li>
                <li><b>viewAllStudentServlet.java</b> - Servlet for viewing all students in the system.</li>
            </ul>
        </ul>
    </div>

  <h2>Database Configuration</h2>
    <p>The application connects to a MySQL database where student information is stored. Ensure that the database is configured with the following table:</p>
    <pre>
        CREATE TABLE ClassList (
            studentNum BIGINT PRIMARY KEY,
            name VARCHAR(255),
            surname VARCHAR(255),
            stu_photo BLOB,
            timestampreal TIMESTAMP
        );
    </pre>

  <h2>How to Use</h2>
    <p>Once the application is running, you can perform the following actions:</p>
    <ul>
        <li><b>Add Student:</b> Navigate to <code>add_student.html</code> to add a new student with a name, surname, student number, and photo.</li>
        <li><b>Delete Student:</b> Navigate to <code>delete_student.html</code> to delete a student by entering their student number.</li>
        <li><b>Search Student:</b> Navigate to <code>search_student.html</code> to search for a student by their student number.</li>
        <li><b>View All Students:</b> Navigate to <code>view_student.html</code> to see a list of all students.</li>
        <li><b>View Number of Students:</b> Navigate to <code>num_student.html</code> to view the total number of students in the system.</li>
    </ul>
    <h2>Credits</h2>
    <p>This application was developed by sifiso vinjwa.</p>
<h3>developed by sifiso vinjwa</h3>
</body>
</html>
