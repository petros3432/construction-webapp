

INSERT INTO Owner (Name , Surname , Email , AFM  , Address, Password , Telephone_number ,Type_of_User)  VALUES ('Petros', 'Salepis' , 'psalepis@hotmail.com' , '111145306' ,  'Thessalonikis 14' , 'qwer1234', '2108053044' , 'OWNER');
INSERT INTO Owner (Name , Surname , Email , AFM  , Address, Password , Telephone_number , Type_of_User) VALUES ('Manolis', 'Souflakis' , 'msouflakis@gmail.com' , '123148359' , 'Trikalwn 27' , 'qwerty1234' ,'2108053044' , 'OWNER');
INSERT INTO Owner (Name , Surname , Email , AFM  , Address, Password , Telephone_number ,Type_of_User)  VALUES ('Vangelis', 'Skoutelis' , 'vskoutelis@hotmail.com' , '305145603' , 'Viktorias 33' ,'passw0rd' , '2108047204' , 'OWNER');
INSERT INTO Owner (Name , Surname , Email , AFM  , Address, Password , Telephone_number ,Type_of_User)  VALUES ('Spyros', 'Spanos' , 's.spanos@hotmail.com' , '112257914' , 'Naupliotwn 5' , 'myPassword' , '2102435672' , 'OWNER');
INSERT INTO Owner (Name , Surname , Email , AFM  , Address, Password , Telephone_number ,Type_of_User)  VALUES ('Maria', 'Konstantinidi' , 'mkonstantinidi@gmail.com' , '345179835' , 'Kavalas 44' , '1995a' , '2105582209' , 'OWNER');
INSERT INTO Owner (Email,Password, Type_of_User) VALUES ('admin@gmail.com','adminadmin','ADMIN');



INSERT INTO Property (PropertyE9 , Address , Year , Type_of_Property , Afm , Owner_id)  VALUES ('makerwsei', 'Meroglou 1' , '2000' , 'MEZONETA' , '123148359' , '2');
INSERT INTO Property (PropertyE9 , Address , Year , Type_of_Property , Afm , Owner_id)  VALUES ('makerwsei', 'Kolokotroni 9' , '1991' , 'MONOKATOIKIA' ,'123148359', '2');
INSERT INTO Property (PropertyE9 , Address , Year , Type_of_Property , Afm , Owner_id)  VALUES ('makerwsei', 'Thrakomakedonwn 35' , '2010' , 'POLIKATOIKIA' , '112257914' , '4');
INSERT INTO Property (PropertyE9 , Address , Year , Type_of_Property , Afm , Owner_id)  VALUES ('makerwsei', 'Mouratidou 12' , '2001' , 'POLIKATOIKIA' , '112257914' , '4');
INSERT INTO Property (PropertyE9 , Address , Year , Type_of_Property , Afm , Owner_id)  VALUES ('makerwsei', 'Kiriakou 5' , '2002' , 'MEZONETA' , '111145306' , '1');







INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair , Description ,Type_Of_Repair , Property_id) VALUES ('Meroglou 1' , '150' , '2021-01-10 13:00:00' , 'DEFAULT' , 'First floor , The owner is not available on Mondays' , 'PAINTING' , '1');
INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair ,Type_Of_Repair , Property_id) VALUES ('Kolokotroni 9' , '300' , '2020-12-15 10:00:00' , 'IN_PROGRESS'  , 'INSULATION' , '2');
INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair ,Type_Of_Repair , Property_id) VALUES ('Thrakomakedonwn 35' , '200' , '2020-10-05 11:30:00' , 'COMPLETED'  , 'FRAMES' , '3');
INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair ,Type_Of_Repair , Property_id) VALUES ('Mouratidou 12' , '170' , '2020-10-25 12:00:00' , 'COMPLETED'  , 'PLUMBING' , '4');
INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair ,Type_Of_Repair , Property_id) VALUES ('Kiriakou 5' , '120' , '2021-01-05 9:00:00' , 'DEFAULT'  , 'ELECTRICAL' , '5');

