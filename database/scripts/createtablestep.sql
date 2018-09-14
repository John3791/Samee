DROP TABLE Step IF EXISTS;

CREATE TABLE Step
(Id UUID not null primary key,
Name varchar(128) not null,
SequenceNumber int not null,
StepTypeCd char (4) not null,
WorkflowId UUID not null,
FOREIGN KEY (WorkflowId) references Workflow(Id));

Insert into Step values ('4673feab-dd96-4d6c-baaa-5be488fd7f8c', 'FTP GET', 1, 'XXXX', 'a4a95f26-ee78-4905-b88e-93b2d2afa6a9');
Insert into Step values ('b3bd1392-b042-408f-b6e9-d21376647592', 'FTP PUT', 2, 'XXXX', 'a4a95f26-ee78-4905-b88e-93b2d2afa6a9');
Insert into Step values ('dd1af302-f71a-4e76-812d-978368e6a4ab', 'FTP GET', 1, 'XXXX', '604cd164-2fe7-4867-94b4-7d8f61ae6b3c');
Insert into Step values ('38192c44-d2da-4ac8-8c59-7dc882b73432', 'DECRYPT', 2, 'XXXX', '604cd164-2fe7-4867-94b4-7d8f61ae6b3c');
Insert into Step values ('8b71295e-8458-4b58-abe8-4edfb1cd5d3f', 'FTP PUT', 2, 'XXXX', '604cd164-2fe7-4867-94b4-7d8f61ae6b3c');
