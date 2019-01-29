CREATE PROCEDURE vardat2
AS
INSERT into Employee_Sanzila (id,name,address,phone,email,age) VALUES ('1','ami','mirpur','1234','sanz','24');

GO

CREATE PROCEDURE Del1
AS
DELETE from Employee_Sanzila WHERE name='ami';
GO

CREATE PROCEDURE Updt1
AS
UPDATE Employee_Sanzila
SET name='tuya', address='mirpur11'
WHERE name='ami'
GO

/*EXEC Del1;
EXEC vardat2;
EXEC Updt1;*/