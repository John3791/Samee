DROP TABLE Package IF EXISTS;

CREATE TABLE Package
(Id UUID not null primary key,
Name varchar(128) not null,
Description varchar(1024) null);

Insert into Package values ('de420727-1a29-4b58-8a94-67ba0a09590b', 'Root', 'Default package.');
Insert into Package values ('e5aff159-2f78-46a8-959b-de70482073c1', 'System', 'System workflows.');
Insert into Package values ('c63446e0-6570-4f98-bb4b-0c2d07d29c40', 'Sample', 'Sample package.');
