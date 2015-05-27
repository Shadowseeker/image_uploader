SELECT iu.username
FROM image_user iu
WHERE iu.uuid IN (WITH RECURSIVE friend_suggestions(image_user_uuid,friends_uuid) AS
                    (SELECT iuf.image_user_uuid,
                            iuf.friends_uuid
                     FROM image_user_friends iuf
                     WHERE iuf.image_user_uuid = '6223ca06753e4d4c9407491abad0fe54'
                     UNION SELECT f.image_user_uuid,
                                  iuf.friends_uuid
                     FROM friend_suggestions f,
                          image_user_friends iuf
                     WHERE iuf.image_user_uuid = f.friends_uuid
                       AND f.image_user_uuid != iuf.friends_uuid )
                  SELECT friends_uuid
                  FROM friend_suggestions
                  EXCEPT
                  SELECT iuf.friends_uuid
                  FROM image_user_friends iuf
                  WHERE iuf.image_user_uuid = '6223ca06753e4d4c9407491abad0fe54') ;
