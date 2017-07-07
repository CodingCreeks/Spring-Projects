select *from registration;
insert into registration values(100, "afaf","rger",30);


select *from employee;

insert into employee values(105,"Rosse","Female",25000,"Office Staff");
update employee set eName="Johndear" where eNo=101;
delete from employee where eNo=104;
select *from employee where eno=104;

ALTER TABLE `database`.`address` 
ADD CONSTRAINT `aID`
  FOREIGN KEY (`aID`)
  REFERENCES `database`.`employee` (`aID`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
  
  describe address;
  describe employee;
   select *from employee;
   
   delete from employee where eNo>=1001;
   
  insert into employee values(1000,"Roy","Male","Office Staff", 2001, "1234");
  insert into employee values(1001,"Rosse","Female","Office Staff", 2001, "1234");
  insert into employee values(1002,"Johns","Male","Office Staff", 2002, "1234");
  insert into employee values(1003,"Josh","Male","Office Staff", 2003, "1234");
  insert into employee values(1004,"Peter","Male","Office Staff", 2004, "1234");
  insert into employee values(1005,"Rinse","Female","Office Staff", 2005, "1234");
  insert into employee values(1006,"Suresh","Male","Engineer", 2006, "1234");
  
  insert into address values(2001, "Dunwoody","Atlanta", "GA", 30328);
  insert into address values(2002, "PeachStreet","Atlanta", "GA", 30320);
  insert into address values(2003, "Alphareta","Atlanta", "GA", 30300);
  insert into address values(2004, "Duluth","Atlanta", "GA", 30400);
  insert into address values(2005, "Dowtown","Atlanta", "GA", 30200);
  insert into address values(2006, "Midtown","Atlanta", "GA", 30600);
  
  select *from employee e, address a where e.aID=a.aID;
  insert into employee values(3000,"Maruthi","Male",35000,"Engineer", "1234", 2006);

  ALTER TABLE address DROP FOREIGN KEY addressID;
  
  ALTER TABLE employee ADD CONSTRAINT aID FOREIGN KEY (aID) REFERENCES address(aID)  ON DELETE NO ACTION  ON UPDATE NO ACTION;
  
  
  select *from address;
  select *from employee;
  select *from employee where eName=Ramesh and ePassword=1234;
  delete from employee where eNo>1000;
  
  select *from employee where eName="Roy" and ePassword="1234";
  
  update employee set  ePassword="1234" where eNo=1000;