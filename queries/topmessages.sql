WITH count_by_day as
	(SELECT date_part('day',created_at) as day,m.user_uuid as poster,count(uuid) as message_count
	  FROM message m
	  WHERE date_part('month',created_at) = date_part('month',current_timestamp)
	  GROUP BY day,poster)
SELECT day,iu.username,message_count,rank() over (PARTITION BY day ORDER BY message_count DESC) as ranknr 
FROM count_by_day,image_user iu
WHERE iu.uuid = poster
ORDER BY day desc ;
  