create database if not exists dbexercice;

use dbexercice;

create table if not exists ELEVE (
    id_eleve int AUTO_INCREMENT PRIMARY key,
    nom VARCHAR(30),
    prenom VARCHAR(30),
    adresse VARCHAR(30),
    cp VARCHAR(30),
    ville VARCHAR(30)
);

create table if not exists Moniteur (
    id_moniteur int AUTO_INCREMENT PRIMARY key,
    nom_moniteur VARCHAR(30),
    prenom_moniteur VARCHAR(30),
    date_naissance DATE,
    sexe VARCHAR(30)
);

create table if not exists Voiture (
    num_voiture int AUTO_INCREMENT PRIMARY key,
    modele VARCHAR(30),
    couleur VARCHAR(30),
    date_mise_circulation DATE
);

create table if not exists Lecon (
    id_lecon int AUTO_INCREMENT PRIMARY key,
    id_moniteur int,
    id_eleve int,
    num_voiture int,
    date_lecon DATETIME,
    constraint fk_moniteur_lecon FOREIGN KEY (id_moniteur) REFERENCES moniteur(id_moniteur),
    constraint fk_eleve_lecon FOREIGN KEY (id_eleve) REFERENCES moniteur(id_eleve),
    constraint fk_voiture_lecon FOREIGN KEY (num_voiture) REFERENCES moniteur(num_voiture)
);

insert into moniteur values (null, 'Rémy','Beauregard','1977-6-12','H');
insert into moniteur values (null, 'Pierre','Bosset','1980-11-20','H');
insert into moniteur values (null, 'Brian','Burdekin','1990-5-1','H');
insert into moniteur values (null, 'Karen','Cohl','1983-4-10','F');
insert into moniteur values (null, 'François','Crépeau','1985-2-10','H');
insert into moniteur values (null, 'Neil','Edwards','1988-1-17','H');
insert into moniteur values (null, 'Pearl','Eliadis','1992-9-19','F');
insert into moniteur values (null, 'Katherine','Hewson','1987-7-15','F');
insert into moniteur values (null, 'Martha','Jackman','1974-3-28','F');
insert into moniteur values (null, 'Harish','Jain','1964-2-22','H');

insert into eleve values (null,'AIT OUGRRAM','CHAMA','boujarah','93000','Tetouan');
insert into eleve values (null,'ALAOUI','MOHAMED AMIR','Taqadom','10000','Rabat');
insert into eleve values (null,'ATIB','NADA','mdina lkdima','30000','Fes');
insert into eleve values (null,'CHAWAD','ISMAIL','lot oum kaltoun','93000','Tetouan');
insert into eleve values (null,'EL HANI','LINA','souk l7ed','80000','Agadir');
insert into eleve values (null,'EL KRICHE','SAFAE','mdina lkdima','30000','Fes');
insert into eleve values (null,'FADIL','INES','center ville','80000','Agadir');
insert into eleve values (null,'HAIDARA','MERIEM','wilaya','93000','Tetouan');
insert into eleve values (null,'KABI','ZINEB','centre ville','80000','Agadir');
insert into eleve values (null,'KHALIL','KHOLOUD','centre ville','30000','Fes');
insert into eleve values (null,'MAHRAZ','LINA','mhanech','93000','Tetouan');
insert into eleve values (null,'OUZAHRA','AHMED','centre ville','80000','Agadir');
insert into eleve values (null,'MOUSTAFID','MALAK','Agdal','10000','Rabat');
insert into eleve values (null,'SAIDI','KAWTAR','El oulfa','20390','Casablanca');
insert into eleve values (null,'TAHIR','AYA','Ain sebaa','20390','Casablanca');
insert into eleve values (null,'TCHIKOUTE','ALAE','Oasis','20390','Casablanca');

insert into voiture values (null, 'Peugoet 206','rouge','2006-04-03');
insert into voiture values (null, 'Peugoet 206','vert','2007-11-05');
insert into voiture values (null, 'Dacia logan','bleu','2012-05-07');
insert into voiture values (null, 'Dacia sendero','gris','2015-06-02');
insert into voiture values (null, 'Golf polo','gris','2016-04-03');

insert into lecon values (null,1,1,1,'2018-05-01 10:00:00');
insert into lecon values (null,1,2,1,'2018-05-01 10:30:00');
insert into lecon values (null,2,1,1,'2018-05-01 11:00:00');
insert into lecon values (null,1,1,3,'2018-05-01 12:00:00');
insert into lecon values (null,1,4,1,'2018-05-01 11:30:00');
