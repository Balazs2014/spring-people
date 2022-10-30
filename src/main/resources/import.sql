INSERT INTO people (name) VALUES ('John');
INSERT INTO people (name) VALUES ('Dave');
INSERT INTO people (name) VALUES ('Jim');
INSERT INTO people (name) VALUES ('Emily');

INSERT INTO address (city, street_house_number, type, people_id) VALUES ('London', '1363-1365 High Rd', 'permanent', 1);
INSERT INTO address (city, street_house_number, type, people_id) VALUES ('London', 'W Cromwell Rd', 'temporary', 1);
INSERT INTO address (city, street_house_number, type, people_id) VALUES ('Hemel Hempstead', '2 Fishery Rd', 'permanent', 2);
INSERT INTO address (city, street_house_number, type, people_id) VALUES ('Sheffield', '50 Wicker', 'permanent', 3);
INSERT INTO address (city, street_house_number, type, people_id) VALUES ('Sunderland', '1 Trimdon St', 'permanent', 4);
INSERT INTO address (city, street_house_number, type, people_id) VALUES ('Halifax', 'Salterhebble Hill', 'temporary', 4);

INSERT INTO contact (email, phone, address_id) VALUES ('john@example.com', '020 8445 7419', 1);
INSERT INTO contact (email, phone, address_id) VALUES ('johnny22@example.com', '07914 629854', 1);
INSERT INTO contact (email, phone, address_id) VALUES ('delhi@example.com', '020 8420 7474', 2);
INSERT INTO contact (email, phone, address_id) VALUES ('dave@example.com', '0141 649 3838', 3);
INSERT INTO contact (email, phone, address_id) VALUES ('lorem@example.com', '01828 686298', 3);
INSERT INTO contact (email, phone, address_id) VALUES ('ipsum@example.com', '01235 815992', 3);
INSERT INTO contact (email, phone, address_id) VALUES ('biszmillah@example.com', '023 9246 9459', 4);
INSERT INTO contact (email, phone, address_id) VALUES ('al-rahman@example.com', '01380 870067', 5);
INSERT INTO contact (email, phone, address_id) VALUES ('al-rahim@example.com', '01845 501417', 6);