# CS-305
CS-305 Software Security

Client Summary and Software Requirements

Client: Artemis Financial is a consulting company that develops individualized financial plans for its customers, including savings, retirement, investments, and insurance.

Issue: Artemis Financial wanted to modernize its operations by implementing secure communication mechanisms in its web application. Specifically, they needed to ensure that data transferred through their application was secure and verified using a checksum to prevent tampering.

What Was Done Well

Identifying Vulnerabilities: 
I effectively identified potential security vulnerabilities in the client’s codebase, focusing on areas that could expose sensitive financial data to risks. This involved analyzing the current security setup and pinpointing weaknesses, such as the lack of encrypted communication and data integrity checks.

Importance of Secure Coding: 
Coding securely is essential because it protects sensitive information, maintains customer trust, and ensures compliance with industry regulations. Insecure code can lead to data breaches, financial loss, and damage to a company’s reputation. Secure coding practices add value by safeguarding the company's assets and preserving its reputation, thereby contributing to its overall well-being.

Challenges and Insights

Challenging Aspects of Vulnerability Assessment:
One of the challenges was ensuring that no new vulnerabilities were introduced during the refactoring process. Static analysis tools like dependency-check were crucial in this regard, but interpreting the results and understanding the implications of certain dependencies required careful analysis.

Increasing Layers of Security:
To increase security, I implemented HTTPS for secure communication, added checksum verification using SHA-256 to ensure data integrity, and generated self-signed certificates for encrypted data transfer. In the future, I would use static analysis tools, penetration testing, and threat modeling to assess vulnerabilities and choose appropriate mitigation techniques.

Ensuring Functionality and Security

Ensuring Code Functionality and Security:
After refactoring the code, I conducted both functional and static testing. Functional testing involved manually reviewing the code and testing the application to ensure it behaved as expected. Static testing, using tools like dependency check, helped identify any new vulnerabilities that may have been introduced.

Verification Process:
I verified that the code was functional and secure by running the application in a secure environment, testing the new HTTPS and checksum features, and ensuring no errors were present in the static analysis reports.

Resources and Tools

Tools and Practices Used:
- Static Analysis Tools: Dependency-check for identifying potential security issues.
- Secure Coding Practices: Implementing encryption, secure communication protocols, and data integrity checks.
- Manual Testing: Review the code and test the application manually to ensure correctness.

These resources and practices will be invaluable in future assignments and tasks as they provide a structured approach to identifying and mitigating security vulnerabilities.

Showcasing to Future Employers

Demonstrating Skills and Experience:
For future employers, I would showcase this assignment as an example of my ability to:
- Identify and mitigate software security vulnerabilities.
- Implement secure coding practices to enhance application security.
- Use tools and methodologies to ensure the application is functional and secure.

This project highlights my proficiency in secure software development, attention to detail, and ability to protect sensitive data in real-world applications.

