USE Assignments;

-- 1. List the event number, date held, customer number, customer name, facility number, and facility name of 2018 events placed by Boulder customers.
SELECT evntNo, dateHeld, EventRequest.custNo, custName, EventRequest.facNo, facName
FROM Facility, EventRequest, Customer
WHERE (EventRequest.custNo = Customer.custNo)
AND (EventRequest.facNo = Facility.facNo)
AND city = 'Boulder'
AND EXTRACT(YEAR FROM dateHeld) = '2013';

-- 2. List the customer number, customer name, event number, date held, facility number, facility name, and estimated audience cost per person (EstCost / EstAudience) for events held on 2018, in which the estimated cost per person is less than $0.2
SELECT evntNo, dateHeld, EventRequest.custNo, custName, EventRequest.facNo, facName,
(estCost /  estAudience) AS estimatedAudienceCost
FROM 
Facility, EventRequest, Customer
WHERE (EventRequest.custNo = Customer.custNo)
AND (EventRequest.facNo = Facility.facNo)
AND EXTRACT(YEAR FROM dateHeld) = '2013'
HAVING estimatedAudienceCost < 0.2;

-- 3. List the customer number, customer name, and total estimated costs for Approved events. The total amount of events is the sum of the estimated cost for each event. Group the results by customer number and customer name.
SELECT EventRequest.custNo, custName,
SUM(estCost) AS totalEstimatedCost
FROM EventRequest, Customer
WHERE 
(EventRequest.custNo = Customer.custNo)
AND status="Approved"
GROUP BY EventRequest.custNo, custName;

-- 4. Insert yourself as a new row in the Customer table.
INSERT INTO Customer (custNo, custName, custAddress, internal, contact, phoneNo, city, state, zip) VALUES
 ('C106', 'Tim Gasser', '2345 Chuff Avenue', 'N', 'Bill Baseball', '8476543939', 'Austin', 'TX', '12345');
 
SELECT * FROM Customer;


-- 5. Increase the rate by 10 percent of resource names equal to nurse.
SET SQL_SAFE_UPDATES = 0;
UPDATE ResourceTbl
SET rate = rate * 1.1
WHERE 
resName = "nurse";
SET SQL_SAFE_UPDATES = 1;

SELECT * FROM ResourceTbl;

-- 6. Delete the new row added to the Customer table.
DELETE FROM Customer
WHERE CustNo = 'C106' AND CustName = 'Tim Gasser';

SELECT * FROM Customer;


