CREATE TABLE IF NOT EXISTS Employee (
  empNo CHAR(5) NOT NULL,
  empName VARCHAR(30) NOT NULL,
  department VARCHAR(20) NOT NULL,
  email VARCHAR(50) NOT NULL,
  phone VARCHAR(15) NOT NULL,
  
  CONSTRAINT PK_EMPNO PRIMARY KEY (empNo)
);