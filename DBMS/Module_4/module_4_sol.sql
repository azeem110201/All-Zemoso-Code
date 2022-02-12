USE Assignments;

SHOW TABLES;

SELECT * FROM EventRequest;

-- 1. List the customer number, the name, the phone number, and the city of customers.
SELECT custNo, custName, phoneNo, city FROM Customer;

-- 2. List the customer number, the name, the phone number, and the city of customers who reside in Colorado (State is CO).
SELECT custNo, custName, phoneNo, city FROM Customer WHERE state = "CO";

-- 3. List all columns of the EventRequest table for events costing more than $4000.  Order the result by the event date (DateHeld).
SELECT * FROM EventRequest WHERE estCost > 4000 ORDER BY dateHeld;

-- 4. List the event number, the event date (DateHeld), and the estimated audience number with approved status and audience greater than 9000 or with pending status and audience greater than 7000.
SELECT evntNo, dateHeld, estAudience FROM EventRequest 
WHERE (status = "Approved" AND estAudience > 9000) 
OR (status = "Pendind" AND estAudience > 7000);


-- 5. List the event number, event date (DateHeld), customer number and customer name of events placed in January 2013 by customers from Boulder.

SELECT er.evntNo, er.dateHeld, er.custNo, c.custName
FROM EventRequest AS er INNER JOIN Customer AS c
    ON er.custNo = c.custNo
WHERE (er.dateHeld BETWEEN '1-Jan-2013' AND '31-Jan-2013') 
    AND (c.city = 'Boulder');

-- List the average number of resources used (NumberFld) by plan number. Include only location number L100
SELECT AVG(numberFLD) AS avgNumberFLD, planNo FROM EventPlanLine WHERE locNo='L100' GROUP BY planNo;


-- List the average number of resources used (NumberFld) by plan number. Only include location number L100. Eliminate plans with less than two event lines containing location number L100.
SELECT AVG(numberFLD) AS avgNumberFLD, planNo FROM EventPlanLine WHERE locNo='L100' GROUP BY planNo HAVING COUNT(*) > 1; 
