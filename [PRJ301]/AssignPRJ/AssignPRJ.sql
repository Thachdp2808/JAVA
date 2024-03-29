
USE [ToyShopping]
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
INSERT [dbo].[Category] ([id], [name]) VALUES (1, N'Đồ chơi lắp ghép')
INSERT [dbo].[Category] ([id], [name]) VALUES (2, N'Thế giới động vật')
INSERT [dbo].[Category] ([id], [name]) VALUES (3, N'Đồ chơi Mô hình')
INSERT [dbo].[Category] ([id], [name]) VALUES (4, N'Đồ chơi Búp bê')
INSERT [dbo].[Category] ([id], [name]) VALUES (5, N'Đồ chơi mô hình')
INSERT [dbo].[Category] ([id], [name]) VALUES (6, N'Đồ chơi Robot')
INSERT [dbo].[Category] ([id], [name]) VALUES (7, N'Đồ chơi phương tiện')
INSERT [dbo].[Category] ([id], [name]) VALUES (8, N'Đồ chơi sáng tạo')
INSERT [dbo].[Category] ([id], [name]) VALUES (9, N'Đồ chơi mô phỏng')
INSERT [dbo].[Category] ([id], [name]) VALUES (10, N'Đồ chơi mầm non')
/****** Object:  Table [dbo].[account]    Script Date: 03/22/2022 09:43:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Account](
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
INSERT [dbo].[account] ([id], [username], [password], [displayname], [address], [email], [phone], [roleid]) VALUES (1, N'Admin', N'Admin', N'tuan', N'Ha Noi', N'admin@gmail.com', N'0123456789', 2)
INSERT [dbo].[account] ([id], [username], [password], [displayname], [address], [email], [phone], [roleid]) VALUES (2, N'abc', N'abc', N'A AVC', N'Ha Noi', N'nguyentientu2k1@gmail.com', N'123456789', 1)
SET IDENTITY_INSERT [dbo].[account] OFF
/****** Object:  Table [dbo].[Product]    Script Date: 03/22/2022 09:43:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Product](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](255) NULL,
	[quantity] [int] NULL,
	[price] [float] NULL,
	[description] [nvarchar](255) NULL,
	[imageUrl] [varchar](900) NULL,
	[create_date] [date] NULL,
	[Categoryid] [int] NULL,
 CONSTRAINT [PK_Product] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Orders](
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
