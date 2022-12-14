insert into T_PERMISSION(PERMISSION, DESCRIPTION) values ('INDEX_VIEW', 'Permission to VIEW the index page');
insert into T_PERMISSION(PERMISSION, DESCRIPTION) values ('DISTRIBUTII_VIEW', 'Permission to VIEW distributii page');
insert into T_PERMISSION(PERMISSION, DESCRIPTION) values ('ISTORIA_VIEW', 'Permission to VIEW istoria page');
insert into T_PERMISSION(PERMISSION, DESCRIPTION) values ('DESPRE_VIEW', 'Permission to view despre page');
insert into T_PERMISSION(PERMISSION, DESCRIPTION) values ('CHAT_VIEW', 'Permission to view chat page');
insert into T_PERMISSION(PERMISSION, DESCRIPTION) values ('PROFILE_VIEW', 'Permission to view profile page');
insert into T_PERMISSION(PERMISSION, DESCRIPTION) values ('MAIL_SEND', 'Permission to send mail');
insert into T_PERMISSION(PERMISSION, DESCRIPTION) values ('WIKI_VIEW', 'Permission to view wiki page');
insert into T_PERMISSION(PERMISSION, DESCRIPTION) values ('ADMIN_VIEW', 'Permission to view admin page');


insert into T_ROLE(ROLE, NAME) values ('ROLE_VIEWER', 'Cont utilizator');
insert into T_ROLE(ROLE, NAME) values ('ROLE_ADMIN', 'Cont administrator');

insert into T_ROLE_PERMISSION(ID_ROLE, ID_PERMISSION) values (2, 1);
insert into T_ROLE_PERMISSION(ID_ROLE, ID_PERMISSION) values (2, 2);
insert into T_ROLE_PERMISSION(ID_ROLE, ID_PERMISSION) values (2, 3);
insert into T_ROLE_PERMISSION(ID_ROLE, ID_PERMISSION) values (2, 4);
insert into T_ROLE_PERMISSION(ID_ROLE, ID_PERMISSION) values (2, 5);
insert into T_ROLE_PERMISSION(ID_ROLE, ID_PERMISSION) values (2, 6);
insert into T_ROLE_PERMISSION(ID_ROLE, ID_PERMISSION) values (2, 7);
insert into T_ROLE_PERMISSION(ID_ROLE, ID_PERMISSION) values (2, 8);
insert into T_ROLE_PERMISSION(ID_ROLE, ID_PERMISSION) values (2, 9);

insert into T_ROLE_PERMISSION(ID_ROLE, ID_PERMISSION) values (1, 1);
insert into T_ROLE_PERMISSION(ID_ROLE, ID_PERMISSION) values (1, 2);
insert into T_ROLE_PERMISSION(ID_ROLE, ID_PERMISSION) values (1, 3);
insert into T_ROLE_PERMISSION(ID_ROLE, ID_PERMISSION) values (1, 4);
insert into T_ROLE_PERMISSION(ID_ROLE, ID_PERMISSION) values (1, 5);
insert into T_ROLE_PERMISSION(ID_ROLE, ID_PERMISSION) values (1, 6);
insert into T_ROLE_PERMISSION(ID_ROLE, ID_PERMISSION) values (1, 7);
insert into T_ROLE_PERMISSION(ID_ROLE, ID_PERMISSION) values (1, 8);

insert into T_USERACCOUNT(USERNAME, PASSWORD,FIRSTNAME, LASTNAME, EMAIL, ACTIVE, ID_ROLE) values ('alexepure', '$2a$10$LgnAEmIysT2BXu4opLvApOsyJXnOurjASgNkfen.6Dt7u6mZ3tGTW', 'Alexandru', 'Epure','alexepure50@gmail.com',1,2);
insert into T_USERACCOUNT(USERNAME, PASSWORD,FIRSTNAME, LASTNAME, EMAIL, ACTIVE, ID_ROLE) values ('cristian13', '$2a$10$LgnAEmIysT2BXu4opLvApOsyJXnOurjASgNkfen.6Dt7u6mZ3tGTW', 'Cristian', 'Popescu','cristipopescu@gmail.com',1,1);

insert into T_COMMAND(NAME, DESCRIPTION) values ('pwd','pwd - (print working directory) listeaz?? calea absolut?? a directorului curent (direcotrul ??n care ne afl??m)');
insert into T_COMMAND(NAME, DESCRIPTION) values ('cd','cd /another/location - (change directory) schimb?? directorul curent ??n directorul primit ca paramentru; $ cd - N-am folosit niciun parametru deci se preia automat home dir (notat cu ~); $ pwd - Folosesc pwd pentru verificarea directorului curent');
insert into T_COMMAND(NAME, DESCRIPTION) values ('ls','ls /some/directory - (list) listeaz?? con??inutul directorului primit ca parametru');
insert into T_COMMAND(NAME, DESCRIPTION) values ('cat','Comanda cat este folosit?? pentru concatenare de ??iruri, fi??iere, etc. De exemplu putem vizualiza mai multe fi??iere ??n acela??i timp');
insert into T_COMMAND(NAME, DESCRIPTION) values ('cp','cp fi??ier_surs?? fi??ier_destina??ie ??? (copy) copiaz?? fi??ierul sau directorul indicat ??ntr-un nou loc');
insert into T_COMMAND(NAME, DESCRIPTION) values ('mv','mv fi??ier_surs?? fi??ier_destina??ie - (move) mut?? un fi??ier sau director ??n alt?? loca??ie dar ??n acela??i timp poate s?? ??i redenumeasc??.');
insert into T_COMMAND(NAME, DESCRIPTION) values ('rm','rm fi??ier - (remove) ??terge un fi??ier sau director');
insert into T_COMMAND(NAME, DESCRIPTION) values ('mkdir','mkdir nume_director - (make directory) creaz?? un director cu numele indicat');
insert into T_COMMAND(NAME, DESCRIPTION) values ('rmdir','rmdir nume_director - (remove directory) ??terge directorul indicat numai dac?? este gol Poate primi ca argument cale relativ?? sau absolut?? ??i are acelea??i op??iuni ca mkdir (-p, -v); diferen??a const?? ??n faptul c?? -p va ??terge directoarele p??rin??i.');
insert into T_COMMAND(NAME, DESCRIPTION) values ('touch','touch nume_fi??ier ??? creaz?? un fi??ier text cu numele indicat Acest?? comand?? este folosit?? numai ??n cazuri speciale; ??n mod normal fi??ierele sunt create de aplica??ii ??i nu ca atare (ex: openoffice sau desc??rcate de pe net). ??n cazul de fa???? o vom folosi pentru a crea un fi??ier exemplificativ.');
insert into T_COMMAND(NAME, DESCRIPTION) values ('dir','dir - Listeaza fisierele dintr-un director');
insert into T_COMMAND(NAME, DESCRIPTION) values ('echo','echo - Afiseaza o linie de text');
insert into T_COMMAND(NAME, DESCRIPTION) values ('chmod','chmod - Schimba modul unui fisier');
insert into T_COMMAND(NAME, DESCRIPTION) values ('chown','chown - Schimba proprietarul unui fisier');
insert into T_COMMAND(NAME, DESCRIPTION) values ('df','df - Afiseaza spatiul liber');
insert into T_COMMAND(NAME, DESCRIPTION) values ('grep','grep - Afiseaza o linie care intruneste o calitate');
insert into T_COMMAND(NAME, DESCRIPTION) values ('gzip','gzip - Arhivator gzip');
insert into T_COMMAND(NAME, DESCRIPTION) values ('gunzip','gunzip - Dezarhivator gzip');
insert into T_COMMAND(NAME, DESCRIPTION) values ('hostname','hostname - Afiseaza sau schimba hostname-ul sistemului');
insert into T_COMMAND(NAME, DESCRIPTION) values ('kill','kill - Omoara procesele');
insert into T_COMMAND(NAME, DESCRIPTION) values ('mount','mount - Monteaza un device');
insert into T_COMMAND(NAME, DESCRIPTION) values ('ps','ps - Raporteaza statutul proceselor');
insert into T_COMMAND(NAME, DESCRIPTION) values ('uname','uname - Afiseaza informatii despre sistem');
insert into T_COMMAND(NAME, DESCRIPTION) values ('whatis','whatis nume_comand?? - listeaz?? informa??ii despre rolul unei comenzi');
insert into T_COMMAND(NAME, DESCRIPTION) values ('info','info nume_comand?? - afiseaz?? o pagin?? informativ?? despre comanda primit?? ca parametru; navigarea se face cu s??ge??ile sus/jos ??i pageup/pagedown');
insert into T_COMMAND(NAME, DESCRIPTION) values ('man','man nume_comand?? - listeaz?? manualul pentru comanda primit?? ca parametru; navigarea se face cu s??ge??ile sus/jos ??i pageup/pagedown (space ??i enter echivaleaz?? cu pagedown ??i respectiv one line down)');