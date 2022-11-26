create table T_USERACCOUNT(
id INTEGER NOT NULL auto_increment,
username VARCHAR(50),
password VARCHAR(250),
firstname VARCHAR(50),
lastname VARCHAR(50),
email VARCHAR(50),
active INTEGER DEFAULT 0,
id_role INTEGER,
PRIMARY KEY (id)
);

create table T_ROLE(
id INTEGER NOT NULL auto_increment,
role VARCHAR(50),
name VARCHAR(50),
PRIMARY KEY (id)
);

create table T_PERMISSION(
  id INTEGER NOT NULL auto_increment,
  permission VARCHAR(50),
  description varchar(50),
  PRIMARY KEY (id)
);

create table T_ROLE_PERMISSION(
    id INTEGER NOT NULL auto_increment,
    id_role INTEGER,
    id_permission INTEGER,
    PRIMARY KEY (id)
);

create table T_COMMAND(
    id INTEGER NOT NULL auto_increment,
    name VARCHAR(50),
    description VARCHAR(500),
    PRIMARY KEY (id)
);