INSERT INTO user_roles(user_id, role_id)
SELECT u.id, r.id
FROM users u
         CROSS JOIN roles r
WHERE NOT EXISTS(
    SELECT 1 FROM user_roles
    WHERE user_id=u.id AND role_id=r.id
)
    LIMIT 200;