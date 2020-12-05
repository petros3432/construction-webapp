

INSERT INTO Owner (Name , Surname , Email , AFM  , Address, Password , Telephone_number , Type_of_Property) VALUES ('Petros', 'Salepis' , 'psalepis@hotmail.com' , '111145306' ,  'Thessalonikis 14' , 'qwer1234', '2108053044' ,'MONOKATOIKIA' );
INSERT INTO Owner (Name , Surname , Email , AFM  , Address, Password , Telephone_number , Type_of_Property) VALUES ('Manolis', 'Souflakis' , 'msouflakis@gmail.com' , '123148359' , 'Trikalwn 27' , 'qwerty1234!' ,'2108053044' ,'MONOKATOIKIA' );
INSERT INTO Owner (Name , Surname , Email , AFM  , Address, Password , Telephone_number , Type_of_Property) VALUES ('Vangelis', 'Skoutelis' , 'vskoutelis@hotmail.com' , '305145603' , 'Viktorias 33' ,'passw0rd' , '2108047204' ,'MEZONETA' );
INSERT INTO Owner (Name , Surname , Email , AFM  , Address, Password , Telephone_number , Type_of_Property) VALUES ('Spyros', 'Spanos' , 's.spanos@hotmail.com' , '112257914' , 'Naupliotwn 5' , 'myPassword' , '2102435672' ,'POLIKATOIKIA' );
INSERT INTO Owner (Name , Surname , Email , AFM  , Address, Password , Telephone_number , Type_of_Property) VALUES ('Maria', 'Konstantinidi' , 'mkonstantinidi@gmail.com' , '345179835' , 'Kavalas 44' , '1995a' , '2105582209' ,'POLIKATOIKIA' );

INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair , Description ,Type_Of_Repair , Owner_id) VALUES ('Meroglou 1' , '150' , '2021-1-10 13:00:00' , 'DEFAULT' , 'First floor , The owner is not available on Mondays' , 'PAINTING' , '1');
INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair ,Type_Of_Repair , Owner_id) VALUES ('Kolokotroni 9' , '300' , '2020-12-15 10:00:00' , 'IN_PROGRESS'  , 'INSULATION' , '2');
INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair ,Type_Of_Repair , Owner_id) VALUES ('Thrakomakedonwn 35' , '200' , '2020-10-5 11:30:00' , 'COMPLETED'  , 'FRAMES' , '3');
INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair ,Type_Of_Repair , Owner_id) VALUES ('Mouratidou 12' , '170' , '2020-10-25 12:00:00' , 'COMPLETED'  , 'PLUMBING' , '4');
INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair ,Type_Of_Repair , Owner_id) VALUES ('Kiriakou 5' , '120' , '2021-1-5 9:00:00' , 'DEFAULT'  , 'ELECTRICAL' , '5');

INSERT INTO Admin (Email,Password) VALUES ('admin1@gmail.com' , 'adminadmin');
INSERT INTO Admin (Email,Password) VALUES ('admin2@gmail.com' , 'Admin2');
INSERT INTO Admin (Email,Password) VALUES ('admin3@gmail.com' , 'Admin3');
INSERT INTO Admin (Email,Password) VALUES ('admin4@gmail.com' , 'Admin4');