USE [Shopping]
GO
/****** Object:  Table [dbo].[RoleAccount]    Script Date: 03/22/2022 09:43:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[RoleAccount](
	[id] [int] NOT NULL,
	[role_name] [nvarchar](50) NULL,
 CONSTRAINT [PK_Rolename] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[RoleAccount] ([id], [role_name]) VALUES (1, N'User')
INSERT [dbo].[RoleAccount] ([id], [role_name]) VALUES (2, N'Admin')
/****** Object:  Table [dbo].[Category]    Script Date: 03/22/2022 09:43:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[id] [int] NOT NULL,
	[name] [nvarchar](255) NULL,
 CONSTRAINT [PK_Category] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Category] ([id], [name]) VALUES (1, N'Giường')
INSERT [dbo].[Category] ([id], [name]) VALUES (2, N'Tủ quần áo')
INSERT [dbo].[Category] ([id], [name]) VALUES (3, N'Bàn Trang Điểm')
INSERT [dbo].[Category] ([id], [name]) VALUES (4, N'Tủ Giày')
INSERT [dbo].[Category] ([id], [name]) VALUES (5, N'Kệ TV')
INSERT [dbo].[Category] ([id], [name]) VALUES (6, N'Bàn Sofa')
INSERT [dbo].[Category] ([id], [name]) VALUES (7, N'Ghế Sofa')
INSERT [dbo].[Category] ([id], [name]) VALUES (8, N'Bàn Làm Việc')
INSERT [dbo].[Category] ([id], [name]) VALUES (9, N'Kệ Sách')
INSERT [dbo].[Category] ([id], [name]) VALUES (10, N'Ghế Làm Việc')
/****** Object:  Table [dbo].[account]    Script Date: 03/22/2022 09:43:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[account](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[username] [varchar](255) NULL,
	[password] [varchar](255) NULL,
	[displayname] [nvarchar](255) NULL,
	[address] [nvarchar](255) NULL,
	[email] [nvarchar](255) NULL,
	[phone] [nvarchar](255) NULL,
	[roleid] [int] NULL,
 CONSTRAINT [PK__account__3213E83F3F466844] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[account] ON
INSERT [dbo].[account] ([id], [username], [password], [displayname], [address], [email], [phone], [roleid]) VALUES (1, N'Admin', N'Admin', N'tuan', N'hungyen', N'admin@gmail.com', N'0123456789', 2)
INSERT [dbo].[account] ([id], [username], [password], [displayname], [address], [email], [phone], [roleid]) VALUES (2, N'phucthach2k1', N'Phucthach', N'Phuc Thach', N'Hung Yen', N'nguyentientu2k1@gmail.com', N'123456789', 1)
INSERT [dbo].[account] ([id], [username], [password], [displayname], [address], [email], [phone], [roleid]) VALUES (5, N'abc', N'123', N'abc', N'hungyen', N'abc@gmail.com', N'1234567890', 1)
INSERT [dbo].[account] ([id], [username], [password], [displayname], [address], [email], [phone], [roleid]) VALUES (6, N'abd', N'Phucthach', N'daophuc', N'daohung', N'abd@gmail.com', N'123456789', 1)
INSERT [dbo].[account] ([id], [username], [password], [displayname], [address], [email], [phone], [roleid]) VALUES (7, N'abd', N'phucthach', N'cde', N'hungyen', N'abc@gmail.com', N'123456', NULL)
SET IDENTITY_INSERT [dbo].[account] OFF
/****** Object:  Table [dbo].[Product]    Script Date: 03/22/2022 09:43:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Product](
	[id] [int] NOT NULL,
	[name] [nvarchar](255) NULL,
	[quantity] [int] NULL,
	[price] [float] NULL,
	[description] [nvarchar](255) NULL,
	[imageUrl] [varchar](900) NULL,
	[create_date] [date] NULL,
	[Categoryid] [int] NULL,
	[Suppliers] [nvarchar](50) NULL,
 CONSTRAINT [PK_Product] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (2, N'Giường ngủ thiết kế đơn giản', 20, 35, N'Abrasion, unspecified ankle', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/giuong-ngu-go-mdf-thiet-ke-kieu-dang-don-gian-ghs-9201-ava-1.jpg.webp', CAST(0x3D420B00 AS Date), 1, N'HP')
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (3, N'Giường ngủ Nhật thiết kế tiện lợi', 69, 22, N'abc', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/09/giuong-ngu-go-cong-nghiep-mdf-thiet-ke-moi-ghc-9216-ava-300x300.jpg.webp', CAST(0xFB430B00 AS Date), 1, N'LG')
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (4, N'Giường ngủ thiết kế hiện đại', 94, 69, N'Corrosion of third degree of right toe(s) (nail)', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/giuong-ngu-nhat-bang-go-thiet-ke-tien-loi-ghs-9202-ava-300x300.jpg.webp', CAST(0x07430B00 AS Date), 1, N'HTT')
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (5, N'Giường ngủ thiết kê sang trọng', 58, 44, N'Antepartum hemorrhage, unspecified', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/giuong-ngu-gia-dinh-cao-cap-lam-bang-go-mdf-ghs-9198-ava.jpg.webp', CAST(0xFC420B00 AS Date), 1, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (6, N'Tủ quần áo gỗ công nghiệp', 30, 40, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/12/tu-quan-ao-go-soi-tu-nhien-thiet-ke-hien-dai-nha-nhan-ghs-51265-ava-300x300.jpg.webp', CAST(0x5C420B00 AS Date), 2, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (7, N'Tủ quần áo cánh mở gỗ sồi', 24, 35, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/12/tu-quan-ao-canh-mo-bang-go-soi-tu-nhien-cao-cap-ghs-51248-ava-300x300.jpg.webp', CAST(0x0D440B00 AS Date), 2, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (8, N'Tủ quần áo cánh lùa gỗ công nghiệp', 36, 45, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/10/tu-quan-ao-canh-lua-go-cong-nghiep-ghs-51087-ava-300x300.jpg.webp', CAST(0x6D430B00 AS Date), 2, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (9, N'Tủ quần áo sang trọng kết cấu chắc chắn', 12, 70, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/07/tu-quan-ao-sang-trong-ket-cau-chac-chan-ghs-51508-ava-300x300.jpg.webp', CAST(0x31430B00 AS Date), 2, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (10, N'Tủ quần áo gia đình tiện dụng', 10, 25, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/10/tu-ao-gia-dinh-GHS-51684-10-300x300.jpg', CAST(0x63430B00 AS Date), 2, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (11, N'Bàn trang điểm đơn giản bằng gỗ công nghiệp', 25, 30, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/11/Ban-trang-diem-dep-bang-go-hien-dai-GHS-41194-ava-300x300.png.webp', CAST(0x3D420B00 AS Date), 3, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (12, N'Bàn trang điểm thiết kế tiện dụng', 32, 25, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/11/ban-phan-hien-dai-thiet-ke-tien-dung-GHS-41192-ava-300x300.png.webp', CAST(0x9F440B00 AS Date), 3, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (13, N'Bàn trang điểm thiết kế đa năng', 40, 60, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/10/ban-trang-diem-go-thiet-ke-thong-minh-ghs-41591ava-300x300.jpg', CAST(0x76440B00 AS Date), 3, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (14, N'Bàn trang điểm thiết kế thông minh', 32, 61, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/10/ban-phan-trang-diem-hien-dai-ghs-41580ava-300x300.jpg', CAST(0xAC430B00 AS Date), 3, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (15, N'Tủ giày gỗ công nghiệp đẹp hiện đại', 37, 30, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/10/tu-giay-go-cong-nghiep-GHS-51713-1-300x300.jpg', CAST(0xFC420B00 AS Date), 4, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (16, N'Tủ giày gỗ công nghiệp cao cấp', 12, 40, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/10/tu-giay-go-cong-nghiep-GHS-51616-1-300x300.jpg', CAST(0x69440B00 AS Date), 4, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (17, N'Tủ giày dép tiện lợi', 24, 37, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2018/03/Tu-dung-giay-dep-dep-phong-cach-thanh-lich-GHS-5496-ava-300x300.png.webp', CAST(0x6F420B00 AS Date), 4, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (18, N'Tủ giày nhỏ gọn gỗ MDF', 39, 51, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/05/tu-giay-dep-go-mdf-ket-cau-chac-chan-thiet-ke-don-gian-ghs-51447-ava-300x300.jpg.webp', CAST(0x0E440B00 AS Date), 4, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (19, N'Tủ giày hiện đại gỗ MDF', 5, 60, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/10/tu-dung-giay-hien-dai-GHS-51618-1-300x300.jpg', CAST(0x90420B00 AS Date), 4, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (20, N'Kệ tivi phòng khách thiết kế đẹp', 24, 35, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/06/Tu-ke-tivi-phong-khach-thiet-ke-dep-GHS-3385-ava-300x300.jpg.webp', CAST(0x52430B00 AS Date), 5, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (21, N'Kệ tivi phòng khách nhỏ gọn', 23, 55, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2019/08/Ke-tivi-phong-khach-thiet-ke-dep-GHS-3334-ava-300x300.png.webp', CAST(0xBF440B00 AS Date), 5, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (22, N'Kệ tivi thiết kệ tiện lợi, đa năg', 13, 25, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/ke-tivi-%C4%91a-nang-GHC-3299-1-300x300.jpg.webp', CAST(0x52430B00 AS Date), 5, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (23, N'Kệ tivi gia đình phong cách', 40, 60, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2019/04/Ke-tivi-go-dep-hien-dai-cho-gia-dinh-tre-GHS-3279-ava-300x300.jpg.webp', CAST(0xBF440B00 AS Date), 5, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (24, N'Kệ tivi thiết kế thông minh', 65, 41, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2019/08/Ke-tivi-phong-khach-go-cong-nghiep-dang-thap-GHS-3338-ava-300x300.png.webp', CAST(0xBF440B00 AS Date), 5, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (25, N'Bàn sofa gỗ nhỏ gọn', 21, 40, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/ban-tra-hien-dai-ban-sofa-bang-go-nho-gon-ghc-4606-ava-300x300.jpg.webp', CAST(0x4E430B00 AS Date), 6, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (26, N'Bàn sofa gỗ sồi tự nhiên', 32, 50, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/04/Ban-tra-go-cong-nghiep-phong-cach-hien-dai-GHS-41303-ava-300x300.png.webp', CAST(0x9F440B00 AS Date), 6, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (27, N'Bàn sofa thiết kế hiện đại', 37, 32, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/04/ban-tra-go-soi-chat-luong-cao-cho-gia-dinh-GHS-41298-ava-300x300.jpg.webp', CAST(0xBE420B00 AS Date), 6, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (28, N'Bàn sofa thiết kế tiện dụng', 12, 44, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/04/Ban-tra-bang-go-phong-khach-thiet-ke-tien-dung-GHS-41295-ava-300x300.png.webp', CAST(0x79440B00 AS Date), 6, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (29, N'Bàn sofa gỗ tự nhiên cao cấp', 31, 59, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/11/Ban-tra-go-tu-nhien-chat-luong-cao-GHS-41132-ava-300x300.png.webp', CAST(0x15420B00 AS Date), 6, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (30, N'Ghế sofa nỉ kiểu dáng nhỏ gọn', 31, 34, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/10/Ghe-sofa-ni-kieu-dang-nho-gon-GHS-8371-ava-300x300.png.webp', CAST(0xA9430B00 AS Date), 7, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (31, N'Ghế sofa gia đình bọc nỉ hiện đại', 13, 50, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/09/sofa-vang-gia-dinh-boc-ni-hien-dai-ghs-8350-ava-300x300.jpg.webp', CAST(0xD5420B00 AS Date), 7, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (32, N'Ghế sofa thiết kế trẻ trung', 19, 70, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/09/ghe-sofa-boc-ni-thiet-ke-tre-trung-ghs-8351-ava-300x300.jpg.webp', CAST(0x9F440B00 AS Date), 7, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (33, N'Ghế sofa góc bọc da chữ L sang trọng', 25, 99, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/09/sofa-goc-boc-da-chu-l-sang-trong-ghs-8348-ava-300x300.jpg.webp', CAST(0x1A430B00 AS Date), 7, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (34, N'Ghế sofa góc bọc nỉ thiết kế hiện đại', 16, 62, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/09/sofa-goc-boc-ni-phong-khach-thiet-ke-dep-hien-dai-ghs-8343-ava-300x300.jpg.webp', CAST(0xA6430B00 AS Date), 7, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (35, N'Bàn làm việc đôi gỗ MDF', 23, 50, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/ban-hoc-doi-ban-lam-viec-doi-go-mdf-ghc-4612-ava-300x300.jpg.webp', CAST(0x59430B00 AS Date), 8, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (36, N'Bàn làm việc tại nhà thiết kế tiện lợi', 13, 60, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/05/Ban-lam-viec-tai-nha-bang-go-thiet-ke-tien-loi-GHS-41369-ava-300x300.png.webp', CAST(0x31440B00 AS Date), 8, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (37, N'Bàn làm việc bằng gỗ tại nhà', 32, 61, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2017/06/Ban-lam-viec-go-tai-nha-GHS-4476-ava-2-300x300.jpg.webp', CAST(0x4D420B00 AS Date), 8, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (38, N'Bàn làm việc thiết kế vòng cung', 40, 53, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/05/Ban-lam-viec-tai-nha-bang-go-kieu-dang-nho-gon-GHS-41361-ava-300x300.jpg.webp', CAST(0xE1430B00 AS Date), 8, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (39, N'Bàn làm việc thiết kế hiện đại', 9, 70, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/04/Ban-lam-vie-ctai-nha-thiet-ke-dep-hien-dai-GHS-41309-ava-300x300.jpg.webp', CAST(0x00440B00 AS Date), 8, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (40, N'Kệ sách gỗ MDF mini cho bé', 13, 20, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/09/avar-2-300x300.jpg.webp', CAST(0xA9430B00 AS Date), 9, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (41, N'Kệ sách Tatami thông minh', 23, 25, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/ke-tatami-thong-minh-ke-gia-de-do-bang-go-ghc-2421-ava-1-300x300.jpg.webp', CAST(0x4F430B00 AS Date), 9, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (42, N'Kệ sách bằng gỗ di động', 22, 31, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/ke-sach-bang-go-ghc-2426-1-300x300.jpg.webp', CAST(0x7F440B00 AS Date), 9, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (43, N'Kệ sách thiết kế kiểu Nhật', 10, 26, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/gia-ke-sach-nhat-ke-sach-go-4-ngan-chua-tien-loi-ghc-2419-ava-300x300.jpg.webp', CAST(0xFE420B00 AS Date), 9, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (44, N'Ghế xoay nhân viên hiện đại nhỏ gọn GHX-747', 24, 30, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/06/Ghe-nhan-vien-hien-dai-nho-gon-GHX-747-ava-300x300.png.webp', CAST(0x81420B00 AS Date), 10, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (45, N'Ghế bọc da cao cấp ', 12, 35, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/06/Ghe-giam-doc-boc-da-cao-cap-thiet-ke-dep-GHX-731-1-300x300.png.webp', CAST(0xD0440B00 AS Date), 10, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (46, N'Ghế công thái học', 13, 31, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/05/Ghe-xoay-giam-doc-chat-luong-cao-GHX-708-1-1-300x300.jpg.webp', CAST(0xAB420B00 AS Date), 10, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (47, N'Ghế tựa lưới cao cấp', 30, 40, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/05/Ghe-giam-doc-tua-luoi-cao-cap-GHX-702-ava-300x300.png.webp', CAST(0x72440B00 AS Date), 10, NULL)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [imageUrl], [create_date], [Categoryid], [Suppliers]) VALUES (48, N'Ghế chân quỳ tựa bọc lưới', 28, 28, N'', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/06/Ghe-phong-hop-chan-quy-tua-boc-luoi-GHX-767-ava-300x300.png.webp', CAST(0x30420B00 AS Date), 10, NULL)
/****** Object:  Table [dbo].[orders]    Script Date: 03/22/2022 09:43:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[orders](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[account_id] [int] NULL,
	[totalPrice] [float] NULL,
	[note] [nvarchar](255) NULL,
	[create_date] [date] NULL,
 CONSTRAINT [PK__orders__3213E83F46E78A0C] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[orders] ON
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (1, 1, 0, N'abc', CAST(0xB2430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (2, 1, 104, N'abc', CAST(0xB2430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (3, 1, 91, N'', CAST(0xB2430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (4, 1, 35, N'', CAST(0xB2430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (5, 1, 35, N'TuÃ¢n BÃ¡o CÃ¡o', CAST(0xB2430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (6, 1, 35, N'Äi cáº©n tháº­n', CAST(0xB2430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (7, 1, 109, N'Äi cáº©n tháº­n', CAST(0xB2430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (10, 1, 0, N'', CAST(0xB3430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (11, 2, 0, N'', CAST(0xB3430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (12, 2, 35, N'', CAST(0xB3430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (16, 2, 35, N'', CAST(0xB4430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (18, 2, 64, N'', CAST(0xB5430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (22, 2, 103, N'', CAST(0xB5430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (25, 5, 59, N'', CAST(0xB5430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (28, 5, 40, N'', CAST(0xB5430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (29, 5, 40, N'', CAST(0xB5430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (30, 5, 50, N'', CAST(0xB5430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (31, 5, 0, N'', CAST(0xB5430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (35, 5, 32, N'', CAST(0xB5430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (36, 5, 70, N'', CAST(0xB6430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (37, 5, 34, N'', CAST(0xB6430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (38, 5, 34, N'', CAST(0xB6430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (39, 5, 32, N'', CAST(0xB6430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (40, 5, 70, N'', CAST(0xB6430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (41, 5, 70, N'', CAST(0xB6430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (42, 5, 214, N'abc', CAST(0xB6430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (43, 5, 182, N'', CAST(0xBA430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (44, 5, 194, N'', CAST(0xBA430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (46, 5, 126, N'', CAST(0xBA430B00 AS Date))
INSERT [dbo].[orders] ([id], [account_id], [totalPrice], [note], [create_date]) VALUES (47, 5, 181, N'abc', CAST(0xBB430B00 AS Date))
SET IDENTITY_INSERT [dbo].[orders] OFF
/****** Object:  Table [dbo].[Detail]    Script Date: 03/22/2022 09:43:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Detail](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[order_id] [int] NULL,
	[productname] [nvarchar](255) NULL,
	[productimage] [nvarchar](255) NULL,
	[productPrice] [float] NULL,
	[productid] [int] NULL,
	[quantity] [int] NULL,
 CONSTRAINT [PK__Detail__3213E83F4AB81AF0] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Detail] ON
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (1, 2, N'Giường ngủ bệt', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/07/giuong-nhat-kieu-hien-dai-go-cong-nghiep-ghc-9192-ava.jpg', 34, NULL, 69)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (2, 2, N'Giường ngủ thiết kế đơn giản', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/giuong-ngu-go-mdf-thiet-ke-kieu-dang-don-gian-ghs-9201-ava-1.jpg.webp', 35, NULL, 20)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (3, 3, N'Giường ngủ bệt', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/07/giuong-nhat-kieu-hien-dai-go-cong-nghiep-ghc-9192-ava.jpg', 34, NULL, 69)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (4, 3, N'Giường ngủ thiết kế đơn giản', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/giuong-ngu-go-mdf-thiet-ke-kieu-dang-don-gian-ghs-9201-ava-1.jpg.webp', 35, NULL, 20)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (5, 3, N'Giường Nhật bằng gỗ thiết kế tiện lợi', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/09/giuong-ngu-go-cong-nghiep-mdf-thiet-ke-moi-ghc-9216-ava-300x300.jpg.webp', 22, NULL, 69)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (6, 4, N'Giường ngủ thiết kế đơn giản', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/giuong-ngu-go-mdf-thiet-ke-kieu-dang-don-gian-ghs-9201-ava-1.jpg.webp', 35, NULL, 20)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (7, 5, N'Giường ngủ thiết kế đơn giản', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/giuong-ngu-go-mdf-thiet-ke-kieu-dang-don-gian-ghs-9201-ava-1.jpg.webp', 35, NULL, 20)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (8, 6, N'Giường ngủ thiết kế đơn giản', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/giuong-ngu-go-mdf-thiet-ke-kieu-dang-don-gian-ghs-9201-ava-1.jpg.webp', 35, NULL, 20)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (9, 7, N'Giường ngủ bệt', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/07/giuong-nhat-kieu-hien-dai-go-cong-nghiep-ghc-9192-ava.jpg', 34, NULL, 69)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (10, 7, N'Giường ngủ thiết kế đơn giản', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/giuong-ngu-go-mdf-thiet-ke-kieu-dang-don-gian-ghs-9201-ava-1.jpg.webp', 35, NULL, 20)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (11, 7, N'Tủ quần áo gỗ công nghiệp', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/12/tu-quan-ao-go-soi-tu-nhien-thiet-ke-hien-dai-nha-nhan-ghs-51265-ava-300x300.jpg.webp', 40, NULL, 30)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (13, 12, N'Giường ngủ thiết kế đơn giản', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/giuong-ngu-go-mdf-thiet-ke-kieu-dang-don-gian-ghs-9201-ava-1.jpg.webp', 35, NULL, 20)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (16, 16, N'Tủ quần áo cánh mở gỗ sồi', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/12/tu-quan-ao-canh-mo-bang-go-soi-tu-nhien-cao-cap-ghs-51248-ava-300x300.jpg.webp', 35, NULL, 24)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (31, 18, N'Bàn sofa thiết kế hiện đại', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/04/ban-tra-go-soi-chat-luong-cao-cho-gia-dinh-GHS-41298-ava-300x300.jpg.webp', 32, NULL, 40)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (34, 22, N'Bàn sofa thiết kế tiện dụng', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/04/Ban-tra-bang-go-phong-khach-thiet-ke-tien-dung-GHS-41295-ava-300x300.png.webp', 44, NULL, 13)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (35, 22, N'Bàn sofa gỗ tự nhiên cao cấp', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/11/Ban-tra-go-tu-nhien-chat-luong-cao-GHS-41132-ava-300x300.png.webp', 59, NULL, 31)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (38, 25, N'Bàn sofa gỗ tự nhiên cao cấp', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/11/Ban-tra-go-tu-nhien-chat-luong-cao-GHS-41132-ava-300x300.png.webp', 59, NULL, 31)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (41, 28, N'Giường ngủ thiết kế đơn giản', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/giuong-ngu-go-mdf-thiet-ke-kieu-dang-don-gian-ghs-9201-ava-1.jpg.webp', 35, NULL, 20)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (42, 29, N'Tủ quần áo gỗ công nghiệp', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/12/tu-quan-ao-go-soi-tu-nhien-thiet-ke-hien-dai-nha-nhan-ghs-51265-ava-300x300.jpg.webp', 40, NULL, 30)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (43, 30, N'Bàn sofa gỗ sồi tự nhiên', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/04/Ban-tra-go-cong-nghiep-phong-cach-hien-dai-GHS-41303-ava-300x300.png.webp', 50, NULL, 32)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (47, 35, N'Bàn sofa thiết kế hiện đại', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/04/ban-tra-go-soi-chat-luong-cao-cho-gia-dinh-GHS-41298-ava-300x300.jpg.webp', 32, NULL, 40)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (48, 36, N'Ghế sofa thiết kế trẻ trung', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/09/ghe-sofa-boc-ni-thiet-ke-tre-trung-ghs-8351-ava-300x300.jpg.webp', 70, NULL, 22)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (49, 37, N'Giường ngủ bệt', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/07/giuong-nhat-kieu-hien-dai-go-cong-nghiep-ghc-9192-ava.jpg', 34, NULL, 69)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (50, 38, N'Giường ngủ bệt', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/07/giuong-nhat-kieu-hien-dai-go-cong-nghiep-ghc-9192-ava.jpg', 34, NULL, 69)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (51, 41, N'Ghế sofa thiết kế trẻ trung', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/09/ghe-sofa-boc-ni-thiet-ke-tre-trung-ghs-8351-ava-300x300.jpg.webp', 70, 32, 21)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (52, 42, N'Bàn sofa gỗ sồi tự nhiên', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/04/Ban-tra-go-cong-nghiep-phong-cach-hien-dai-GHS-41303-ava-300x300.png.webp', 50, 27, 2)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (53, 42, N'Bàn sofa thiết kế hiện đại', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/04/ban-tra-go-soi-chat-luong-cao-cho-gia-dinh-GHS-41298-ava-300x300.jpg.webp', 32, 27, 2)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (54, 43, N'Tủ quần áo gỗ công nghiệp', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/12/tu-quan-ao-go-soi-tu-nhien-thiet-ke-hien-dai-nha-nhan-ghs-51265-ava-300x300.jpg.webp', 40, 34, 1)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (55, 43, N'Ghế sofa góc bọc nỉ thiết kế hiện đại', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/09/sofa-goc-boc-ni-phong-khach-thiet-ke-dep-hien-dai-ghs-8343-ava-300x300.jpg.webp', 62, 34, 1)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (56, 44, N'Bàn sofa gỗ sồi tự nhiên', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/04/Ban-tra-go-cong-nghiep-phong-cach-hien-dai-GHS-41303-ava-300x300.png.webp', 50, 28, 1)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (57, 44, N'Bàn sofa thiết kế tiện dụng', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/04/Ban-tra-bang-go-phong-khach-thiet-ke-tien-dung-GHS-41295-ava-300x300.png.webp', 44, 28, 1)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (60, 46, N'Bàn sofa thiết kế hiện đại', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/04/ban-tra-go-soi-chat-luong-cao-cho-gia-dinh-GHS-41298-ava-300x300.jpg.webp', 32, 27, 2)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (61, 46, N'Ghế sofa góc bọc nỉ thiết kế hiện đại', N'https://cdn.gotrangtri.vn/wp-content/uploads/2020/09/sofa-goc-boc-ni-phong-khach-thiet-ke-dep-hien-dai-ghs-8343-ava-300x300.jpg.webp', 62, 34, 1)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (62, 47, N'Bàn sofa gỗ nhỏ gọn', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/08/ban-tra-hien-dai-ban-sofa-bang-go-nho-gon-ghc-4606-ava-300x300.jpg.webp', 40, 25, 3)
INSERT [dbo].[Detail] ([id], [order_id], [productname], [productimage], [productPrice], [productid], [quantity]) VALUES (63, 47, N'Bàn trang điểm thiết kế thông minh', N'https://cdn.gotrangtri.vn/wp-content/uploads/2021/10/ban-phan-trang-diem-hien-dai-ghs-41580ava-300x300.jpg', 61, 14, 1)
SET IDENTITY_INSERT [dbo].[Detail] OFF
/****** Object:  Default [DF_orders_create_date]    Script Date: 03/22/2022 09:43:23 ******/
ALTER TABLE [dbo].[orders] ADD  CONSTRAINT [DF_orders_create_date]  DEFAULT (getdate()) FOR [create_date]
GO
/****** Object:  ForeignKey [FK_account_RoleAccount]    Script Date: 03/22/2022 09:43:23 ******/
ALTER TABLE [dbo].[account]  WITH CHECK ADD  CONSTRAINT [FK_account_RoleAccount] FOREIGN KEY([roleid])
REFERENCES [dbo].[RoleAccount] ([id])
GO
ALTER TABLE [dbo].[account] CHECK CONSTRAINT [FK_account_RoleAccount]
GO
/****** Object:  ForeignKey [FK_Detail_orders]    Script Date: 03/22/2022 09:43:23 ******/
ALTER TABLE [dbo].[Detail]  WITH CHECK ADD  CONSTRAINT [FK_Detail_orders] FOREIGN KEY([order_id])
REFERENCES [dbo].[orders] ([id])
GO
ALTER TABLE [dbo].[Detail] CHECK CONSTRAINT [FK_Detail_orders]
GO
/****** Object:  ForeignKey [FK_Detail_Product]    Script Date: 03/22/2022 09:43:23 ******/
ALTER TABLE [dbo].[Detail]  WITH CHECK ADD  CONSTRAINT [FK_Detail_Product] FOREIGN KEY([productid])
REFERENCES [dbo].[Product] ([id])
GO
ALTER TABLE [dbo].[Detail] CHECK CONSTRAINT [FK_Detail_Product]
GO
/****** Object:  ForeignKey [FK_orders_account]    Script Date: 03/22/2022 09:43:23 ******/
ALTER TABLE [dbo].[orders]  WITH CHECK ADD  CONSTRAINT [FK_orders_account] FOREIGN KEY([account_id])
REFERENCES [dbo].[account] ([id])
GO
ALTER TABLE [dbo].[orders] CHECK CONSTRAINT [FK_orders_account]
GO
/****** Object:  ForeignKey [FK__Product__Categor__0CBAE877]    Script Date: 03/22/2022 09:43:23 ******/
ALTER TABLE [dbo].[Product]  WITH CHECK ADD  CONSTRAINT [FK__Product__Categor__0CBAE877] FOREIGN KEY([Categoryid])
REFERENCES [dbo].[Category] ([id])
GO
ALTER TABLE [dbo].[Product] CHECK CONSTRAINT [FK__Product__Categor__0CBAE877]
GO
