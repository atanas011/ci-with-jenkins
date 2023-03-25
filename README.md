### Jenkins Parallel Test Execution

Java (JDK) and Maven should be installed and added to System variables.  
Jenkins should also be configured on system.  
Tests were written to run with Microsoft Edge browser.

- Run Jenkins on localhost and sign in
- From Dashboard create a new Freestyle project
- In Source Code Management choose "Git", and in Repository URL paste this repo's url
- In Build Steps choose "Execute Windows batch command", and type: mvn test
- Apply and Save
- To get results and HTML report, click "Build Now"
- Report is created in: Workspace/target/surefire-reports/index.html

User story:

1. Go to https://www.google.com
2. Verify title
3. Go to https://the-internet.herokuapp.com
4. Verify title