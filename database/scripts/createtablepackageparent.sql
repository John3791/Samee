DROP TABLE PackageParent IF EXISTS;

CREATE TABLE PackageParent
(PackageLinkTypeCd char(4) not null,
ParentId UUID not null,
PackageId UUID not null,
primary key (ParentId, PackageId));

INSERT INTO PackageParent values ('OWNR', 'de420727-1a29-4b58-8a94-67ba0a09590b', 'e5aff159-2f78-46a8-959b-de70482073c1');


