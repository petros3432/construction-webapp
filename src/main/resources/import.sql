

INSERT INTO Owner (Name , Surname , Email , AFM  , Address, Password , Telephone_number ,Role)  VALUES ('Petros', 'Salepis' , 'psalepis@hotmail.com' , '111145306' ,  'Thessalonikis 14' , '$2a$10$iaXOGVfyLggjojNkEDWP2.dH/9Yd9bLc7P0bvsZpJu86naVVqnH7y', '2108053044' , 'USER');
INSERT INTO Owner (Name , Surname , Email , AFM  , Address, Password , Telephone_number , Role) VALUES ('Manolis', 'Souflakis' , 'msouflakis@gmail.com' , '123148359' , 'Trikalwn 27' , '$2a$10$ibq9oSUhJxxsrGia6iq3A.EG.NJEzMP3E4UxxiSpVIctbqMlIaobu' ,'2108053044' , 'USER');
INSERT INTO Owner (Name , Surname , Email , AFM  , Address, Password , Telephone_number ,Role)  VALUES ('Vangelis', 'Skoutelis' , 'vskoutelis@hotmail.com' , '305145603' , 'Viktorias 33' ,'$2a$10$kWvLtqciNopqWWVhzPmY3ucJ8F9qVDIk41yB1bir0oeZHVe7ZtGUe' , '2108047204' , 'USER');
INSERT INTO Owner (Name , Surname , Email , AFM  , Address, Password , Telephone_number ,Role)  VALUES ('Spyros', 'Spanos' , 's.spanos@hotmail.com' , '112257914' , 'Naupliotwn 5' , '$2a$10$Wqs5DdF5H.wjMAfjsnw7DucYM0LbUvcCzBfEZRtE1yerS9BnleSK6' , '2102435672' , 'USER');
INSERT INTO Owner (Name , Surname , Email , AFM  , Address, Password , Telephone_number ,Role)  VALUES ('Maria', 'Konstantinidi' , 'mkonstantinidi@gmail.com' , '345179835' , 'Kavalas 44' , '$2a$10$a4P.cqv10oai8DM8UgzYUeAlM5cMPubbASAXTDMYwYIoMmMSjbVAC' , '2105582209' , 'USER');
INSERT INTO Owner (Email,Password, Role) VALUES ('admin@gmail.com','$2a$10$VjOsVlCvCkF6g8dPvBWZqu2o6oZfPN2DjWI0hFnT0H8whJXXZ.JKC','ADMIN');



INSERT INTO Property (PropertyE9 , Address , Year , Type_of_Property , Afm , Owner_id)  VALUES ('makerwsei1', 'Meroglou 1' , '2000' , 'MEZONETA' , '123148359' , '2');
INSERT INTO Property (PropertyE9 , Address , Year , Type_of_Property , Afm , Owner_id)  VALUES ('makerwsei2', 'Kolokotroni 9' , '1991' , 'MONOKATOIKIA' ,'123148359', '2');
INSERT INTO Property (PropertyE9 , Address , Year , Type_of_Property , Afm , Owner_id)  VALUES ('makerwsei3', 'Thrakomakedonwn 35' , '2010' , 'POLIKATOIKIA' , '112257914' , '4');
INSERT INTO Property (PropertyE9 , Address , Year , Type_of_Property , Afm , Owner_id)  VALUES ('makerwsei4', 'Mouratidou 12' , '2001' , 'POLIKATOIKIA' , '112257914' , '4');
INSERT INTO Property (PropertyE9 , Address , Year , Type_of_Property , Afm , Owner_id)  VALUES ('makerwsei5', 'Kiriakou 5' , '2002' , 'MEZONETA' , '111145306' , '1');







INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair , Description ,Type_Of_Repair , Property_id) VALUES ('Meroglou 1' , '150' , '2021-01-10 13:00:00' , 'WAITING' , 'First floor , The owner is not available on Mondays' , 'PAINTING' , '1');
INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair ,Type_Of_Repair , Property_id) VALUES ('Kolokotroni 9' , '300' , '2020-12-15 10:00:00' , 'ONGOING'  , 'INSULATION' , '2');
INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair ,Type_Of_Repair , Property_id) VALUES ('Thrakomakedonwn 35' , '200' , '2020-10-05 11:30:00' , 'COMPLETED'  , 'FRAMES' , '3');
INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair ,Type_Of_Repair , Property_id) VALUES ('Mouratidou 12' , '170' , '2020-10-25 12:00:00' , 'COMPLETED'  , 'PLUMBING' , '4');
INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair ,Type_Of_Repair , Property_id) VALUES ('Kiriakou 5' , '120' , '2021-01-05 9:00:00' , 'WAITING'  , 'ELECTRICAL' , '5');

