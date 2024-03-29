USE [master]
GO
/****** Object:  Database [CMS]    Script Date: 8/15/2022 9:38:05 PM ******/
CREATE DATABASE [CMS]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'CMS', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\CMS.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'CMS_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\CMS_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [CMS] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [CMS].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [CMS] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [CMS] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [CMS] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [CMS] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [CMS] SET ARITHABORT OFF 
GO
ALTER DATABASE [CMS] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [CMS] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [CMS] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [CMS] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [CMS] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [CMS] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [CMS] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [CMS] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [CMS] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [CMS] SET  ENABLE_BROKER 
GO
ALTER DATABASE [CMS] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [CMS] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [CMS] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [CMS] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [CMS] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [CMS] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [CMS] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [CMS] SET RECOVERY FULL 
GO
ALTER DATABASE [CMS] SET  MULTI_USER 
GO
ALTER DATABASE [CMS] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [CMS] SET DB_CHAINING OFF 
GO
ALTER DATABASE [CMS] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [CMS] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [CMS] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [CMS] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'CMS', N'ON'
GO
ALTER DATABASE [CMS] SET QUERY_STORE = OFF
GO
USE [CMS]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 8/15/2022 9:38:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[account_id] [int] IDENTITY(1,1) NOT NULL,
	[account] [varchar](255) NOT NULL,
	[email] [varchar](255) NOT NULL,
	[password] [varchar](255) NOT NULL,
	[status] [int] NULL,
	[Employeemployee_id] [int] NOT NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[account_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Employee]    Script Date: 8/15/2022 9:38:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Employee](
	[employee_id] [int] IDENTITY(1,1) NOT NULL,
	[first_name] [varchar](255) NOT NULL,
	[last_name] [varchar](255) NOT NULL,
	[gender] [int] NOT NULL,
	[date_of_birth] [date] NOT NULL,
	[phone] [varchar](20) NOT NULL,
	[address] [varchar](255) NULL,
	[department_name] [varchar](255) NOT NULL,
	[remark] [varchar](100) NULL,
 CONSTRAINT [PK_Employee] PRIMARY KEY CLUSTERED 
(
	[employee_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Account] ON 

INSERT [dbo].[Account] ([account_id], [account], [email], [password], [status], [Employeemployee_id]) VALUES (1, N'admin', N'fsofta@gmail.com', N'12345', 1, 2)
INSERT [dbo].[Account] ([account_id], [account], [email], [password], [status], [Employeemployee_id]) VALUES (2, N'admin2', N'fsoftb@gmail.com', N'45678', 0, 1)
INSERT [dbo].[Account] ([account_id], [account], [email], [password], [status], [Employeemployee_id]) VALUES (3, N'admin4', N'fsoftd@gmail.com', N'456789', 1, 2)
INSERT [dbo].[Account] ([account_id], [account], [email], [password], [status], [Employeemployee_id]) VALUES (16, N'a', N'a', N'a', 1, 13)
INSERT [dbo].[Account] ([account_id], [account], [email], [password], [status], [Employeemployee_id]) VALUES (20, N'b', N'b', N'b', 1, 17)
INSERT [dbo].[Account] ([account_id], [account], [email], [password], [status], [Employeemployee_id]) VALUES (21, N'c', N'c', N'c', 1, 18)
INSERT [dbo].[Account] ([account_id], [account], [email], [password], [status], [Employeemployee_id]) VALUES (22, N'd', N'd', N'd', 1, 19)
INSERT [dbo].[Account] ([account_id], [account], [email], [password], [status], [Employeemployee_id]) VALUES (32, N'v', N'v', N'2', 1, 29)
SET IDENTITY_INSERT [dbo].[Account] OFF
GO
SET IDENTITY_INSERT [dbo].[Employee] ON 

INSERT [dbo].[Employee] ([employee_id], [first_name], [last_name], [gender], [date_of_birth], [phone], [address], [department_name], [remark]) VALUES (1, N'Nguyen', N'Thanh', 1, CAST(N'2001-09-14' AS Date), N'0123456', N'BG', N'KS', N'123')
INSERT [dbo].[Employee] ([employee_id], [first_name], [last_name], [gender], [date_of_birth], [phone], [address], [department_name], [remark]) VALUES (2, N'Nguyen', N'Trinh', 0, CAST(N'2001-10-10' AS Date), N'02134578', N'BN', N'KS02', N'456')
INSERT [dbo].[Employee] ([employee_id], [first_name], [last_name], [gender], [date_of_birth], [phone], [address], [department_name], [remark]) VALUES (13, N'a', N'a', 1, CAST(N'2022-08-20' AS Date), N'1', N'a', N'Fsoft Academy', N'1')
INSERT [dbo].[Employee] ([employee_id], [first_name], [last_name], [gender], [date_of_birth], [phone], [address], [department_name], [remark]) VALUES (17, N'b', N'b', 1, CAST(N'2022-08-28' AS Date), N'1', N'b', N'Fsoft Academy', N'2')
INSERT [dbo].[Employee] ([employee_id], [first_name], [last_name], [gender], [date_of_birth], [phone], [address], [department_name], [remark]) VALUES (18, N'c', N'c', 1, CAST(N'2022-08-12' AS Date), N'2', N'c', N'Fsoft Academy', N'2')
INSERT [dbo].[Employee] ([employee_id], [first_name], [last_name], [gender], [date_of_birth], [phone], [address], [department_name], [remark]) VALUES (19, N'd', N'd', 1, CAST(N'2022-08-19' AS Date), N'2', N'd', N'Fsoft Academy', N'2')
INSERT [dbo].[Employee] ([employee_id], [first_name], [last_name], [gender], [date_of_birth], [phone], [address], [department_name], [remark]) VALUES (27, N'b', N'b', 1, CAST(N'2022-08-04' AS Date), N'1', N'1', N'Fsoft Academy', N'1')
INSERT [dbo].[Employee] ([employee_id], [first_name], [last_name], [gender], [date_of_birth], [phone], [address], [department_name], [remark]) VALUES (28, N'b', N'b', 1, CAST(N'2022-08-06' AS Date), N'1', N'b', N'Fsoft Academy', N'2')
INSERT [dbo].[Employee] ([employee_id], [first_name], [last_name], [gender], [date_of_birth], [phone], [address], [department_name], [remark]) VALUES (29, N'v', N'v', 1, CAST(N'2022-08-12' AS Date), N'2', N'2', N'Fsoft Academy', N'2')
INSERT [dbo].[Employee] ([employee_id], [first_name], [last_name], [gender], [date_of_birth], [phone], [address], [department_name], [remark]) VALUES (30, N'd', N'd', 1, CAST(N'2022-08-12' AS Date), N'2', N'b', N'Fsoft Academy', N'2')
INSERT [dbo].[Employee] ([employee_id], [first_name], [last_name], [gender], [date_of_birth], [phone], [address], [department_name], [remark]) VALUES (31, N'b', N'b', 1, CAST(N'2022-08-03' AS Date), N'2', N'b', N'Fsoft Academy', N'2')
SET IDENTITY_INSERT [dbo].[Employee] OFF
GO
/****** Object:  Index [UQ__Account__46A222CC66195445]    Script Date: 8/15/2022 9:38:05 PM ******/
ALTER TABLE [dbo].[Account] ADD UNIQUE NONCLUSTERED 
(
	[account_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__Account__AB6E6164A0282075]    Script Date: 8/15/2022 9:38:05 PM ******/
ALTER TABLE [dbo].[Account] ADD UNIQUE NONCLUSTERED 
(
	[email] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__Account__EA162E118EE8EB07]    Script Date: 8/15/2022 9:38:05 PM ******/
ALTER TABLE [dbo].[Account] ADD UNIQUE NONCLUSTERED 
(
	[account] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
/****** Object:  Index [UQ__Employee__C52E0BA99277CD1D]    Script Date: 8/15/2022 9:38:05 PM ******/
ALTER TABLE [dbo].[Employee] ADD UNIQUE NONCLUSTERED 
(
	[employee_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Account]  WITH CHECK ADD  CONSTRAINT [FK_1] FOREIGN KEY([Employeemployee_id])
REFERENCES [dbo].[Employee] ([employee_id])
GO
ALTER TABLE [dbo].[Account] CHECK CONSTRAINT [FK_1]
GO
USE [master]
GO
ALTER DATABASE [CMS] SET  READ_WRITE 
GO
