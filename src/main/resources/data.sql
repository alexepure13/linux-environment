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

insert into T_COMMAND(NAME, DESCRIPTION) values ('pwd','pwd - (print working directory) listează calea absolută a directorului curent (direcotrul în care ne aflăm)');
insert into T_COMMAND(NAME, DESCRIPTION) values ('cd','cd /another/location - (change directory) schimbă directorul curent în directorul primit ca paramentru; $ cd - N-am folosit niciun parametru deci se preia automat home dir (notat cu ~); $ pwd - Folosesc pwd pentru verificarea directorului curent');
insert into T_COMMAND(NAME, DESCRIPTION) values ('ls','ls /some/directory - (list) listează conţinutul directorului primit ca parametru');
insert into T_COMMAND(NAME, DESCRIPTION) values ('cat','Comanda cat este folosită pentru concatenare de șiruri, fișiere, etc. De exemplu putem vizualiza mai multe fișiere în același timp');
insert into T_COMMAND(NAME, DESCRIPTION) values ('cp','cp fişier_sursă fişier_destinaţie – (copy) copiază fişierul sau directorul indicat într-un nou loc');
insert into T_COMMAND(NAME, DESCRIPTION) values ('mv','mv fişier_sursă fişier_destinaţie - (move) mută un fişier sau director în altă locaţie dar în acelaşi timp poate să şi redenumească.');
insert into T_COMMAND(NAME, DESCRIPTION) values ('rm','rm fişier - (remove) şterge un fişier sau director');
insert into T_COMMAND(NAME, DESCRIPTION) values ('mkdir','mkdir nume_director - (make directory) crează un director cu numele indicat');
insert into T_COMMAND(NAME, DESCRIPTION) values ('rmdir','rmdir nume_director - (remove directory) şterge directorul indicat numai dacă este gol Poate primi ca argument cale relativă sau absolută şi are aceleaşi opţiuni ca mkdir (-p, -v); diferenţa constă în faptul că -p va şterge directoarele părinţi.');
insert into T_COMMAND(NAME, DESCRIPTION) values ('touch','touch nume_fişier – crează un fişier text cu numele indicat Acestă comandă este folosită numai în cazuri speciale; în mod normal fişierele sunt create de aplicaţii şi nu ca atare (ex: openoffice sau descărcate de pe net). În cazul de faţă o vom folosi pentru a crea un fişier exemplificativ.');
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
insert into T_COMMAND(NAME, DESCRIPTION) values ('whatis','whatis nume_comandă - listează informaţii despre rolul unei comenzi');
insert into T_COMMAND(NAME, DESCRIPTION) values ('info','info nume_comandă - afisează o pagină informativă despre comanda primită ca parametru; navigarea se face cu săgeţile sus/jos şi pageup/pagedown');
insert into T_COMMAND(NAME, DESCRIPTION) values ('man','man nume_comandă - listează manualul pentru comanda primită ca parametru; navigarea se face cu săgeţile sus/jos şi pageup/pagedown (space şi enter echivalează cu pagedown şi respectiv one line down)');