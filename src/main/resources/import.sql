

INSERT INTO Owner (Name , Surname , Email , AFM  , Address, Password , Telephone_number ,Role)  VALUES ('Petros', 'Salepis' , 'psalepis@hotmail.com' , '111145306' ,  'Thessalonikis 14' , '$2a$10$uG5hB.zk3bl2wJFxQciN1.d4.pD3j.mYGn1rE4NPhkcvaykl8rnxu', '2108053044' , 'USER');
INSERT INTO Owner (Name , Surname , Email , AFM  , Address, Password , Telephone_number , Role) VALUES ('Manolis', 'Souflakis' , 'msouflakis@gmail.com' , '111123456' , 'Trikalwn 27' , '$2a$10$X9s.Umsm0LLpH25LElToBODBaMox71nWVCXP3PqfUfCKkIEfOxUHW' ,'2108053044' , 'USER');
INSERT INTO Owner (Name , Surname , Email , AFM  , Address, Password , Telephone_number ,Role)  VALUES ('Vangelis', 'Skoutelis' , 'vskoutelis@hotmail.com' , '111398576' , 'Viktorias 33' ,'$2a$10$IArsUE6A6m39QfhHtNRBrerQV.WoxlVFW0M21scM65nwMOuutcdBC' , '2108047204' , 'USER');
INSERT INTO Owner (Name , Surname , Email , AFM  , Address, Password , Telephone_number ,Role)  VALUES ('Spyros', 'Spanos' , 's.spanos@hotmail.com' , '112257914' , 'Naupliotwn 5' , '$2a$10$d6T8V0xbxCPB/lbpivFT7eEKYmPGtiPTYipwhQlwR.oooRn2GRc1W' , '2102435672' , 'USER');
INSERT INTO Owner (Name , Surname , Email , AFM  , Address, Password , Telephone_number ,Role)  VALUES ('Maria', 'Konstantinidi' , 'mkonstantinidi@gmail.com' , '111149857' , 'Kavalas 44' , '$2a$10$JVM3nFehVZ4s4xSIOFvqf.wdfScAoYuqTuN0734g1vc3xdhpdgykG' , '2105582209' , 'USER');
INSERT INTO Owner (Email,Password, Role) VALUES ('admin@gmail.com','$2a$10$b1WINJ69K1RdBqGofvNbGOSlm8doDf1hEPDy69VkUap/JPyBXN2Em','ADMIN');



INSERT INTO Property (PropertyE9 , Address , Year , Type_of_Property , Afm , Owner_id)  VALUES ('85634529612', 'Meroglou 1' , '2000' , 'DUPLEX' , '111145306' , '1');
INSERT INTO Property (PropertyE9 , Address , Year , Type_of_Property , Afm , Owner_id)  VALUES ('13264590834', 'Kolokotroni 9' , '1991' , 'APARTMENT' ,'111123456', '2');
INSERT INTO Property (PropertyE9 , Address , Year , Type_of_Property , Afm , Owner_id)  VALUES ('18392530598', 'Thrakomakedonwn 35' , '2010' , 'CONDO' , '111398576' , '3');
INSERT INTO Property (PropertyE9 , Address , Year , Type_of_Property , Afm , Owner_id)  VALUES ('10293847560', 'Mouratidou 12' , '2001' , 'CONDO' , '112257914' , '4');
INSERT INTO Property (PropertyE9 , Address , Year , Type_of_Property , Afm , Owner_id)  VALUES ('14253748593', 'Kiriakou 5' , '2002' , 'DUPLEX' , '111145306' , '1');







INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair , Description ,Type_Of_Repair , Property_id) VALUES ('Meroglou 1' , '150' , '2021-01-10 13:00:00' , 'WAITING' , 'The painting color is pantone with code 3945 c ' , 'PAINTING' , '1');
INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair, Description ,Type_Of_Repair , Property_id) VALUES ('Meroglou 1' , '40' , '2020-12-22 10:00:00' , 'ONGOING'  ,'We will need to go at least 3 people' , 'FRAMES' , '1');
INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair, Description ,Type_Of_Repair , Property_id) VALUES ('Meroglou 1' , '50' , '2020-12-22 10:00:00' , 'ONGOING'  ,'The painting color for the room is pink with code 8934 p' , 'PAINTING' , '1');
INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair, Description ,Type_Of_Repair , Property_id) VALUES ('Kolokotroni 9' , '300' , '2020-12-24 10:00:00' , 'WAITING', 'We will need to be quiet during the afternoon'  , 'INSULATION' , '2');
INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair, Description ,Type_Of_Repair , Property_id) VALUES ('Kolokotroni 9' , '80' , '2021-01-15 10:00:00' , 'WAITING', ' The problem is in the kitchen '  , 'PLUMBING' , '2');
INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair ,Type_Of_Repair , Property_id) VALUES ('Thrakomakedonwn 35' , '200' , '2020-12-26 11:30:00' , 'WAITING'  , 'FRAMES' , '3');
INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair,Description ,Type_Of_Repair , Property_id) VALUES ('Thrakomakedonwn 35' , '25' , '2020-12-22 11:30:00' , 'ONGOING'  , 'The property is outside of the city center'  , 'ELECTRICAL' , '3');
INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair,Description ,Type_Of_Repair , Property_id) VALUES ('Mouratidou 12' , '170' , '2020-12-27 12:00:00' , 'WAITING', 'The problem is in the bathroom'  , 'PLUMBING' , '4');
INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair,Description ,Type_Of_Repair , Property_id) VALUES ('Mouratidou 12' , '30' , '2020-11-23 12:00:00' , 'COMPLETED' , ' We will need to change the front door '  , 'FRAMES' , '4');
INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair,Description ,Type_Of_Repair , Property_id) VALUES ('Kiriakou 5' , '120' , '2020-12-22 9:00:00' , 'ONGOING', 'The property has no electricity '  , 'ELECTRICAL' , '5');
INSERT INTO Repair (Address , Cost , Scheduled_Date_Of_Repair , State_Of_Repair ,Type_Of_Repair , Property_id) VALUES ('Kiriakou 5' , '50' , '2021-03-06 9:00:00' , 'WAITING'  , 'INSULATION' , '5');


