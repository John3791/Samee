DROP TABLE Package IF EXISTS;

CREATE TABLE Package
(Id UUID not null primary key,
Name varchar(128) not null,
ShortDescription varchar(128) null,
LongDescription varchar(1024) null,
ParentId UUID null,
FOREIGN KEY(ParentId) REFERENCES Package(Id));

Insert into Package values ('de420727-1a29-4b58-8a94-67ba0a09590b', 'Root', 'Default package.', 'Default package.', null);
Insert into Package values ('e5aff159-2f78-46a8-959b-de70482073c1', 'System', 'System workflows.', 'System workflows.', null);
Insert into Package values ('c63446e0-6570-4f98-bb4b-0c2d07d29c40', 'Sample', 'Sample package.', 'Sample package containing child packages, workflows, and profiles to demonstrate the capabilities of Samee.', null);
Insert into Package values ('c27da2f6-f52d-4858-b5fe-2f5ceb65b0e6', 'SampleA', 'Sample package.', 'Sample.SampleA', 'c63446e0-6570-4f98-bb4b-0c2d07d29c40');
Insert into Package values ('5e3aa44e-57a9-45d7-9062-000957296ebe', 'SampleB', 'Sample package.', 'Sample.SampleB', 'c63446e0-6570-4f98-bb4b-0c2d07d29c40');
Insert into Package values ('9944c096-34d0-4dbe-bfaf-db58fa6e6c24', 'SampleC', 'Sample package.', 'Sample.SampleC', 'c63446e0-6570-4f98-bb4b-0c2d07d29c40');
Insert into Package values ('8fc07fb0-cfdc-4da0-a389-5068e43b3c42', 'ChildA', 'Sample package.', 'Sample.SampleA.ChildA', 'c27da2f6-f52d-4858-b5fe-2f5ceb65b0e6');
Insert into Package values ('28daf434-3ca2-4515-b1ee-15a5fbe93118', 'ChildB', 'Sample package.', 'Sample.SampleA.ChildB', 'c27da2f6-f52d-4858-b5fe-2f5ceb65b0e6');
Insert into Package values ('21ea9928-bf01-4134-838d-e9a73efe29db', 'ChildA', 'Sample package.', 'Sample.SampleB.ChildA', '5e3aa44e-57a9-45d7-9062-000957296ebe');
Insert into Package values ('a35ad94e-cee4-4242-9ef6-5d9f28d3ae23', 'ChildB', 'Sample package.', 'Sample.SampleB.ChildB', '5e3aa44e-57a9-45d7-9062-000957296ebe');
Insert into Package values ('c92beee9-3212-4a04-9b1b-b456e4edd7f1', 'GrandchildA', 'Sample package.', 'Sample.SampleA.ChildA.GrandchildA.', '8fc07fb0-cfdc-4da0-a389-5068e43b3c42');
Insert into Package values ('020e7383-e55a-4c9c-b171-7e83dc9d7335', 'GrandchildB', 'Sample package.', 'Sample.SampleA.ChildA.GrandchildB', '8fc07fb0-cfdc-4da0-a389-5068e43b3c42');
