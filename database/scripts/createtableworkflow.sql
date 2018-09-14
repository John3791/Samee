DROP TABLE Workflow IF EXISTS;

CREATE TABLE Workflow
(Id UUID not null primary key,
Name varchar(128) not null,
PackageId UUID not null);

Insert into Workflow values ('a4a95f26-ee78-4905-b88e-93b2d2afa6a9', 'SimpleFileCopy', 'c63446e0-6570-4f98-bb4b-0c2d07d29c40');
Insert into Workflow values ('604cd164-2fe7-4867-94b4-7d8f61ae6b3c', 'DecryptFileCopy', 'c63446e0-6570-4f98-bb4b-0c2d07d29c40');
