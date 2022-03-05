--Tạo database
create database Shopping

Alter table product
add foreign key (categoryid) references Category(id)
--Tạo bảng Category
create table Category (
	id INT,
	name VARCHAR(50)
);
insert into Category (id, name) values (1, 'Giường');
insert into Category (id, name) values (2, 'Tu quan ao');
insert into Category (id, name) values (3, 'Ban trang diem');
insert into Category (id, name) values (4, 'Tu giay');
insert into Category (id, name) values (5, 'Ke TV');
insert into Category (id, name) values (6, 'Ban sofa');
insert into Category (id, name) values (7, 'Ghe sofa');
insert into Category (id, name) values (8, 'Ban lam viec');
insert into Category (id, name) values (9, 'Ke sach');
insert into Category (id, name) values (10, 'Ghe lam viec');

--Tạo bảng Product
create table Product (
	id INT,
	name VARCHAR(50),
	quantity INT,
	price DECIMAL(4,1),
	description VARCHAR(50),
	imageUrl VARCHAR(50),
	create_date DATE,
	Categoryid INT
);

--Giường
insert into Product (id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (2, 'abc', 20, 7.800, 'Abrasion, unspecified ankle', 'E:\Github\JAVA\[PRJ301]\AssignPRJ\image\giuong1.jpg', '2021-03-05', 1);
insert into Product (id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (1, 'Giường ngủ bệt', 69, 34, 'Serous choroidal detachment, right eye', 'E:\Github\JAVA\[PRJ301]\AssignPRJ\image\giuong2.jpg', '2021-07-17', 1);
insert into Product (id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (3, 'Giường Nhật bằng gỗ thiết kế tiện lợi', 69, 22, 'abc', 'E:\Github\JAVA\[PRJ301]\AssignPRJ\image\giuong3.jpg', '2021-05-25', 1);
insert into Product (id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (4, 'Giường ngủ Nhật bằng gỗ thiết kế hiện đại', 94, 69, 'Corrosion of third degree of right toe(s) (nail)', 'E:\Github\JAVA\[PRJ301]\AssignPRJ\image\giuong4.jpg', '2021-09-23', 1);
insert into Product (id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (5, 'Giường ngủ đẹp thiết kế sang trọng', 58, 44, 'Antepartum hemorrhage, unspecified', 'E:\Github\JAVA\[PRJ301]\AssignPRJ\image\giuong5.jpg', '2021-09-12',1);

--Tủ quần áo
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (6,'Tủ quần áo gỗ công nghiệp thiết kế hiện đại',30,40,'','https://cdn.gotrangtri.vn/wp-content/uploads/2020/12/tu-quan-ao-go-soi-tu-nhien-thiet-ke-hien-dai-nha-nhan-ghs-51265-ava-300x300.jpg.webp','2021-04-05',2 );
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (7,'Tủ quần áo cánh mở bằng gỗ', 24, 35, '', 'https://cdn.gotrangtri.vn/wp-content/uploads/2020/12/tu-quan-ao-canh-mo-bang-go-soi-tu-nhien-cao-cap-ghs-51248-ava-300x300.jpg.webp','2022-06-12',2);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (8,'Tủ quần áo cánh lùa gỗ công nghiệp', 36, 45, '', 'https://cdn.gotrangtri.vn/wp-content/uploads/2020/10/tu-quan-ao-canh-lua-go-cong-nghiep-ghs-51087-ava-300x300.jpg.webp', '2022-01-03',2);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (9,'Tủ quần áo sang trọng kết cấu chắc chắn', 12, 70, '', 'https://cdn.gotrangtri.vn/wp-content/uploads/2021/07/tu-quan-ao-sang-trong-ket-cau-chac-chan-ghs-51508-ava-300x300.jpg.webp', '2021-11-04',2);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (10,'Tủ quần áo gia đình tiện dụng', 10,25 , '','https://cdn.gotrangtri.vn/wp-content/uploads/2021/10/tu-ao-gia-dinh-GHS-51684-10-300x300.jpg','2021-12-24',2);

--Bàn Trang Điểm
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (11,'',25,30,'','https://cdn.gotrangtri.vn/wp-content/uploads/2020/11/Ban-trang-diem-dep-bang-go-hien-dai-GHS-41194-ava-300x300.png.webp','2021-03-05',3);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (12,'',32,25,'','https://cdn.gotrangtri.vn/wp-content/uploads/2020/11/ban-phan-hien-dai-thiet-ke-tien-dung-GHS-41192-ava-300x300.png.webp','2022-11-05',3);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (13,'',21,45,'','https://cdn.gotrangtri.vn/wp-content/uploads/2020/11/Ban-phan-go-soi-tu-nhien-thiet-ke-dep-GHS-41191-ava-300x300.png.webp','2021-08-12',3);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (14,'',40,60,'','https://cdn.gotrangtri.vn/wp-content/uploads/2021/10/ban-trang-diem-go-thiet-ke-thong-minh-ghs-41591ava-300x300.jpg','2021-09-25',3);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (15,'',33,61,'','https://cdn.gotrangtri.vn/wp-content/uploads/2021/10/ban-phan-trang-diem-hien-dai-ghs-41580ava-300x300.jpg','2021-03-07',3);

--Tủ Giày
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (16,'',37,30,'','https://cdn.gotrangtri.vn/wp-content/uploads/2021/10/tu-giay-go-cong-nghiep-GHS-51713-1-300x300.jpg','2021-09-12',4);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (17,'',12,40,'','https://cdn.gotrangtri.vn/wp-content/uploads/2021/10/tu-giay-go-cong-nghiep-GHS-51616-1-300x300.jpg','2022-09-12',4);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (18,'',24,37,'','https://cdn.gotrangtri.vn/wp-content/uploads/2018/03/Tu-dung-giay-dep-dep-phong-cach-thanh-lich-GHS-5496-ava-300x300.png.webp','2021-04-24',4);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (19,'',39,51,'','https://cdn.gotrangtri.vn/wp-content/uploads/2021/05/tu-giay-dep-go-mdf-ket-cau-chac-chan-thiet-ke-don-gian-ghs-51447-ava-300x300.jpg.webp','2021-06-13',4);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (20,'',5,60,'','https://cdn.gotrangtri.vn/wp-content/uploads/2021/10/tu-dung-giay-hien-dai-GHS-51618-1-300x300.jpg','2021-05-27',4);

--Kệ TV
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (21,'',24,35,'','https://cdn.gotrangtri.vn/wp-content/uploads/2020/06/Tu-ke-tivi-phong-khach-thiet-ke-dep-GHS-3385-ava-300x300.jpg.webp','2021-12-07',5);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (22,'',23,55,'','https://cdn.gotrangtri.vn/wp-content/uploads/2019/08/Ke-tivi-phong-khach-thiet-ke-dep-GHS-3334-ava-300x300.png.webp','2021-12-07',5);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (23,'',13,25,'','https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/ke-tivi-%C4%91a-nang-GHC-3299-1-300x300.jpg.webp','2021-12-07',5);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (24,'',40,60,'','https://cdn.gotrangtri.vn/wp-content/uploads/2019/04/Ke-tivi-go-dep-hien-dai-cho-gia-dinh-tre-GHS-3279-ava-300x300.jpg.webp','2021-12-07',5);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (25,'',65,41,'','https://cdn.gotrangtri.vn/wp-content/uploads/2019/08/Ke-tivi-phong-khach-go-cong-nghiep-dang-thap-GHS-3338-ava-300x300.png.webp','2021-12-07',5);

--Bàn Sofa
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (26,'',21,40,'','https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/ban-tra-hien-dai-ban-sofa-bang-go-nho-gon-ghc-4606-ava-300x300.jpg.webp','2021-12-03',6);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (27,'',32,50,'','https://cdn.gotrangtri.vn/wp-content/uploads/2021/04/Ban-tra-go-cong-nghiep-phong-cach-hien-dai-GHS-41303-ava-300x300.png.webp','2022-11-05',6);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (28,'',40,32,'','https://cdn.gotrangtri.vn/wp-content/uploads/2021/04/ban-tra-go-soi-chat-luong-cao-cho-gia-dinh-GHS-41298-ava-300x300.jpg.webp','2021-07-12',6);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (29,'',13,44,'','https://cdn.gotrangtri.vn/wp-content/uploads/2021/04/Ban-tra-bang-go-phong-khach-thiet-ke-tien-dung-GHS-41295-ava-300x300.png.webp','2022-09-28',6);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (30,'',31,59,'','https://cdn.gotrangtri.vn/wp-content/uploads/2020/11/Ban-tra-go-tu-nhien-chat-luong-cao-GHS-41132-ava-300x300.png.webp','2021-01-24',6);

--Ghế Sofa
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (31,'',31,34,'','https://cdn.gotrangtri.vn/wp-content/uploads/2020/10/Ghe-sofa-ni-kieu-dang-nho-gon-GHS-8371-ava-300x300.png.webp','2022-03-04',7);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (32,'',13,50,'','https://cdn.gotrangtri.vn/wp-content/uploads/2020/09/sofa-vang-gia-dinh-boc-ni-hien-dai-ghs-8350-ava-300x300.jpg.webp','2021-08-04',7);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (33,'',22,70,'','https://cdn.gotrangtri.vn/wp-content/uploads/2020/09/ghe-sofa-boc-ni-thiet-ke-tre-trung-ghs-8351-ava-300x300.jpg.webp','2022-11-05',7);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (34,'',25,99,'','https://cdn.gotrangtri.vn/wp-content/uploads/2020/09/sofa-goc-boc-da-chu-l-sang-trong-ghs-8348-ava-300x300.jpg.webp','2021-10-12',7);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (35,'',18,62,'','https://cdn.gotrangtri.vn/wp-content/uploads/2020/09/sofa-goc-boc-ni-phong-khach-thiet-ke-dep-hien-dai-ghs-8343-ava-300x300.jpg.webp','2022-03-01',7);
--Bàn làm việc
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (36,'',23,50,'','https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/ban-hoc-doi-ban-lam-viec-doi-go-mdf-ghc-4612-ava-300x300.jpg.webp','2021-12-14',8);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (37,'',13,60,'','https://cdn.gotrangtri.vn/wp-content/uploads/2021/05/Ban-lam-viec-tai-nha-bang-go-thiet-ke-tien-loi-GHS-41369-ava-300x300.png.webp','2022-07-18',8);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (38,'',32,61,'','https://cdn.gotrangtri.vn/wp-content/uploads/2017/06/Ban-lam-viec-go-tai-nha-GHS-4476-ava-2-300x300.jpg.webp','2021-03-21',8);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (39,'',40,53,'','https://cdn.gotrangtri.vn/wp-content/uploads/2021/05/Ban-lam-viec-tai-nha-bang-go-kieu-dang-nho-gon-GHS-41361-ava-300x300.jpg.webp','2022-04-29',8);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (40,'',9,70,'','https://cdn.gotrangtri.vn/wp-content/uploads/2021/04/Ban-lam-vie-ctai-nha-thiet-ke-dep-hien-dai-GHS-41309-ava-300x300.jpg.webp','2022-05-30',8);
--Kệ sách
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (41,'',13,20,'','https://cdn.gotrangtri.vn/wp-content/uploads/2021/09/avar-2-300x300.jpg.webp','2022-03-04',9);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (42,'',23,25,'','https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/ke-tatami-thong-minh-ke-gia-de-do-bang-go-ghc-2421-ava-1-300x300.jpg.webp','2021-12-04',9);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (43,'',22,31,'','https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/ke-sach-bang-go-ghc-2426-1-300x300.jpg.webp','2022-10-04',9);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (44,'',10,26,'','https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/gia-ke-sach-nhat-ke-sach-go-4-ngan-chua-tien-loi-ghc-2419-ava-300x300.jpg.webp','2021-09-14',9);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (45,'',30,28,'','https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/gia-sach-phong-be-ke-gia-sach-go-mdf-ghc-2423-ava-300x300.jpg.webp','2022-08-11',9);
--Ghế làm việc
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (46,'',24,30,'','https://cdn.gotrangtri.vn/wp-content/uploads/2020/06/Ghe-nhan-vien-hien-dai-nho-gon-GHX-747-ava-300x300.png.webp','2021-05-12',10);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (47,'',12,35,'','https://cdn.gotrangtri.vn/wp-content/uploads/2020/06/Ghe-giam-doc-boc-da-cao-cap-thiet-ke-dep-GHX-731-1-300x300.png.webp','2022-12-24',10);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (48,'',13,31,'','https://cdn.gotrangtri.vn/wp-content/uploads/2020/05/Ghe-xoay-giam-doc-chat-luong-cao-GHX-708-1-1-300x300.jpg.webp','2021-06-23',10);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (49,'',30,40,'','https://cdn.gotrangtri.vn/wp-content/uploads/2020/05/Ghe-giam-doc-tua-luoi-cao-cap-GHX-702-ava-300x300.png.webp','2022-09-21',10);
insert into Product(id, name, quantity, price, description, imageUrl, create_date, Categoryid) values (50,'',28,28,'','https://cdn.gotrangtri.vn/wp-content/uploads/2020/06/Ghe-phong-hop-chan-quy-tua-boc-luoi-GHX-767-ava-300x300.png.webp','2021-02-20',10);