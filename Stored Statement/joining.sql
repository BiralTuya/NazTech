CREATE PROCEDURE joinn
AS
SELECT Employee_Sanzila.name, Employee_Sanzila2.Address
From Employee_Sanzila
INNER JOIN Employee_Sanzila2 on Employee_Sanzila.id=Employee_Sanzila2.PersonID;
GO

EXEC joinn;