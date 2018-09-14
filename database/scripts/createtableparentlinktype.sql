CREATE TABLE ParentLinkType
(ParentLinkTypeCd char(4) not null primary key,
Description varchar (128) not null)

INSERT INTO ParentLinkType values ('OWNR', 'Owner - Package is owned by the parent.')
INSERT INTO ParentLinkType values ('IMPT', 'Import - Package is imported into the parent.')

SELECT * from ParentLinkType