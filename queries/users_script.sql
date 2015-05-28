CREATE EXTENSION "uuid-ossp";

INSERT INTO custom_user(uuid, created_at, created_by, version, password, user_name)
VALUES (LOWER(
             REPLACE(
                 CAST(uuid_generate_v1() As varchar(50))
                 , '-','')
         ),current_timestamp,'INITIAL',0,'$2a$10$bHqNKan8/T4Lw69cKXLMJuEhmlr17yE.8IVV/rRdSFCWUXznj6R3e','geo');

INSERT INTO custom_user(uuid, created_at, created_by, version, password, user_name)
VALUES (LOWER(
             REPLACE(
                 CAST(uuid_generate_v1() As varchar(50))
                 , '-','')
         ),current_timestamp,'INITIAL',0,'$2a$10$bHqNKan8/T4Lw69cKXLMJuEhmlr17yE.8IVV/rRdSFCWUXznj6R3e','paul');

INSERT INTO custom_user(uuid, created_at, created_by, version, password, user_name)
VALUES (LOWER(
             REPLACE(
                 CAST(uuid_generate_v1() As varchar(50))
                 , '-','')
         ),current_timestamp,'INITIAL',0,'$2a$10$bHqNKan8/T4Lw69cKXLMJuEhmlr17yE.8IVV/rRdSFCWUXznj6R3e','user1');

INSERT INTO custom_user(uuid, created_at, created_by, version, password, user_name)
VALUES (LOWER(
             REPLACE(
                 CAST(uuid_generate_v1() As varchar(50))
                 , '-','')
         ),current_timestamp,'INITIAL',0,'$2a$10$bHqNKan8/T4Lw69cKXLMJuEhmlr17yE.8IVV/rRdSFCWUXznj6R3e','user2');

INSERT INTO custom_user(uuid, created_at, created_by, version, password, user_name)
VALUES (LOWER(
             REPLACE(
                 CAST(uuid_generate_v1() As varchar(50))
                 , '-','')
         ),current_timestamp,'INITIAL',0,'$2a$10$bHqNKan8/T4Lw69cKXLMJuEhmlr17yE.8IVV/rRdSFCWUXznj6R3e','user3');

INSERT INTO custom_user(uuid, created_at, created_by, version, password, user_name)
VALUES (LOWER(
             REPLACE(
                 CAST(uuid_generate_v1() As varchar(50))
                 , '-','')
         ),current_timestamp,'INITIAL',0,'$2a$10$bHqNKan8/T4Lw69cKXLMJuEhmlr17yE.8IVV/rRdSFCWUXznj6R3e','user4');

INSERT INTO custom_user(uuid, created_at, created_by, version, password, user_name)
VALUES (LOWER(
             REPLACE(
                 CAST(uuid_generate_v1() As varchar(50))
                 , '-','')
         ),current_timestamp,'INITIAL',0,'$2a$10$bHqNKan8/T4Lw69cKXLMJuEhmlr17yE.8IVV/rRdSFCWUXznj6R3e','user5');

INSERT INTO custom_user(uuid, created_at, created_by, version, password, user_name)
VALUES (LOWER(
             REPLACE(
                 CAST(uuid_generate_v1() As varchar(50))
                 , '-','')
         ),current_timestamp,'INITIAL',0,'$2a$10$bHqNKan8/T4Lw69cKXLMJuEhmlr17yE.8IVV/rRdSFCWUXznj6R3e','user6');

INSERT INTO custom_user(uuid, created_at, created_by, version, password, user_name)
VALUES (LOWER(
             REPLACE(
                 CAST(uuid_generate_v1() As varchar(50))
                 , '-','')
         ),current_timestamp,'INITIAL',0,'$2a$10$bHqNKan8/T4Lw69cKXLMJuEhmlr17yE.8IVV/rRdSFCWUXznj6R3e','user7');

INSERT INTO custom_user(uuid, created_at, created_by, version, password, user_name)
VALUES (LOWER(
             REPLACE(
                 CAST(uuid_generate_v1() As varchar(50))
                 , '-','')
         ),current_timestamp,'INITIAL',0,'$2a$10$bHqNKan8/T4Lw69cKXLMJuEhmlr17yE.8IVV/rRdSFCWUXznj6R3e','user8');

INSERT INTO custom_user(uuid, created_at, created_by, version, password, user_name)
VALUES (LOWER(
             REPLACE(
                 CAST(uuid_generate_v1() As varchar(50))
                 , '-','')
         ),current_timestamp,'INITIAL',0,'$2a$10$bHqNKan8/T4Lw69cKXLMJuEhmlr17yE.8IVV/rRdSFCWUXznj6R3e','user9');



