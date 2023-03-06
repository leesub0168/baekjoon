-- 코드를 입력하세요
SELECT B.MEMBER_NAME, A.REVIEW_TEXT, DATE_FORMAT(A.REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
FROM REST_REVIEW A
    INNER JOIN MEMBER_PROFILE B ON A.MEMBER_ID = B.MEMBER_ID
        AND B.MEMBER_ID IN (
            SELECT X.MEMBER_ID
            FROM REST_REVIEW X
            GROUP BY X.MEMBER_ID
            HAVING COUNT(X.MEMBER_ID) = (
                SELECT MAX(Z.CNT)
                FROM (SELECT COUNT(Q.MEMBER_ID) AS CNT
                        FROM REST_REVIEW Q
                        GROUP BY Q.MEMBER_ID
                )Z
            )
        )
ORDER BY A.REVIEW_DATE, A.REVIEW_TEXT;