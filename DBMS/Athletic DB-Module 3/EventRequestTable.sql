CREATE TABLE IF NOT EXISTS EventRequest (
  evntNo  CHAR(5) NOT NULL,
  dateHeld  DATE  NOT NULL,
  dateReq  DATE  NOT NULL,
  custNo  CHAR(5) NOT NULL,
  facNo   CHAR(5) NOT NULL,
  dateAuth DATE,
  status  CHAR(20) NOT NULL,
  estCost DECIMAL(8, 2) NOT NULL,
  estAudience INTEGER NOT NULL,
  budNo CHAR(30),
  
  CONSTRAINT EventRequestPK PRIMARY KEY (evntNo),
  CONSTRAINT FK_FACNO_REQUEST FOREIGN KEY (facNo) REFERENCES Facility (facNo),
  CONSTRAINT FK_CUSTNO_REQUEST FOREIGN KEY (custNo) REFERENCES Customer (custNo),
  CHECK (status IN('Pending','Denied','Approved') AND estaudience>0)
);