DROP TABLE PackageWorkflow IF EXISTS;

CREATE TABLE PackageWorkflow
(PackageId UUID not null,
WorkflowId UUID not null,
primary key (PackageId, WorkflowId));

INSERT INTO PackageWorkflow values ('c63446e0-6570-4f98-bb4b-0c2d07d29c40', 'a4a95f26-ee78-4905-b88e-93b2d2afa6a9');


