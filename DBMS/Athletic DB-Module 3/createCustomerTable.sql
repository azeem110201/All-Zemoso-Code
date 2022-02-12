CREATE TABLE IF NOT EXISTS Customer (
    custNo CHAR(5),
    custName VARCHAR(30) NOT NULL,
    custAddress VARCHAR(50) NOT NULL,
    internal CHAR(1) NOT NULL,
    contact VARCHAR(20) NOT NULL,
    phoneNo VARCHAR(15) NOT NULL,
    city VARCHAR(15) NOT NULL,
    state CHAR(3) NOT NULL,
    zip VARCHAR(5) NOT NULL,
    
    CONSTRAINT PK_CUSTNO PRIMARY KEY(custNo)
);