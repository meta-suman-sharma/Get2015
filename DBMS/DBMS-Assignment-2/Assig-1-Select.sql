

USE lis;

/*1. Display all the columns of members table*/
SELECT * FROM member;

/*2. Display member_nm, member_id and category columns of members table*/
SELECT member_id,member_name,category FROM member;

/*3. Display member_nm, member_id and category columns of members table where catagory is teacher*/
SELECT member_name,member_id,category FROM member WHERE category='F';

/*4. Display various catagories of members*/
SELECT DISTINCT category from member;

/*5. Display member name and there catagory in the descending order of their name*/
SELECT member_name,category 
FROM member 
ORDER BY  member_name DESC; 

/*6. Display all the titles, subjects and publishers*/
SELECT title_id,title_name,s.subject_name,p.publisher_name 
FROM titles,subjects s,publishers p 
WHERE titles.subject_id=s.subject_id 
AND titles.publisher_id=p.publisher_id;

/*7. Display no of members in each catagory along with their catagory*/
SELECT category,COUNT(category) 
FROM member GROUP BY category;

/*8. Display the name of those members who belong to the catagory as to which member "SUMAN"*/
SELECT m1.member_name,m1.category FROM member m1 
LEFT JOIN member m2 
ON m1.category= m2.category WHERE m2.member_name='SUMAN';

/*9 Display the status of return book and if not returned then place blank*/
SELECT i.issue_date,i.accession_no,i.member_id,r.return_date
FROM book_issue i LEFT JOIN book_return r
ON i.accession_no=r.accession_no;
